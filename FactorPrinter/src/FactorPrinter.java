public class FactorPrinter {
    public static void printFactors(int number){
         if(number < 1) System.out.println("Invalid Value");
         else{
             int temp = 1;
             while(temp <= number){

                 if((number % temp) == 0)
                     System.out.print(" " + temp);
                 temp++;
             }


         }


    }
}
