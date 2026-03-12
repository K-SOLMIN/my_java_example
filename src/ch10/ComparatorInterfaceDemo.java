package ch10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceDemo {
	public static void main(String[] args) {
		List<Car> list = Car.cars.subList(3, Car.cars.size()); //3번부터 6번이전(포함x)
		Comparator<Car> modelComparator = Comparator.comparing(Car::getModel);
		Comparator<Car> ageComparator = Comparator.comparing(Car::getAge);
		Comparator<Car> mileComparator = Comparator.comparing(Car::getMileage);
		
		System.out.println(list.size());
		
		Car[] cars = list.toArray(new Car[list.size()]);
		
		System.out.println(Arrays.toString(cars));
		
		// ===================== 오름차순 ==========================
		Arrays.sort(cars, modelComparator);
		System.out.println("model명 오름차순 : " + Arrays.toString(cars));
		
		Arrays.sort(cars, ageComparator);
		System.out.println("연식 : " + Arrays.toString(cars));
		
		Arrays.sort(cars, mileComparator);
		System.out.println("달린거리 : " + Arrays.toString(cars));
		
		// ======================= 내림차순 ===========================
		Arrays.sort(cars, mileComparator.reversed());
		System.out.println("달린거리 : " + Arrays.toString(cars));
		
		String[] strArr = {"c", "a", "b"};
		Arrays.sort(strArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
	}
}
