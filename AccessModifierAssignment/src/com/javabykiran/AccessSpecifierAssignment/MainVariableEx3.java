package com.javabykiran.AccessSpecifierAssignment;

import AccessModifierAssignmentPack2.Checkprotected;

public class MainVariableEx3 {
	public static void main(String[] args) {
		Checkprotected a=new Checkprotected();
		System.out.println(a.data1);
		//a.msg();
		a.msg();
		a.msg1();
	}

}