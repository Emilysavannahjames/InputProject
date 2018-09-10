package controller;

import java.util.Scanner;

public class Controller
{
	public void start()
	{
		System.out.println("dog");
		
		questions(); 
	}
	
	private void questions()
	{
		System.out.println("What is your favorite color?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("What is the answer?");
		answer = inputScanner.nextLine();
		
		System.out.println(answer);
		
		System.out.println("what is the best type of food?");
		answer = inputScanner.next();
		
		System.out.println(answer);
		answer = inputScanner.next();
		System.out.println(answer);
		
		System.out.println("What's your favorite animal?");
		answer = inputScanner.next();
		System.out.println(answer);
		answer = inputScanner.next();
		System.out.println(answer);
		
		System.out.println("What is the opposite of up?");
		answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("Cat or dog?");
		answer = inputScanner.next();
		System.out.println(answer);
		answer = inputScanner.next();
		System.out.println(answer);
		
		
		//inputScanner.close();
		//closed because i am still using the InputStream from the key board and don't want errors
		
	}
	
	private void moreInput()
	{
		Scanner textScanner; //this is a declaration of a scanner variable.
		
		textScanner = new Scanner(System.in); //Initialization of the textScanner variable.
		
		System.out.println("Type in your favorite number");
		
		int userNumber = textScanner.nextInt();
		
		System.out.println("Your favorite number is: " + userNumber);
		
		System.out.println("Type some information");
		
		//need to call .nextLine() to consume the enter press after the call to .next, .nextInt, or .nextDouble
		String words = textScanner.nextLine();
		System.out.println(words);
		
		textScanner.close();
		
	}
	
	public boolean validInt(String sample)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(sample);
			isValid = true;
		}
		catch(NumberFormatException error) //the catch catches it
		{
			System.out.println("You need to type in a number.");
		}
		return isValid;
	}
	
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatExeption oops)
		{
			System.out.println("Only floating point values are accepted AKA a number with . in it");
		}
		return true;
	}
}
