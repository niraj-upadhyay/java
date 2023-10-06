// WAP to find th third angle of triangle

import java.util.Scanner;
public class Triangle{

    public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first angle = ");
        a = sc.nextInt();
        System.out.print("Enter the second angle = ");
        b = sc.nextInt();
        c= 180-(a+b);

        System.out.println("The Third angle of Triangle = " +c);





    }

}
