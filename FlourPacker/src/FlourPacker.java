public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){

        if((bigCount < 0) || (smallCount < 0) ||(goal < 0)||  ((smallCount + (bigCount*5)) < goal)){
            return false;
        }

        if((bigCount*5) >= goal){
            if(((bigCount*5) == goal

            int count = 1;
            while(count < bigCount){
                if ((smallCount == 0)&&((5*count) > goal)){
                    return false;
                }
                else if(((5*count) + smallCount) >= goal){

                    return true;
                }
                else if(((((5*count) + smallCount) >= goal) && ((5*count) <= goal)) || ((smallCount == 0)&&((5*count) == goal))){

                    return true;
                }

                count++;

            }


        }
        else if ((((bigCount * 5) + smallCount) >= goal) && ((bigCount * 5) < goal)  ){

            return true;
        }
        return false;
    }
}
