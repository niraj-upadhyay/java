import java.util.Scanner;
public class conditionalExercise {

    //Question 1 : What will be the output of this program:

//    public static void main(String[] args) {
//        int a = 10;
//        if(a=11)
//        {
//            System.out.println("a is 11");
//        }
//        else
//        {
//            System.out.println("a is not 11");
//        }
//
//  }

  //  Question 2;

//    public static void main(String[] args) {
//
//        int a,b,c;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the marks of physics");
//         a = sc.nextInt();
//
//        System.out.println("Enter the marks of Chemistry");
//        b= sc.nextInt();
//
//        System.out.println("Enter the marks of Chemistry");
//        c= sc.nextInt();
//
//        float avg = (a+b+c)/3.0f;
//
//        System.out.println("The percentage is " + avg);
//
//        if(avg>=40 && a>=33 && b>=33 && c>=33)
//        {
//            System.out.println("Congratulation you are passed ");
//        }
//        else
//        {
//            System.out.println("Try again");
//        }
//    }

    // Question 3;
//
//    public static void main(String[] args) {
//
//        double income, tax=0;
//        System.out.println("Enter the Income in Lac");
//        Scanner sc = new Scanner(System.in);
//        income = sc.nextDouble();
//
//        if(income<=250000)
//        {
//            tax = tax+0;
//            System.out.println(tax);
//        }
//        else if (income>250000 && income<=500000)
//        {
//            tax=income*0.05;
//            System.out.println(tax);
//        }
//        else if (income>=1000000)
//        {
//            tax=income*0.03;
//            System.out.println(tax);
//        }
//        else
//        {
//            System.out.println("Please enter the income");
//        }
//
//    }

    // Question 4;
//
//    public static void main(String[] args) {
//
//        int day;
//        System.out.println("Enter the number");
//        Scanner sc = new Scanner(System.in);
//        day = sc.nextInt();
//        switch(day)
//        {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//        }


//    }

    // Question 5;
    // WAP of leap year;


//    public static void main(String[] args) {
//
//        int year;
//        System.out.println("Enter the year");
//        Scanner sc = new Scanner(System.in);
//        year = sc.nextInt();
//        if(year%400==0 || year%4==0 && year%100!=0)
//        {
//            System.out.println("Leap Year");
//        }
//        else
//        {
//            System.out.println("Not Leap year");
//        }
//
//    }

    // Question 6;

    public static void main(String[] args) {

        System.out.println("Enter the Website");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org"))
        {
            System.out.println("This is an organisation website");
        }
        else if(website.endsWith(".com"))
        {
            System.out.println("This is Commercial Website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("This is an Indian website");
        }
    }


}
