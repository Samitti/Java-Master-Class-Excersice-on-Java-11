public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {

        if ((first < 10) || (second < 10)) return -1;

        int tempX = first;
        int countX = first;
        int tempY = second;
        int countY = second;

        while (countX > 0) {

            if ((first % countX) == 0) {

               // System.out.println("CountX : " + countX);

                countY = second;
                while (countY > 0) {

                    if ((second % countY) == 0) {

                       // System.out.println("CountY : " + countY);

                        if (countX == countY)

                            return countX;
                    }

                    countY--;

                }
            }
            countX --;
        }

        return -1;
    }
}
