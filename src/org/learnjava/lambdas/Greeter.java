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
		
		// Passing behavior in OOP
		ChristmasGreeting christmasGreeting = new ChristmasGreeting();
		greeter.greet(christmasGreeting);
		
		NewYearGreeting newYearGreeting = new NewYearGreeting();
		greeter.greet(newYearGreeting);
		
		GreetLambda greetLambdaFunction = () -> System.out.println("Hello, Lambda Expressions!");
		greetLambdaFunction.foo();
		
		Greeting greetingFunctionInnerClass = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello, Annonymous Inner Class!");
			}
		};
		greetingFunctionInnerClass.perform();
		
		Greeting greetingFunction = () -> System.out.println("Enjoy your work!");
		greetingFunction.perform();
	}	

}

interface GreetLambda {
	void foo();
}
