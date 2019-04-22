public class AreaCalculator {
    public static double area(double x){

        if(x < 0){
            return -1.0;
        }
        return (3.14159) * (x * x);

    }

    public static double area(double y, double z){

        if((y < 0)||(z < 0)){
            return  -1.0;
        }
        return y * z;
    }
}
