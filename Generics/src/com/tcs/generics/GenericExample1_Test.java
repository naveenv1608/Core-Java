package com.tcs.generics;

public class GenericExample1_Test {

	public static void main(String[] args) {
		GenericExample1<Integer,Integer> g1=new GenericExample1<Integer,Integer>(1,3);
		GenericExample1<Integer,String> g2=new GenericExample1<Integer,String>(1,"Naveen");
		GenericExample1<Float,Double> g3=new GenericExample1<Float,Double>(1.0f,3.000d);
	}

}
