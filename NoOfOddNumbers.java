public class NoOfOddNumbers {
  public static void main(String[] args) {

  odd();
}
  public static void odd(){
 
  int[] odd = {1,2,3,4,5,6,7,8,9};

   int oddCount = 0;

 for(int index = 0; index < odd.length; index++){

   if(odd[index] % 2 !=0) {

      oddCount++;
     }
      }

  System.out.println("Number of odd numbers: " + oddCount);

   

 


  }





}