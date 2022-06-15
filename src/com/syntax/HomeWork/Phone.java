package com.syntax.HomeWork;

public class Phone {

	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
	
	String brand;
	String color;
	String model;
	String OperatingSystem;
	String Camera;
	String CPU;
	
	void ReceivinText() {
		System.out.println("The phone is able to make a calls and receive a text messages");
	}

	void Connecting() {
		System.out.println("The Phone is able to connecting to wife");
	}
	void VideoCapture (){
		System.out.println("The phone is able to making videos");
	}
	
	public static void main(String[] args) {
		
	Phone Iphone=new Phone();
	Iphone.brand="Apple Iphone";
	Iphone.color="Red Product";
	Iphone.OperatingSystem="IOS";
	Iphone.CPU="A15 Bionic";
	Iphone.Camera="12MP";
	Iphone.model="13";
	System.out.print(Iphone.brand);System.out.print(" ");
	System.out.println(Iphone.model);
	Iphone.ReceivinText();
	Iphone.Connecting();
	Iphone.VideoCapture();
	
	
	Phone Pixel=new Phone();
	Pixel.brand="Google Pixel";
	Pixel.color="Just Black";
	Pixel.OperatingSystem="Android";
	Pixel.CPU="Snapdragon 765G";
	Pixel.Camera="12.2MP";
	Pixel.model="4A 5G";
	System.out.print(Pixel.brand);System.out.print(" ");
	System.out.println(Pixel.model);
	Pixel.Connecting();
	Pixel.ReceivinText();
	Pixel.VideoCapture();
	
	
	
	Phone Samsung=new Phone();
	Samsung.brand="Samsung";
	Samsung.color="Burgundy";
	Samsung.OperatingSystem="Android";
	Samsung.CPU="Snapdragon 8 Gen 1";
	Samsung.Camera="108MP";
	Samsung.model="Galaxy S22 Ultra";
	System.out.print(Samsung.brand);System.out.print(" ");
	System.out.println(Samsung.model);
	Samsung.Connecting();
	Samsung.ReceivinText();
	Samsung.VideoCapture();
	
	
	
	
}
}
