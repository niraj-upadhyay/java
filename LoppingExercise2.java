import java.util.Scanner;
public class LoppingExercise2 {

    // Question 1;
    // WAP to print the InvertRight triangle;

//    public static void main(String[] args) {
//        int i,j;
//        for (i=1;i<=4;i++)
//        {
//            for(j=4;j>=i;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//
//    }

    // Question 2;
    // WAP to sum of first n even number ;
//
//    public static void main(String[] args) {
//        int i,sum=0;
//        System.out.println("Enter the number = ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for(i=1;i<=a;i++)
//        {
//            if(i%2==0)
//            {
//                sum=sum+i;
//            }
//        }
//        System.out.println(sum);
//
//        for(i=1;i<=a;i++)
//        {
//            sum=sum+(2*i);
//        }
//        System.out.println("The sum first  even number is "  +sum);
//
//    }

    //Question 3;

    // WAP to print the table of any number;

//    public static void main(String[] args) {
//
//        int n,i;
//        System.out.println("Enter the number ");
//        Scanner sc = new Scanner(System.in);
//        n= sc.nextInt();
//        for(i=1;i<=10;i++)
//        {
//            System.out.printf("%d*%d=%d\n",n,i,n*i);
//        }
//
//  }


      //   Question 4;
      // WAP to print the reverse order of table;

//    public static void main(String[] args) {
//
//        int n,i;
//        System.out.println("Enter the number ");
//        Scanner sc = new Scanner(System.in);
//        n= sc.nextInt();
//        for(i=10;i>=1;i--)
//        {
//            System.out.printf("%d*%d=%d\n",n,i,n*i);
//        }
//
//  }

    // Question 5;
    // WAP to print the factorial of any number ;

//    public static void main(String[] args) {
//        int i,n,fact=1;
//        System.out.println("Enter the number = ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for(i=1;i<=n;i++)
//        {
//            fact=fact*i;
//        }
//        System.out.println(fact);
//    }

    //

    // Question 6;

//    public static void main(String[] args) {
//        int i,n,fact=1;
//       System.out.println("Enter the number = ");
//       Scanner sc = new Scanner(System.in);
//       n = sc.nextInt();
//       i=1;
//       while(i<=n)
//       {
//           fact = fact*i;
//           i++;
//       }
//        System.out.println(fact);
//    }

    // question 7;
   // WAP to  sum of table of any number;
    public static void main(String[] args) {
        int n,i,sum=0;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=10;i++)
        {
            //System.out.println(n*i);
            sum=sum+(n*i);
        }
        System.out.println(sum);
    }

}
