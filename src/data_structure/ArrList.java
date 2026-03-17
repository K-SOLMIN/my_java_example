package data_structure;

import java.util.Arrays;

public class ArrList<T> {
	private T[] arr;
	private int size;

	public ArrList() {
		arr = (T[]) (new Object[2]); // arr.length = 2 <-- capacity
		size = 0; // 배열안에 담겨있는 항목의 숫자
	}

	// isEmpty(), size(), add(), remove(), toString()
	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public boolean add(T t) {
		if (arr.length == size) {
			// 배열의 크기를 length 만큼 증가 혹은 감소시킨다.
			// 기존배열의 값을 새로 만든 배열로 옮긴다.
			// 기존배열을 없애고 새로만든 배열을 a기 참조한다.
			// 배열의 사이즈를 2배 증가시킨다. <==== (1. 여기 구현해보고 자주 사용되는 내용이면 함수로 extract , 리팩토링하기)
//			T[] newArr = (T[]) new Object[arr.length * 2];
//			
//			for(int i = 0; i < arr.length; i++) {
//				newArr[i] = arr[i];
//			}
//
//			arr = newArr;
			
			resize(arr.length * 2);
			//expansionCapacity();
			

		}
		// 맨 마지막에 추가한다. <==== (1. 여기 구현해보기)
		// 배열에 담긴 데이터의 수, 즉 배열의 크기를 하나 증가한다. <==== (1. 여기 구현해보기)
		arr[size] = t;
		size++;
		return true;
	}

	public T remove(int index) {
		
		
		if(isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		
			// index에 있는 객체 항목을 지우기 전에 저장한다. <==== (2. 여기 구현해보기)
			// index에 있는 객체 항목을 지운다. 참조타입이므로 null 값을 할당한다.  <==== (2. 여기 구현해보기)
		 	// 배열의 크기를 하나 감소한다.
		T removed = arr[index];
		
		arr[index] = null;
		size--;
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		} capacity test code
		
		if(size > 0 && size <= arr.length / 4 ) {
		// 배열의 크기를 반으로 줄인다.
		// 기존배열의 값을 새로 만든 배열로 옮긴다.
		// 기존배열을 없애고 새로만든 배열을 a기 참조한다.
		// 위 세 줄의 내용을 실행할 함수가 만들어져있다면 해당 함수 호출을 통해 배열의 사이즈를 1/2 로 줄인다. <==== (2. 여기 구현해보기)
//			T[] newArr = (T[]) new Object[arr.length / 2];
//			
//			for(int i = 0; i < arr.length / 2; i++) {
//				newArr[i] = arr[i];
//			}
//
//			arr = newArr;
			
			resize(arr.length / 2);
		//reduceCapacity();
		}
	        
	     return removed;
	}
	
	private void resize(int length) {
		T[] newArr = (T[]) new Object[length]; //배열의 크기를 반으로 줄이거나 2배 증가시킨다.
		
		for(int i = 0; i < size; i++) {
			newArr[i] = arr[i];
		}

		arr = newArr;
	}
	
	public T get(int index) {
		return arr[index];
	}

	@Override
	public String toString() {
		String list = "";
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				list += arr[i];
			} else {
				list += arr[i] + ",";
			}
		}
		return "ArrList : [" + list + "]";
	}
	
//	private void expansionCapacity() {
//		T[] newArr = (T[]) new Object[arr.length * 2];
//		
//		for(int i = 0; i < newArr.length; i++) {
//			if(i < arr.length) {
//				newArr[i] = arr[i];
//			} else {
//				newArr[i] = null;
//			}
//		}
//		
//		arr = newArr;
//	}
//	
//	private void reduceCapacity() {
//		T[] newArr = (T[]) new Object[arr.length / 2];
//		
//		for(int i = 0; i < newArr.length; i++) {
//				newArr[i] = arr[i];
//		}
//		
//		arr = newArr;
//	}

}