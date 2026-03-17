package data_structure;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		SLinkedList<Integer> list = new SLinkedList<>();
		
		System.out.println("size : " + list.size());
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		System.out.println("LinkedList : " + list);
		
		System.out.println("get index : " + list.get(2));
		
		System.out.println(list.remove()); //removeFisrt() 와 유사 맨 앞에꺼 지움
//		System.out.println(list.remove());
//		System.out.println(list.remove());
		
		System.out.println("LinkedList : " + list);
		
	}

}
