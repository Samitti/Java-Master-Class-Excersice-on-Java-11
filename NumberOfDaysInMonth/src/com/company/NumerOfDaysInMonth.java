package com.company;

public class NumerOfDaysInMonth {
    public static boolean isLeapYear(int x) {
        if ((x < 1) || (x > 9999))
            return false;

        int condition1, condition2, condition3 = 0;
        condition1 = x % 4;
        condition2 = x % 100;
        condition3 = x % 400;
        if (((condition1 == 0) && (condition2 != 0)) || (condition3 == 0))
            return true;
        else
            return false;

    }

    public static int getDaysInMonth(int month, int year) {

        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999)))
            return -1;

        switch (month) {
            case 1:
                month = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    month = 29;
                    break;
                } else{
                    month = 28;
                    break;
                }
            case 3:
                month = 31;
                break;
            case 4:
                month = 30;
                break;
            case 5:
                month = 31;
                break;
            case 6:
                month = 30;
                break;
            case 7:
                month = 31;
                break;
            case 8:
                month = 31;
                break;
            case 9:
                month = 30;
                break;
            case 10:
                month = 31;
                break;
            case 11:
                month = 30;
                break;
            case 12:
                month = 31;
                break;

        }
        return month;
    }

}
