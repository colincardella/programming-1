// these 2 lines are for files and to start up the scanner
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Banking {
	// here is were I declared my variables for my banking account 
	int numbers = 0;
	public double balance = 0.00;
	public int menuChoice;
	public double withdrawalAmount = 0.00;
	public double depositAmount = 0.00;
	public void displayMenu() 
	{
		//this is the menu
		System.out.println("Main Menu");
		System.out.println("=========");
		System.out.println("1.) Make Depoist");
		System.out.println("2.) Withdrawl Funds");
		System.out.println("3.) View Balance");
		System.out.println("4.) Want a 2-d array?");
		System.out.println("5.) Exit");
		System.out.println("What would you like to do? ");
    }
	
	public void deposit(double dep)
	{ 	
		
		//double new Balance = 0.00
		//newBalance = bal+dep;
		//return(newBalance);
		this.setBalance(this.balance + dep);
	}
	public void withdrawal(double wit)
	{
		this.setBalance(this.balance - wit);
	}
	public void displayBalance()
	{
	System.out.println("Your balance is: $" + this.balance);
	
	// here is my first switch statement this is for the banking part.
	if (this.balance <0)
		System.out.println("You are at a negative balance.");
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getMenuChoice() {
		return menuChoice;
	}

	public void setMenuChoice(int menuChoice) {
		this.menuChoice = menuChoice;
	}

	public double getWithdrawalAmount() {
		return withdrawalAmount;
	}

	public void setWithdrawalAmount(double withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public void menu() throws FileNotFoundException
	{

		// TODO Auto-generated method stub
//start keyboard and declare variables
	Scanner keyboard = new Scanner(System.in);
	//variable for my day code 
    int day = 3;
    // this switch is my 2nd one and it holds the code that decides what day it will be 
    switch(day) {
    case 1:
    	System.out.println("Sunday");
    	break;
    case 2:
    	System.out.println("Monday");
    break;
    case 3:
    System.out.println("Tuesday");
    break;
    case 4:
    	System.out.println("Wednesday");
    break;
    case 5:
    	System.out.println("Thursday");
    	break;
    case 6:
    	System.out.println("Friday");
    	break;
    case 7: 
    	System.out.println("Saturday");
    	break;
    	default:
    		System.out.println("NOT A VALIDE NUMBER! Pick a number 1 through 7.");
    		
    	
    	
    }
    	// here is my first loop and this keeps the menu up and running until I hate 5
    do
		
	{
	displayMenu();
menuChoice = keyboard.nextInt();
// here is my 3rd switch and this is for the menu
switch(menuChoice)
{
case 1:
	System.out.println("How much would you like to deposit? ");
	depositAmount = keyboard.nextDouble();
	deposit(depositAmount);
	this.displayBalance(); 
	break;
case 2:
	System.out.println("How much would you like to withdrawal");
	withdrawalAmount = keyboard.nextDouble();
	this.withdrawal( withdrawalAmount);
	this.displayBalance();
	break;
	case 3:
	this.displayBalance();
	break;
	case 4:
		System.out.println("Here is your Array");
		int[][] numbers = {{8, 0, 8, 3}, {6, 55, 77, 00}, {1956, 8, 2000, 111111}};
		System.out.println(Arrays.deepToString(numbers));
		break;
	case 5:
	System.out.println("Thank you - have a great day! ");
	 File fr = new File("/Users/colincardella/Desktop/FinaleProject.txt");
     Scanner inputFile = new Scanner(fr);
     // Here is the code for the Input file and this while loop is my 2nd loop
   while (inputFile.hasNext())
     {
    	  String studentName = inputFile.nextLine();
          System.out.println(studentName);	 
     }
	inputFile.close();
	break;
	default: 
		System.out.println("that is an invalid choice Please re-enter an option");
}

	// this while is part of the do in the beginning of the code and if you hit 5 it stop the menu and causes the
    // input message to appear
	}while(menuChoice !=5);
	//this is the code for the count down	
	int number = 10;
	System.out.println("Thanks for Banking with us! When the countdown ends you have been logged out. ");
	System.out.println(" Counting down from " + number);
	// this is my third loop and is for the count down
	for(int i = 0; number>i; number--) {
	System.out.println("Your countdown starts now!" + number);
	}
	System.out.println("You have been logged out");
	
	 
	}
}
