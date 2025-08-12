import java.util.Scanner;
  public class TaskOne{
     public static void main(String[] args){

	Scanner input = new Scanner(System.in);
int guessNumber = 0;
int favouriteNumber = 7;

	for(int index = 0; index <= 10; index++){


	System.out.println("Enter Number: ");
	String userInput = input.nextLine();

	if (guessNumber == favouriteNumber) {

	System.out.println("That is my favorite number!");

	}else{

 	System.out.println("Nice try, guess again!");
	
}
	}





}
}