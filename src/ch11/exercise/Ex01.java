package ch11.exercise;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Animal("나비"));
		animals.add(new Animal("다람쥐"));
		animals.add(new Animal("라마"));
		System.out.println("===================== for-each =====================");
		for(Animal animal : animals) {
			if(animal.name.length() == 2) System.out.println(animal);
		}
		
		System.out.println("===================== stream =====================");
		animals.stream()
				.filter(animal -> animal.name.length() == 2)
				.forEach(System.out::println);
	}

}

class Animal {
	String name;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	
}
