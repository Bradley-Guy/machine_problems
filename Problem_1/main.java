package source;

import java.util.Scanner;  



public class main {



	public static void main(String[] args) {

		Calculator mycalc= new Calculator();

		Scanner myObj = new Scanner(System.in);

		while (true) {

		mycalc.setname("Group 25");

		System.out.println("Welcome to the Calculator designed by " +mycalc.getname());

		System.out.println("Enter A to add, S to Subtract, M to Multiply, and Q to quit");

		String opperation = myObj.nextLine().trim();

		if (opperation.equals("Q"))

			System.exit(0);

		else if(opperation.equals("A")) {

			;

		}

		else if(opperation.equals("M")) {

			;

		}

		else if(opperation.equals("S")) {

			;

		}

		else {

			continue;

		}

		

		System.out.println("Enter argument 1");

		String arg1 = myObj.nextLine();

		float arg1tf = 0;

		try {

			arg1tf= Float.parseFloat(arg1);

		} catch (Exception e){

			System.out.println("Invalid Input");

			continue;

		}

		

		

		System.out.println("Enter argument 2");

		String arg2 = myObj.nextLine();

		float arg2tf= 0;

		try {

			arg2tf= Float.parseFloat(arg2);

		} catch (Exception e){

			System.out.println("Invalid Input");

			continue;

		}

		

		switch(opperation) {

			case "A":

				System.out.println("The Sum of argument 1 and argument 2 is "+mycalc.addition(arg1tf, arg2tf));

				break;

				

			case "S":

				System.out.println("The Difference of argument 1 and argument 2 is "+mycalc.subtraction(arg1tf, arg2tf));



				break;

				

			case "M":

				System.out.println("The Product of argument 1 and argument 2 is "+mycalc.multiplication(arg1tf, arg2tf));

				break;		

				

		}

	

				

		}

		

		

		

	}



}

