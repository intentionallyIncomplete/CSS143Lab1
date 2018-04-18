import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SecondSAP {

	Scanner keyboardInput = new Scanner(System.in);
	private int n;
	private int d;
	private int gcd;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		SecondSAP ssap = new SecondSAP();
		
		ssap.userInput();
		//System.out.println(ssap.findGCD(6));
		//System.out.println(ssap.findGCD(4));
		//System.out.println(ssap.findGCD(3));
		//System.out.println(ssap.findGCD(2));
		//System.out.println(ssap.findGCD(1));
		//System.out.println(ssap.findGCD(11)); //will return false
		
		PrintWriter writer = new PrintWriter("myData2.txt");
		
		writer.println(ssap.findGCD(6));
		writer.println(ssap.findGCD(5)); //will return false
		writer.println(ssap.findGCD(4));
		writer.println(ssap.findGCD(3));
		writer.println(ssap.findGCD(2));
		writer.println(ssap.findGCD(1));
		writer.flush();
		writer.close();
	}
	public int userInput(){
		
		System.out.println("Enter the number");
		n = keyboardInput.nextInt();
		return n;
	}
	
	public boolean findGCD(int d){
		
		if(n % d == 0){
			return true;
		}
		else if(n % d != 0){
			return false;
		}
		return false;
	}
}
