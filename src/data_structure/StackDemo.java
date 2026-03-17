package data_structure;

public class StackDemo {

	public static void main(String[] args) {
//		AStack<Integer> astack = new AStack<>();
//
//		astack.push(10);
//		astack.push(20);
//		astack.push(30);
//		
//		System.out.println(astack.peek());
//		
//		while(!astack.isEmpty()) {
//			System.out.println(astack.pop() + "이 제거되었습니다.");
//		}
		
		System.out.println("List로 구현한 stack의 동작");
		
		LStack<Integer> lstack = new LStack<>();

		lstack.push(10);
		lstack.push(20);
		lstack.push(30);
		
		System.out.println(lstack.peek());
		
		while(!lstack.isEmpty()) {
			System.out.println(lstack.pop() + "이 제거되었습니다.");
		}
	}

}
