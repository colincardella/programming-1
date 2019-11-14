//title program 8
//author Colin Cardella
//Description grade report and files
//last modified november 12
//github colincardella
//version 1.0

//import code
import java.io.*;
import java.util.Scanner;



public class Inputoutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Open file for use

		File fw = new File("/Users/colincardella/Desktop/grades.txt");	
		Scanner inputFile = new Scanner(fw);

		//open / create output file
		FileWriter tempFile = new FileWriter("/Users/colincardella/Desktop/gradereport.txt");
		PrintWriter outputFile = new PrintWriter(tempFile);
		//create variable
		int totalGrade = 0;
		int total = 0;
		//loop throught input file
		while(inputFile.hasNext())
		{
			char category = inputFile.next().charAt(0);
			double categoryAmount = inputFile.nextDouble();
			switch(category)
			{
			case 'A':
				total+=categoryAmount;
				totalGrade++;
				break;
			case 'B':
				total+=categoryAmount;
				totalGrade++;
				break;
			case 'C':
				total+=categoryAmount;
				totalGrade++;
				break;
			case'D':
				total+=categoryAmount;
				totalGrade++;
				break;
			case'F':
				total+=categoryAmount;
				totalGrade++;
				break;
			}
		}

			//Output to grade
			outputFile.println("Grade Statistics");
			outputFile.println("=======");
			outputFile.println("Total:" + total);
			outputFile.println("Number of grades:" + totalGrade);
			outputFile.println("Average: " + (total/totalGrade) + "%");
			//close file
			outputFile.close();
			inputFile.close();

	}
}
