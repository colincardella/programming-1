
//Author Colin
//Date Nov 11
//Program kick the can
//Github colincardella
//verion 1
import java.util.Random;
import java.util.Scanner;
public class Kickthecan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize the keyboard, random number gen, and variables.
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		int[] key = new int[5];
		int menuChoice = 0;
		int number;
		int arraySize; 
		// description of my game
		System.out.println("This is kick the can!");
		System.out.println("The name of the game is to kick the can into the other teams goal.");
		System.out.println("There is no limit to innings you can go as long as you want.");
		System.out.println("How many rounds do you want to play?");
		arraySize = keyboard.nextInt();

		//declare more variables and collect input also getting my number choice
		int[] score1 = new int[arraySize];
		int[] score2 = new int[arraySize];
		int totalScore1 =0;
		int totalScore2 =0;

		for(int i = 0;i<arraySize;i++)
		{
			score1[i] = rnd.nextInt(99);
			score2[i] = rnd.nextInt(99);
			System.out.println(score1[i] + " " + score2[i]);
		}
		for(int j = 0; j<arraySize; j++)
		{
			totalScore1 = totalScore1 + score1[j];
			totalScore2 = totalScore2 + score2[j];
		}
		System.out.println("======");
		if (totalScore1 > totalScore2)
		{
			System.out.println("Team 1 won!");
		}
		else
		{
			System.out.println("Team 2 won!!");
		}

	}


}
