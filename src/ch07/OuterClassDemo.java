package ch07;

import ch07.OuterClass.InnerInterface;

public class OuterClassDemo {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		//instanceClass
		OuterClass.InstanceMemberClass innerObject = outerClass.new InstanceMemberClass();
		
		//staticClass
		OuterClass.StaticMemberClass staticClass = new OuterClass.StaticMemberClass();
		
		//instanceClass implements InnerInterface
		OuterClass.InnerInterface innerInterface = new OuterClass().new InterImplClass();
	}

}

class OuterClass {
	
	PrivateClass priClass;// = new PrivateClass();
	
	public OuterClass() {
		priClass = new PrivateClass();
	}
	
	static class StaticMemberClass {
		
	}
	
	class InstanceMemberClass {
		
	}
	
	interface InnerInterface {
		void action();
	}
	
	class InterImplClass implements InnerInterface {

		@Override
		public void action() {
			System.out.println("action");
		}
		
	}
	
	
	private class PrivateClass {
		
	}
	
	void method1() {
		class LocalClass {
			
		}
	}
	
	void method2() {
		class LocalClass {
			
		}
	}
}
