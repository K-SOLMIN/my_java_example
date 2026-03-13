package ch11;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		//stack은 index로 add는 안되는건 아닌데 stack의 본질을 잃어버리니 하지말자
		//stack은 index가 1부터 시작이 되고, 1이 가장 위에 존재하는 항목, 1부터 지우고, 새로 추가된 항목의 인덱스가 1이 된다.(제일 마지막에 들어온애가 무조건 1번)
		Stack<String> stack = new Stack<>();
		
//		stack.add(0, "add zero");
//		stack.add("stack add");
//		stack.push("stack push");
		
		//emptyStackException발생 empty인 경우가 많으므로
		//조건문으로 empty()여부를 확인해야한다.
		if(!stack.empty()) { 
			stack.peek();
			stack.pop();
		}
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		//System.out.println(stack.indexOf("A") + ", " + stack.indexOf("B") + ", " + stack.indexOf("c"));
		
		//Stack.search(Element) 했을때 Element가 존재하지 않으면 -1 반환
		System.out.println(stack.search("A") + ", " + stack.search("B") + ", " + stack.search("C"));
	}
}
