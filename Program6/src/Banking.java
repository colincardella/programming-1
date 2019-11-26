import java.util.Scanner;

public class Banking {
	
	
	public double balance = 0.00;
	public int menuChoice;
	public double withdrawalAmount = 0.00;
	public double depositAmount = 0.00;
	public void displayMenu()
	{
		System.out.println("Main Menu");
		System.out.println("=========");
		System.out.println("1.) Make Depoist");
		System.out.println("2.) Withdrawl Funds");
		System.out.println("3.) View Balance");
		System.out.println("4.) Exit");
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
	public void menu()
	{

		// TODO Auto-generated method stub
//start keyboard and declare variables
	Scanner keyboard = new Scanner(System.in);
	
	
	do
	{
	displayMenu();
menuChoice = keyboard.nextInt();
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
	System.out.println("Thank you - have a great day! ");
	break;
	default: 
		System.out.println("that is an invalid choice Please re-enter an option");
}

	
	}while(menuChoice !=4);
		
	
	}
}
