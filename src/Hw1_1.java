import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hw1_1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// prompts for user input of a file name
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the \".java\" file name: ");
		String inputFileName = in.next();
		
		// reads file given by user
		Scanner inputFile = new Scanner(new File(inputFileName));
		
		// creates PrintWriter obj to print to output file
		PrintWriter outputFile = new PrintWriter(new File(inputFileName + ".txt"));
		
		// while loop that writes the input file data to the output file
		int lineCounter = 0;
		while (inputFile.hasNextLine()) {
			String fileLine = inputFile.nextLine();
			outputFile.printf("%03d" + fileLine + "\n",lineCounter);
			lineCounter++;
		}
		
		// close input stream
		inputFile.close();
		
		// close output stream
		outputFile.close();

	}
}
