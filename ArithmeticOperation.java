// WAP to perform all arithmetic operation

import java.util.Scanner;

public class ArithmeticOperation {

    public static void main(String[] args) {

        int a,b,sum,subtract,multiply,divide,modulus;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        a = sc.nextInt();
        System.out.println("Enter the Number");
        b = sc.nextInt();

//        Arithmetic Operation

        sum=a+b;
        subtract = a-b;
        multiply = a*b;
        divide = a/b;
        modulus = a%b;

        System.out.println("The sum of two number is " +sum);
        System.out.println("The subtract of two number is " +subtract);
        System.out.println("The Multiply of two number is " +multiply);
        System.out.println("The divide of two number is " +divide);
        System.out.println("The modulus of two number is " +modulus);








    }





}
