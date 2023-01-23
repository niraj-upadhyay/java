import java.util.Scanner;
public class loopingExercise {

    // Question 1;
    // WAP to  compare the three number;
//    public static void main(String[] args) {
//        System.out.println("Enter the number");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        System.out.println("Enter the number");
//        int b = sc.nextInt();
//
//        System.out.println("Enter the number");
//        int c = sc.nextInt();
//
//        if(a>b && a>c)
//        {
//            System.out.println("a is greater");
//        }
//        else if(b>a && b>c)
//        {
//            System.out.println("b is greater");
//        }
//        else
//        {
//            System.out.println("c is greater");
//        }
//    }

    // Question 2;
    // WAP to check the odd number or Even number;

//    public static void main(String[] args) {
//        int a ;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        a = sc.nextInt();
//        if(a%2==0)
//        {
//            System.out.println("Even number ");
//        }
//        else
//        {
//            System.out.println("Odd number");
//        }
//   }

    // Question 3;
    //WAP to check the year is leap or not;

//    public static void main(String[] args) {
//        int year;
//        System.out.println("Enter the year");
//        Scanner sc = new Scanner(System.in);
//        year = sc.nextInt();
//        if(year%400==0 || year%4==0 && year%100!=0)
//        {
//            System.out.println("Leap year");
//        }
//        else
//        {
//            System.out.println("Not leap Year");
//        }
//    }

    // Question 4;
    // WAP to swap the two number ;

    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        a= sc.nextInt();

        System.out.println("Enter the number");
        b= sc.nextInt();

        temp = a;
        a=b;
        b=temp;
        System.out.println("value of a is " +a);
        //System.out.println(a);
        System.out.println("Value of b is " +b);
        //System.out.println(b);



    }





}
