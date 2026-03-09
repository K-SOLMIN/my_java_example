package ch07;

public class AnimalDemo {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		//Animal animal = cat;
		//Animal animal2 = dog;
		
		makeSound(cat);
		makeSound(dog);
	}


	public static void makeSound(Animal animal) {
		animal.sound();
		
		if(animal instanceof Dog dog) {
			dog.walking();
		}
	}
}

/**
 * 소리를 내는 동물의 경우에 활용할 수 있는 interface
 * @param no parameter
 * @return no return
 * @exception no Exception
 */
interface Animal {
	void sound();
}

class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("왈");
	}
	
	public void walking() {
		System.out.println("산책을 한다.");
	}
	
}

class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}


