public class NumberToWords {
    public static void numberToWords(int number) {

        if (number < 0) System.out.println("Invalid Value");

        else {

            int dgCount = getDigitCount(number);
            int reversed = reverse(number);
            int dgCountRe = getDigitCount(reversed);
            int diff = dgCount - dgCountRe;
            String diffSring1 = "";
            String diffSring = "";
            if (diff > 0) {
                for (int i = 1; i <= diff; i++) {
                    diffSring1 += "Zero ";
                }
            }


            int temp;

            do {

                temp = reversed % 10;
                reversed = reversed / 10;
                if (temp == 0) diffSring += "Zero ";
                else if (temp == 1) diffSring += "One ";
                else if (temp == 2) diffSring += "Two ";
                else if (temp == 3) diffSring += "Three ";
                else if (temp == 4) diffSring += "Four ";
                else if (temp == 5) diffSring += "Five ";
                else if (temp == 6) diffSring += "Six ";
                else if (temp == 7) diffSring += "Seven ";
                else if (temp == 8) diffSring += "Eight ";
                else diffSring += "Nine ";


            } while (reversed > 0);

            System.out.println(diffSring + diffSring1);
        }


    }

    public static int reverse(int number) {
        int count = 0;
        int sign = -1;
        if (number < 0) number *= -1;
        else sign = 1;

        while (number > 0) {

            count *= 10;
            count += number % 10;
            number = number / 10;

        }


        return count * sign;
    }


    public static int getDigitCount(int number) {

        int count = 0;
        if (number < 0) return -1;
        else {

            do {
                number = number / 10;
                count += 1;
            } while (number > 0);

        }
        return count;
    }
}
