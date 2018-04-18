import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Ian Bryan
 *
 */
public class ArrayReviewPractice {
	
	private int arraySum;
	private double arrayAverage;
	private int theTarget;
	private int sumOfPosNums;
	
	Scanner keyboardInput = new Scanner(System.in);
	
	//Write a new main and declare an array of integers
	public static void main(String[] args) throws IOException{
		
		int[] data = {3,1,-8,4,-5,2};
		
		ArrayReviewPractice arp = new ArrayReviewPractice();
		//System.out.println(arp.sum(data));
		//System.out.println(arp.averageTheElements(data));
		//System.out.print(arp.indexOf(data, 3));
		
		//The modulo was not returning the correct values
		//I tested this by simply querying the method call with an
		//index to show the return value of.
		//System.out.println(arp.positiveSum(data));
		//arp.populateArray(data);
		
		PrintWriter writer = new PrintWriter("myData.txt");
		
		//Write the contents of the array to a file
		//all on one line separated by a comma
		for(int a=0;a<data.length;a++){
			writer.print(data[a]);
			writer.print(",");
		}
		//Write the sum of the array to the file on the next line
		writer.println();
		writer.println(arp.sum(data));
		//write the average of the array to the third line
		writer.println(arp.averageTheElements(data));
		writer.close();
		
		//make a new main that reads the contents of this file and prints
		//it to the console
		BufferedReader myDataFile = new BufferedReader(new FileReader("myData.txt"));
		String line = myDataFile.readLine();
		while(line != null){
			System.out.println(line);
			line = myDataFile.readLine();
		}
		myDataFile.close();
	}//end main
	
	//Write a separate function to sum the contents of an array
	public int sum(int[] data){
		
		for(int i=0;i<data.length;i++){
			
			arraySum = data[i] + arraySum;
		}
		return arraySum;
	}//end sumTheElements
	
	//Find the average of the function above
	public double averageTheElements(int[] data){
		
		for(int j=0;j<data.length;j++){
			
			arrayAverage =  ((double)arraySum) / data.length;
		}
		return arrayAverage;
	}
	
	//Write a function to find the index of a specified element
	public int indexOf(int[] data, int theTarget){
		int indexVal = -1;
		for(int i=0;i<data.length;i++){
			if(theTarget == data[i]){
				indexVal = i;
				break;
			}
		}
		return indexVal;
	}
	
	//Write a function to sum only the positive integers in the array
	public int positiveSum(int[] data){
		
		for(int j=0;j<data.length;j++){
			
			if(data[j] % 2 >= 1){
				j++;
			}else if(data[j] % 2 == 0){
				sumOfPosNums += data[j];
			}
		}
		return sumOfPosNums;
	}
	
	//Write a function to populate an int array
	//with values obtained from the console
	public void populateArray(int[] data){
		
		for (int i = 0; i < data.length; i++)
	    {
	        System.out.println("Enter some integers");
	        data[i] = keyboardInput.nextInt();
	    }
		for(int k=0;k<data.length;k++){
			System.out.println(data[k]);
		}
	}
}
