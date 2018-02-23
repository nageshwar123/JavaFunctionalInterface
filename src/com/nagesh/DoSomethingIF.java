package com.nagesh;
@FunctionalInterface
public interface DoSomethingIF {
	public void doSomething();
	public int hashCode();
	public boolean equals(Object obj);
	public default void doSomeOtherThing() {
		System.out.println("DoSomethingIF.doSomeOtherThing()...");
	}

}
 