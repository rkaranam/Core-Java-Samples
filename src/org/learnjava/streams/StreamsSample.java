package org.learnjava.streams;

import java.util.Arrays;
import java.util.List;

class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
}

public class StreamsSample {
	
	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("Raja Sekhar", "Karanam", 27),
				new Person("Ramanujan", "Srinivasa", 39),
				new Person("Srikanth", "Pragada", 38),
				new Person("Koushik", "Kothagal", 36)
				);
		
		persons.stream()
				.filter(p -> p.getFirstName().startsWith("R"))
				.filter(p -> p.getAge() > 30)
				.forEach(p -> System.out.println(p));
	}
	


}
