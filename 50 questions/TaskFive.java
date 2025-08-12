import java.util.Scanner;
  public class TaskOne{
     public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter Number: ");
	int userInput = input.nextInt();

	if (userInput % 2 == 0){

        System.out.println("This is an even number");

	}else{

	
         System.out.println("This is an odd number");
	  }


}
}