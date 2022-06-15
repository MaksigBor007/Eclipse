package com.syntax.HomeWork;

public class Dog2 {

	
	/*
	 * Create a Dog Class and create 3 different objects of it: 
	 * Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	 */
	
	String breed;
	int age;
	String color;
	
	
	void FetchesToy (){
		System.out.println("The dog fetches toys");
	}
	void Bark () {
		System.out.println("The dog is berking at intruders");
	}
	void Walks () {
		System.out.println("The dog likes walks");
	}
	
	public static void main(String[] args) {
		
	Dog2 Husky=new Dog2();
	Husky.age=2;
	Husky.breed="Husky";
	Husky.color="White";
	System.out.print(Husky.breed);System.out.print(" ");
	System.out.println(Husky.color);
	Husky.Bark();
	Husky.FetchesToy();
	Husky.Walks();
	
	
	
	Dog2 Bulldog=new Dog2();
	Bulldog.age=5;
	Bulldog.breed="Bulldog";
	Bulldog.color="Brown";
	System.out.print(Bulldog.breed);System.out.print(" ");
	System.out.println(Bulldog.color);
	Bulldog.Bark();
	Bulldog.FetchesToy();
	Bulldog.Walks();
	
	
	Dog2 Labrador=new Dog2();
	Labrador.age=9;
	Labrador.breed="Labrador";
	Labrador.color="Black";
	System.out.print(Labrador.breed);System.out.print(" ");
	System.out.println(Labrador.color);
	Labrador.Bark();
	Labrador.FetchesToy();
	Labrador.Walks();
}
}