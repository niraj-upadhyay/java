import java.util.Scanner;
import static java.lang.Math.sqrt;

// 1.   WAP to find area of a triangle ;
// 2.  WAP to calculate the area of Equilateral Triangle ;



public class Triangle1 {

    public static void main(String[] args) {

            //      Question 1:

//        float base, height, area;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the base = ");
//        base = sc.nextFloat();
//        System.out.print("Enter the base = ");
//        height = sc.nextFloat();
//
//        area = (base*height)/2;
//
//        System.out.println("The Area of triangle is " +area);

                //  Question 2:

        float side,area;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side = ");
        side = sc.nextInt();
        area = (float) ((sqrt(3) / 4) * (side*side));

        System.out.println("Area of Equilateral triangle is = " +area);








    }

}
