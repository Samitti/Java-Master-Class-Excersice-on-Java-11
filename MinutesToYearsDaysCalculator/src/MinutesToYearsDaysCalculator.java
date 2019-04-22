public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        long years = 0;
        long days = 0;

        if (minutes < 0)
            System.out.println("Invalid Value");
        else if (minutes >= 525600) {
            years = minutes / 525600;
           long remMinutes = minutes % 525600;
            days = remMinutes / 1440;

            System.out.println(minutes + " min = " + years + " y and " + days + " d" );
        } else {
            days = minutes / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d" );

        }
    }
}



