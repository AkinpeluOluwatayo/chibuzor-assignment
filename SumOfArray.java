       public class SumOfArray {
         public static void main(String[] args) {
 
   sum();
        	
}
    public static void sum(){
   
	int[] weight = {2,4,5,6,7};

 	int sum = 0;
	
	for (int index = 0; index < weight.length; index++) {

        sum += weight[index];
	}

	System.out.println("The sum of numbers is: " + sum);	

	}

}