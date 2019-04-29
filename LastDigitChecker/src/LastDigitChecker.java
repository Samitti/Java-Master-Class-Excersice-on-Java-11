public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!(isValid(x) && isValid(y) && isValid(y))) return false;
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int tempX, tempY, tempZ;
        tempX = x;
        tempY = y;
        tempZ = z;

        while (x > 0) {

            temp1 = x % 10;
            x = x / 10;

           // System.out.println("Temp1 is ;" + temp1);

            while (y > 0) {

                temp2 = y % 10;
                y = y / 10;

               // System.out.println("Temp2 is ;" + temp2);

                while (z > 0) {

                    temp3 = z % 10;
                    z = z / 10;

                   // System.out.println("Temp3 is ;" + temp3);

                    break;



                }

                break;

            }

            break;

        }
        if((temp1 == temp2)||(temp2 == temp3)||(temp1 == temp3)) return  true;
        return false;


    }

    public static boolean isValid(int a) {

        if ((a < 10) || (a > 1000)) return false;
        return true;
    }
}
