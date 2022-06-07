package com.javabykiran.AccessSpecifierAssignment;

public class A {
	private void m1(){
		System.out.println("m1-privare");
	}
	void m2(){
		System.out.println("m2-default");
	}
	protected void m3(){   // A & B 
		System.out.println("m3-protected");
	}
	public void m4(){
		System.out.println("m4-public");
	}
	
  
}
