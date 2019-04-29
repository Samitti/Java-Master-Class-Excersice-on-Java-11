public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){

        if(number < 0) return -1;
        int sum = 0;
        int last = 0;
        int count = 0;
        int temp = 0;

        while (number > 0){

           temp = number % 10;
            if(count == 0)
                last = temp;

            number = number / 10;
            count ++;


        }

        sum = temp + last;
        return sum;
    }
}
