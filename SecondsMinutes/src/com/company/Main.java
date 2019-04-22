package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(getDurationString(59,59));
        System.out.println(getDurationString(4000 ));
    }
    public static String getDurationString(int minutes, int seconds){

        if((minutes < 0 ) || (seconds < 0 || seconds > 59)){
            return "Invalid Value";
        }
        int hoursSum = 0;
        int minitsSum = 0;


       if(minutes > 59) {
           hoursSum += minutes / 60;
           minitsSum += minutes % 60;

       }else {
           minitsSum += minutes;

       }

               return  hoursSum + "h " + minitsSum + "m " + seconds + "s ";
    }

    public static String getDurationString(int seconds) {
       if(seconds < 0) {
           return "Invaid Value";
       }
        if(seconds > 59) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
        return getDurationString(0,seconds);
    }
    }

