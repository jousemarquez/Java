package _plantillas;

import java.util.Scanner;

public class CalendarGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the month and year
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Print the calendar for the specified month and year
        printCalendar(month, year);
    }

    public static void printCalendar(int month, int year) {
        // Print the calendar header, including the month and year
        System.out.println("\n     Calendar for " + getMonthName(month) + " " + year);

        // Print the days of the week
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print the calendar for the month
        int daysInMonth = getDaysInMonth(month, year);
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%2d ", i);
            if ((i + getDayOfWeek(1, month, year)) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static String getMonthName(int month) {
        // Return the name of the specified month
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }

    public static int getDaysInMonth(int month, int year) {
        // Return the number of days in the specified month
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    public static boolean isLeapYear(int year) {
        // Return true if the specified year is a leap year
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getDayOfWeek(int day, int month, int year) {
        // Return the day of the week (0-6) for the specified date
        // (Sunday is 0, Monday is 1, etc.)

        // Implement the Zeller's Congruence algorithm
        int q = day;
        int m = month;
        int y = year;
        if (m == 1 || m == 2) {
        }
        return q;
    }
}