
// WAP to find the perimeter and area of Rectangle

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        int l,b,perimeter,area;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length = " );
        l=sc.nextInt();
        System.out.print("Enter the breadth = ");
        b=sc.nextInt();
        perimeter = 2*(l+b);
        area = l*b;
        System.out.println("perimeter of rectangle is " +perimeter);
        System.out.println("Area of rectangle is " +area);

    }
}
