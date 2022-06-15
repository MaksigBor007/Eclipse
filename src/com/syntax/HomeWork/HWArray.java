package com.syntax.HomeWork;

public class HWArray {

	public static void main(String[] args) {
		String[] cars=new String[6];
		  
		  cars[0]="mini";
		  cars[1]="ferrari"; 
		  cars[2]="audi";
		  cars[3]="kia";
		  cars[4]="mercedes";
		  cars[5]="huyndai";
			  
			  
			  
			  System.out.println(cars[3]+" "+cars[0]+" "+cars[1]+" "+cars[2]+" "+cars[4]+" "+cars[5]);
		  
			  
			  String[] car= {"mini","ferrari","audi","kia","imercedes","huyndai"};
			  
			  for(int i=0;i<car.length;i++) {
				  System.out.println(car[i]+" ");
			  }

System.out.println("-----------------------");
String[] animal=new String[5];

animal[0]="Cow";
animal[1]="Dog";		  
animal[2]="Cat";
animal[3]="Bull";
animal[4]="Banny";		
		
System.out.println(animal[0]+" "+animal[1]+" "+animal[2]+" "+animal[3]+" "+animal[4]);
System.out.println("---------------------------------------------");

for (String animals:animal) {
	  System.out.println(animals+" ");
}
System.out.println("------------------------------------");

for (int i=0;i<animal.length;i++) {
	  System.out.println(animal[i]+" ");
}

double[]d =new double[3];

d[0]=20.99;
d[1]=13.99;		  
d[2]=11.99;		
		
System.out.println(d[0]+" "+d[1]+" "+d[2]);
System.out.println("---------------------------------------------");

for (double d2:d) {
	  System.out.println(d2+" ");
}
System.out.println("------------------------------------");

for (int i=0;i<d.length;i++) {
	  System.out.println(d[i]+" ");
}

System.out.println("-----------------------------");
// calculate sum of array
int[]num = {100,50,150};
int sum=0;
for(int i=0;i<num.length;i++) {
	  sum+=num[i];

}  System.out.println(sum);


//another way to do calculation of numbers

sum=0;//re-assigning the value
for(int num2:num) {
	
	sum+=num2;
}System.out.println(sum);

			  
			  
			  
			  
}
}
