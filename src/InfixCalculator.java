import java.util.Scanner;


public class InfixCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner keyboardInput = new Scanner(System.in);
		//System.out.println("Enter a calculation");
		//int theProblem = keyboardInput.nextInt();
		//int answer = calculate(keyboardInput);
		//System.out.println("The answer is: " + answer);
		
		String theProblem = "1+2+3";
		InfixCalculator infix = new InfixCalculator();
		infix.calculate(theProblem);
	}
	
	public void calculate(String theProblem){
		
		int lhs, rhs;
//		char mathOperatorPlus = '+';
//		char mathOperatorDiv = '/';
//		char mathOperatorMult = '*';
//		char mathOperatorMinus = '-';
		char mathOperator;
		char[] mathOperators = {'+','-','*','/'};
		
		String[] numbers = theProblem.split("\\b");
		for(String number : numbers){
			//System.out.println(number);
			
			if()
		}
		
		
		//return lhs;
	}

}
