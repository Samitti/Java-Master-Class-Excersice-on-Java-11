public class TeenNumberChecker {

    public static boolean hasTeen(int x, int y, int z){

        if(((x < 20) && (x > 12)) || ((y < 20) && (y > 12)) || ((z < 20) && (z > 12)))
            return  true;
        else
            return  false;
    }

    public static boolean isTeen(int a){

        if((a < 20) && (a > 12))
            return  true;
        else
            return  false;
    }
}
