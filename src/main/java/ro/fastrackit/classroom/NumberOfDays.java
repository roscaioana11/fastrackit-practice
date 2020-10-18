package ro.fastrackit.classroom;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num_month, year; //to allow the user to enter the nr of month and year
        int nr_of_daysinamonth = 0;
        String month = "Does not Exist";

        System.out.println("Enter the number of the month");
        num_month = scan.nextInt();

        System.out.println("Enter the year");
        year = scan.nextInt();

        switch (num_month){  //the number entered by the user
            case 1:
                month = "January";
                nr_of_daysinamonth = 31;
                break;  //if it is 1 it will exit the loop and the response will be January
            case 2:
                month = "February";
                if(year%4 == 0){  //if it is a leap year or not
                    nr_of_daysinamonth = 29; //leap year
                }
                else{
                    nr_of_daysinamonth = 28; //not leap year
                }
                break;
            case 3:
                month = "March";
                nr_of_daysinamonth = 31;
                break;
            case 4:
                month = "April";
                nr_of_daysinamonth = 30;
                break;
            case 5:
                month = "May";
                nr_of_daysinamonth = 31;
                break;
            case 6:
                month = "June";
                nr_of_daysinamonth = 30;
                break;
            case 7:
                month = "July";
                nr_of_daysinamonth = 31;
                break;
            case 8:
                month = "August";
                nr_of_daysinamonth = 31;
                break;
            case 9:
                month = "September";
                nr_of_daysinamonth = 30;
                break;
            case 10:
                month = "October";
                nr_of_daysinamonth = 31;
                break;
            case 11:
                month = "November";
                nr_of_daysinamonth = 30;
                break;
            case 12:
                month = "December";
                nr_of_daysinamonth = 31;
                break;
            default:
                System.out.println(month); //to initialize the message does not exist in case the user types a number bigger than 12
        }
        System.out.println("The month of " + month + " " + year + " has " + nr_of_daysinamonth + " days");
    }
}
