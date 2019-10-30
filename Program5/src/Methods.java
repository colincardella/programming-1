// Project:	Program5
// Author:	Colin A Cardella
// GitHub:	ccardella
// Description:	
// Date: Oct/18/19
// Version:	1.0

//importing the scanner

import java.util.Scanner;
public class Methods {
public static void main(String[] args) {
		// TODO Auto-generated method stub
//start keyboard and put variables 
	Scanner keyboard = new Scanner(System.in);
	int menuChoice = 0;
	int touchdown = 0;
    int fieldgoal = 0;
    int Saftey = 0;
    int totalPoints = 0;
 do 
 { 
 mainMenu();
 menuChoice = keyboard.nextInt();
 switch (menuChoice)
 {
 case 1:
	displaytotalPoints(totalPoints); 
	 break;
	 
	 
 case 2:
 System.out.println("If the ball is in the endzone dd 6 points?");
 touchdown = keyboard.nextInt();
 totalPoints = touchdown(touchdown,totalPoints);
break;

 case 3:
System.out.println("Did the ball get kicked through the goal post? If so then add 3 points");
fieldgoal = keyboard.nextInt();
totalPoints = fieldgoal(fieldgoal,totalPoints);
 break;

 case 4: 
 System.out.println("Did the ball carrier get tackled in his endzone? then add 2 points.");
 Saftey = keyboard.nextInt();
totalPoints = Saftey(Saftey,totalPoints);
 break;
 
 case 5:
	 System.out.println("Thank you Scorekeeper");
	 break;
 default :
	 System.out.println("Error...Error....");
 }
 }while (menuChoice != 4);
//close keyboard
keyboard.close();
}
//Method to display menu
public static void mainMenu()
{
	System.out.println("MainMenu");
	System.out.println("========");
	System.out.println("1.)Check Score.");
	System.out.println("2.)Touchdown.");
	System.out.println("3.)Fieldgoal.");
	System.out.println("4.)Saftey.");
	System.out.println("How did they score points?");
}
//Method to perform Score keeping
public static int touchdown(int touchdown, int totalPoints) 
{
return (touchdown+totalPoints);

}
//method to keep field goal
public static int fieldgoal(int fieldgoal, int totalPoints)
{
return(fieldgoal+totalPoints);

}
public static int Saftey(int Saftey, int totalPoints)
{
return (Saftey+totalPoints);
}
//method to show score
public static void displaytotalPoints(int totalPoints) 
{
	System.out.println("The score is: " + totalPoints);
}
}