public class ArraySumOfOddNumber {
  public static void main(String[] args) {

   odd();
}
  public static void odd(){

  int[] even = {1,2,3,4,5,6,7,8,9,11,15,19};


   int sum = 0; 
   for (int index = 0; index < even.length; index++){

       if(index % 2 == 1) {

	sum += index;

      }

 
	}

	System.out.println("The sum of odd number is: " + sum);




   }







}