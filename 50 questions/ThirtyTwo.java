import java.util.Scanner;
  public class ThirtyTwo{
     public static void main(String[] args){

int sum = 0;

    for(int index = 0; index <= 20; index++){

	if(index % 2 == 0){

	sum += index;

	}
   }


	System.out.println("The sum of even numbers is: " + sum);
}
}