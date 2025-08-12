public class NoOfEvenNumbers {
  public static void main(String[] args) {

  even();
}
  public static void even(){
 
  int[] even = {1,2,3,4,5,6,7,8,9};

   int evenCount = 0;

 for(int index = 0; index < even.length; index++){

   if(even[index] % 2 == 0) {

      evenCount++;
     }
      }

  System.out.println("Number of even numbers: " + evenCount);

   

 


  }





}