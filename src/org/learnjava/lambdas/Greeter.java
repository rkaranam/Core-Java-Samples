package org.learnjava.lambdas;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public void greet() {
		System.out.println("Hello, World!");;
	}
	
	public static void hello() {
		System.out.println("Hello");
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.greet();
		greeter.hello();
		
		ChristmasGreeting christmasGreeting = new ChristmasGreeting();
		greeter.greet(christmasGreeting);
		
		NewYearGreeting newYearGreeting = new NewYearGreeting();
		greeter.greet(newYearGreeting);
	}

}
