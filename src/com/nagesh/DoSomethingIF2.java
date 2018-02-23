package com.nagesh;
@FunctionalInterface
public interface DoSomethingIF2 {
	public void doSomething();
	public default void doSomeOtherThing() {
		System.out.println("DoSomethingIF.doSomeOtherThing()...");
	}

}
