public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if (((x < 10) || (x > 99)) || ((y < 10) || (y > 99))) return false;

        int temp1 = 0;
        int temp2 = 0;
        int tempy = y;
        boolean isShared = false;

        while (x > 0) {
            temp1 = x % 10;
            x = x / 10;

            while (y > 0) {

                temp2 = y % 10;
                y = y / 10;

                if (temp1 == temp2) {


                    isShared = true;
                    break;
                }
            }
            y = tempy;

        }

        return isShared;

    }


}

