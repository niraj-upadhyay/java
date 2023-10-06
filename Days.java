
// WAP to convert days in to years, weeks and days;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        int week, year;
        int days , day;

        System.out.println("Enter the Number of days");
        Scanner sc = new Scanner(System.in);
        days = sc.nextInt();
        year = (days/365);
        week = (days%365)/7;
        day = days - ((year*365)+(week*7));


        System.out.println("The year is = "+year);
        System.out.println("The week is "+week);
        System.out.println("The days is = "+day);



    }
}
