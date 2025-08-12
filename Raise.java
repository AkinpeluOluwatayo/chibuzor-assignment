import java.util.Scanner;
	public class Raise {
	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

        System.out.println("Enter num");
	double num1 = input.nextDouble();

	 System.out.println("Enter raise");
	double raiseTo = input.nextDouble();


	double power = Math.pow(num1, raiseTo );
   
	System.out.println(num1  +  "raised to power" +   raiseTo + "is"   + power); 







  }
}