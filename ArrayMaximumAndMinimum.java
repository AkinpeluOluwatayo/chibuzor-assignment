import java.util.Scanner;
  public class ArrayMaximumAndMinimum {
     public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int[] sizes = new int[5];


	for(int index = 0; index < sizes.length; index++) {

	System.out.println("Enter Sizes");
	sizes[index] = input.nextInt();

	}


	 int largest = maximum(sizes);
	 int smallest = smallest(sizes);

         System.out.println("The smallest is: " + smallest);
         System.out.println("The largest is: " + largest);

}
	
     public static int maximum(int[] sizes) {
	int largest = sizes[0];
	
      for(int index = 1; index < sizes.length; index++) {

	if (sizes[index] > largest){
	  
	 largest = sizes[index];
	 
	}
	}

	 return largest;

	}	  
	

    public static int smallest(int[] sizes) {
	int smallest = sizes[0];

    for(int index = 1; index < sizes.length; index++){

	 if (sizes[index] < smallest){
	
	  smallest = sizes[index];

	}
	  
	}
	  return smallest;
	 }










}