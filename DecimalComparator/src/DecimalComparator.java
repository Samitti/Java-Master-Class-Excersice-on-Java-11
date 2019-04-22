class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){

        int a = (int)(firstNum * 1000);
        int b = (int)(secondNum * 1000);
        if(a == b)
            return  true;
        else
            return  false;
    }
}
