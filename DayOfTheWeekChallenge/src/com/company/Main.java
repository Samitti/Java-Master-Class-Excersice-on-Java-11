package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printDayOfTheWeek(-1);
    }

    public static void printDayOfTheWeek(int day){

        switch (day){

            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Sunday");
                break;
            case 4: case 5: case 6:
                System.out.println(day);
                break;
            default:
                System.out.println("Invalid Value");
        }
        if((day < 0)||(day > 6)){
            System.out.println("Invalid Value");
        }
        else if(day == 0){
            System.out.println("Sunday");
        }
        else if(day == 1){
            System.out.println("Monday");
        }
        else
            System.out.println(day);

    }
}
