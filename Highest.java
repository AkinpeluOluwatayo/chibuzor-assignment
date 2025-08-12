import java.util.Scanner;
	public class Highest {
	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter num");
	int num1 = input.nextInt();

	System.out.print("Enter num");
	int num2 = input.nextInt();

	System.out.print("Enter num");
	int num3 = input.nextInt();


	int Highest = num2;
	int lowest = num3;

	if (num1 > Highest) Highest = num1;
	if (num3 > Highest) Highest = num3;

	if (num1 < lowest) lowest = num1;
	if (num2 < lowest) lowest = num2;

	System.out.println("The highest is: " + Highest);
	System.out.print("The lowest is: " + lowest);

}
}

	