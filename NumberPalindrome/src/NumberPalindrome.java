public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        int sign = -1;
        int reverse = 0;
        int orginal = number;

        if(number >= 0) sign = 1;

        number = sign * number;

        while(number > 0){

            reverse *= 10;
            reverse += number % 10;
            number = number / 10;

        }
        reverse = sign * reverse;


         if(orginal == reverse) return true;
         else return false;
    }
}
