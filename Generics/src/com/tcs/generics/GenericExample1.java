package com.tcs.generics;

public class GenericExample1<A,B> {
     A a;
     B b;
	public GenericExample1(A a, B b) {
		
		this.a = a;
		this.b = b;
		
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);

	}
     
    	 
}
