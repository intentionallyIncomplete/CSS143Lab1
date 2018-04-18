import java.util.Scanner;

public class StandAlonePrograms {

	Scanner keyboardInput = new Scanner(System.in);
	private int theNumber;
	private int numberFactorial = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StandAlonePrograms sap = new StandAlonePrograms();
		System.out.println(sap.userInput());
		System.out.println(sap.factorialOfNum());
	}
	
	public int userInput(){
		
		System.out.println("Enter the number");
		theNumber = keyboardInput.nextInt();
		return theNumber;
	}
	
	//factorial function
	public int factorialOfNum(){
		
		for(int i=1;i<=theNumber;i++){
			numberFactorial = i * numberFactorial;
		}
		return numberFactorial;
	}
}
