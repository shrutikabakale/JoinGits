package com.javabykiran.AccessSpecifierAssignment;

public class AccessDemo {
	private int x=56;
	public void showDemo(){
		System.out.println("The Variable value is"+x);
		
	}
	private void testDemo(){
		
		System.out.println("it cant be accessed in another class");
	}
  

}
