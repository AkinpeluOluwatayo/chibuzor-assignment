import java.util.Scanner;
  public class TaskOne{
     public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter Name: ");
	String userInput = input.nextLine();

	if (userInput.toLowerCase() == "alex"){

	System.out.println("Hello Friend");


	}else{

	System.out.println("Hi Stranger");

	}


}



}