package ch10;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
		
		
		
		//디젤 자동차만 모두 찾아보자
//		Car.cars.stream().filter(e -> e.)
		ArrayList<Car> diesel = (ArrayList<Car>) findCars(Car.cars, c -> !c.isGasoline()); 
		
		// 10년보다 오래된 자동차만 모두 찾아보자.
		ArrayList<Car> oldCars = (ArrayList<Car>) findCars(Car.cars, c -> c.getAge() > 10);
		
		// 10년보다 오래된 가솔린 자동차만 모두 찾아보자.
		ArrayList<Car> oldGasoline = (ArrayList<Car>) findCars(Car.cars, c -> c.isGasoline() && c.getAge() > 10);
		
		System.out.println("=================== 디젤 ===================");
//		diesel.forEach(e -> System.out.println(e));
		Repeat(diesel, System.out::println);
		
		System.out.println("================== 10년보다 오래된 자동차 ================");
		Repeat(oldCars, System.out::println);
		
		System.out.println("================== 10년보다 오래된 가솔린 ====================");
		Repeat(oldGasoline, System.out::println);
	}
	
	
	
	public static List<Car> findCars(List<Car> cars, CarPredicate predicate) {
		ArrayList<Car> passCar = new ArrayList<>();
		
		for(Car car: cars) {
			if(predicate.test(car) == true) {
				passCar.add(car);
			}
		}
		
		return passCar;
	}
	
	public static void Repeat(List<Car> carList, CarConsumer consumer) {
		for(Car car: carList) {
			consumer.apply(car);			
		}
	}

}
