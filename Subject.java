import java.util.Scanner;

public class Subject {

    public static void main(String[] args) {

        float phy,che,math,hindi,eng;
        float total,average,percentage;


      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of Physics = ");
        phy = sc.nextFloat();
        System.out.print("Enter the marks of chemistry = ");
        che = sc.nextFloat();
        System.out.print("Enter the marks of math = ");
        math = sc.nextFloat();
        System.out.print("Enter the marks of Hindi = ");
        hindi = sc.nextFloat();
        System.out.print("Enter the marks of English = ");
        eng = sc.nextFloat();

        total = (phy+che+math+hindi+eng);
        average = total/5;
        percentage = (float) ((total/500.0)*100);

        System.out.println("The total marks is = " +total);
        System.out.println("The average marks is = " +average);
        System.out.println("The percentage marks is = " +percentage +"%");



    }

}
