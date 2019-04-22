public class Hello {

    public static void main(String[] args){

        System.out.println("Hello Sam");
        System.out.println("Inch and Feet " + calcFeetAndInches(1,1));
        System.out.println("Inches " + calcFeetAndInches(-1));

    }

    public static double calcFeetAndInches(double feet, double inches){
        if(feet < 0 || inches < 0 || inches > 12){
            return  -1;
        }
            double result = (inches * 2.54) + ( feet * 12 * 2.54);
            return result;

    }
    public static double calcFeetAndInches(double inches){
        if(inches < 0){
            return  -1;
        }
        double result = ( inches/ 12);
        return result;

    }

}
