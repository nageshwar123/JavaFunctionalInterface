package com.nagesh;

public class DoSomething implements DoSomethingIF,DoSomethingIF2 {

	@Override
	public void doSomething() {
		System.out.println("DoSomething...");

	}
	@Override
	public void doSomeOtherThing() {
		System.out.println("DoSomething.doSomeOtherthing()..");
	}
	
	public static void main(String[] args) {
		DoSomethingIF2 doSomething = new DoSomething();
		doSomething.doSomething();
		doSomething.doSomeOtherThing();
		
	}

}
