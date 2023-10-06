
// WAP to convert temperature from degree Celsius to Fahrenheit

import java.util.Scanner;

public class celsius {

    public static void main(String[] args) {

        float Celsius,Fahrenheit;

        System.out.println("Enter the Celsius");
        Scanner sc = new Scanner(System.in);
         Celsius = sc.nextFloat();
        Fahrenheit= (Celsius*9/5)+32;

        System.out.println("The Fahrenheit is = " +Fahrenheit);

    }
}
