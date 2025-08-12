public class ArraySumOfEvenNumber {
  public static void main(String[] args) {


  even();

}
  public static void even() { 

  int[] even = {1,2,3,4,5,6,7,8,9,11};

	int sum = 0;

   for(int index = 0; index <= even.length; index++){

	
	   

    if (index % 2 == 0){

	 sum += index;
	
	}	
	

      }
	System.out.println("The sum of even numbers is: " + sum);
   }
















}