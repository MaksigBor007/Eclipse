package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		
		
		int day=3;
		String name;
	if (day==1) {
	name="Mondau";
	}else if(day==2){
	name="Tuesday";
	}else if(day==3){
	name="Wednesdey";
	}else if(day==4){
	name="Thursday";
	}else if(day==5){
	name="Friday";
	}else if(day==6){
	name="Saturday";
	}else if(day==7){
	name="Sunday";
	}else {
		name="InvaLid";
	}
	System.out.println(name);
switch(day) //switch is a value based statement
{
case 1:
	name="Monday";
	break;
case 2:
	name="Tuesday";
	break;
case 3:
	name="Wednesday";
	break;
case 4:
	name="Thursday";
	break;
case 5:
	name="Friday";
	break;
case 6:
	name="Saturday";
	//break;
case 7:
	name="Sunday";
	break;
	default:   // default works the same as ELSE statement
		name="InvaLid";
		break;
}
System.out.println(name);
}
}