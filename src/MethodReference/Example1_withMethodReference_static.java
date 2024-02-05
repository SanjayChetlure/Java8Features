package MethodReference;

@FunctionalInterface
interface I1
{
	void m1();

}

class Demo1 
{
	public static void test() 
	{
		System.out.println("implementation of m1-from I1");
	}
}


public class Example1_withMethodReference_static
{
	public static void main(String[] args) 
	{
		
		I1 obj=Demo1::test;            //className::methodname
		obj.m1();
	
		
		//::  -> it creates internally lambda expression
		//whatever logic we have present in test() that is implementation for m1() in I1
		//I1 obj = () -> {System.out.println("implementation of m1-from I1");};
		//signature of both method should be same with return type.
		
	}
}
