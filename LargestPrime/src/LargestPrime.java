public class LargestPrime {

    public static int getLargestPrime(int number){

        int primeNum = -1;
        if(number <= 1){
            return  -1;
        }
        Boolean isPrime = false;

        for(int i = 2; i < number; i++){
            for(int j=2; j<= i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            isPrime = true;

            if(isPrime){
                if((number % i) == 0){
                    primeNum = i;
                }
            }
        }
        if(primeNum == -1) return number;
        return primeNum;
        }

    }
  /*  public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }
        for(int i=2; i<= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

   */

