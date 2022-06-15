package com.syntax.class11;

import java.util.Scanner;

public class Dog {


		//attributes how to object will look like
		String name;
		int age;
		double weight;
		String color;
		double height;
		String breed;
		
		//how that object behave
		void bark() {
			
			System.out.println("Dog barks");
		}
		void walks() {
			System.out.println("Dog wolks");
		}
		void eat() {
			System.out.println("Dog like to eat a bone");
		}
		
		public static void main(String[] args) {
		
		Dog pancho=new Dog();
		Scanner scan=new Scanner(System.in);//ctrl+click on windows 
		//scan.next();
		
		pancho.name="Jimy";//new Dog() how we create an object
		pancho.age=6;
		pancho.weight=16;
		pancho.color="Pink";
		pancho.height=2.6;
		pancho.breed="German";
		pancho.bark();
		
		
	}

}
