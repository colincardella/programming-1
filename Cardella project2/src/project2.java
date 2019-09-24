import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Activates scanner
		Scanner scanner = new Scanner(System.in);
			//declaring variables 
		    int num1;
			int num2;
			int num3;
			// keeping there numbers
			System.out.print("What is your first number? ");
			num1 = scanner.nextInt();
			System.out.print("What is your second number? ");
			num2 = scanner.nextInt();
			System.out.print("What is your third number? ");
			num3 = scanner.nextInt();
			// Making the menu
			System.out.println("Dashboard");
			System.out.println("\t 1) Add");
			System.out.println("\t 2) Subtract");
			System.out.println("\t 3) Divide");
			System.out.println("\t 4) Multiply");
			System.out.println("\t 5) Exit!");
			System.out.print("Menu Choice? ");
			int choice = scanner.nextInt();
			int result = 0; 
			switch(choice) {
	        //Doing there menu choice
			case 1:
				result = num1 + num2; 
	        	System.out.println("your numbers added together equal: " + result ); 
	        	break;
	        case 2: 
	        	result = num1 - num2;
	        	System.out.println("your numbers subtracted from eachother equals: " + result);
	        	break;
	        case 3:
	        	result = num1 / num2;
	        	System.out.println("your numbers divided together equals: " + result);
	        	break;
	        case 4:
	        	result = num1 * num2;
	        	System.out.println("your number multiplied together equals: " + result);
	        	break;
	        case 5:
	        	return;
	        	// closes the program
			}
			// its comparing the reuslt to the third number and saying the appropriate response
			if (result > num3) {
	        	System.out.println("Result is greater then the third number");
	             } else {
	             System.out.println("Result was not greater then the third number");
	             
	            	 
	       
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
			}
			
			
			
			
			
	}

}
