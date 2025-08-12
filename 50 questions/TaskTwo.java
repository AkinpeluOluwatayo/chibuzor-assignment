import java.util.Scanner;
  public class TaskTne{
     public static void main(String[] args){
 

	Scanner input = new Scanner(System.in);

	System.out.println("Enter Name: ");
	String userInput = input.nextLine();

	if (userInput.toLowerCase() == "dog"){

	System.out.println("Woof! Dogs are awesome");

	}else{

	System.out.println("Cool choice, but I love dogs");

	}


}
}        