package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        displayHighScorePosition("Sami", calculateHighScorePosition(1500));
        displayHighScorePosition("Sami", calculateHighScorePosition(900));
        displayHighScorePosition("Sami", calculateHighScorePosition(400));
        displayHighScorePosition("Sami", calculateHighScorePosition(50));


    }

    static void displayHighScorePosition(String pName, int position) {

        System.out.println(pName + " You Have Managed to get into posion " + position + " on the high Score table  ");

    }


    static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100); {
            position = 3;
        }

        return position;
    }
}
