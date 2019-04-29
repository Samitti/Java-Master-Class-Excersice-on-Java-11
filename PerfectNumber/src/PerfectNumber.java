public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number <= 0) return false;

        int sum = 0;
        int temp = 1;
        while(temp < number){

            if((number % temp) == 0)
                 sum += temp;

            temp++;
        }
       // System.out.println("Sum " + sum);
        if(sum == number) return true;
        else return false;



    }
}
