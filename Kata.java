public class Kata {
   public static void main(String [] args) {

   
  
  System.out.println(checkEvenNumber(4));
  System.out.println(checkPrimeNumber(6));
  System.out.println(subtractNumber(7,3));
  System.out.println(divide(50,5));
  System.out.println(factorOfInteger(10));
  System.out.println(checkRaisePower(25));
   }

   // method 1//

    public static boolean  checkEvenNumber(int num1){

    if(num1 % 2 == 0){

    return true;

    }else{ 
          return false;
      }
	 	
    }


    // method 2//

   public static boolean checkPrimeNumber(int num2){

    if(num2 <=  1){

    return true;
   
    }else{

    }  
     return false; 
    }

    // method 3//

     public static int subtractNumber(int numb1, int numb2){

    int subtraction = numb1 - numb2;
    return subtraction;
    }

    // method 4 //
    public static int divide(int numb3, int number){
    int division = numb3 / number;
    return division;
    }

    // method 5 //
    public static int factorOfInteger(int number){
     
	int count = 0;

     for(int index = 1; index <= number; index++) {
           
        if (number % index == 0){
	 count++;  

	 }
	
	 
      }
	
	return count;  
    }

      // method 6 //
    public static boolean checkRaisePower(int number) {
        if (number < 0) {
            return false; 
        }

        for (int i = 0; i <= number / 2; i++) {

            int square = i * i;

            if (square == number) {
                return true;
            } else if (square > number) {
                return false;
            }
        }

        return false;
    


      public static boolean squareOfNumber(int number) {



      }


  }






}

   
















