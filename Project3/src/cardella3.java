import java.util.Scanner; 
public class cardella3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//starting the keyboard
	Scanner	keyboard = new Scanner(System.in);
	//name and number
	String name;
	int number;
	//keeping there name and number
	System.out.println("What is your name? "); 
	name = keyboard.next();
	System.out.println("Pick a number 1-100? "); 
	number = keyboard.nextInt();
	//validate the input with a while loop
	while (number < 0 || number > 100)
	{
		System.out.println(" Your number is wrong! PLEASE PICK A NUMBER 1-100!");
		number = keyboard.nextInt();
	}
	System.out.println("Thanks for picking a number 1-100, " + name);
	System.out.println(" Counting down from " + number);
	for(int i = 0; number>i; number--) {
	System.out.println("Your countdown starts now!" + number);
	}
	System.out.println("You made it to the bottom");
	
	
	}
	
}


