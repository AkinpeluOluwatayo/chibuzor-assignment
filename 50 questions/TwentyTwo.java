import java.util.Scanner;
  public class TaskTwentyTwo{
     public static void main(String[] args){

      Scanner input = new Scanner(System.in);

         System.out.println("Enter Number: ");
	 int userInput = input.nextInt();

	for(int index = 1; index <= 12; index++){
	
	 int multiply = index * userInput;

	System.out.println(userInput + " * " + index + " = " + multiply);
	
	}




}
}