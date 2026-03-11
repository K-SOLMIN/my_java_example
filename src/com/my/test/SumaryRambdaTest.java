package com.my.test;

public class SumaryRambdaTest {
	public static void main(String[] args) {
		//OuterClass2.InnerClass inner = new OuterClass2().new InnerClass(3);
		//System.out.println(inner.getOutInt());
		
//		OuterInterface outer = new OuterInterface() {
//
//			@Override
//			public void force() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
	}
}

class OuterClass2 {
	private int outInt;
	//private String outStr;
	
	private
	
	class InnerClass {
		public InnerClass(int num) {
			outInt = num;
		}
		
		public int getOutInt() {
			return outInt;
		}
	}
	
	
		
	
}

//interface OuterInterface {
//	void force();
//	
//	class Once {
//		@Override
//		public void force() {
//			System.out.println("extends");
//		}
//	}
//}
