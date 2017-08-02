import java.util.Scanner;

/**
 * Created by wokanumeh on 01/08/2017.
 */
public class q1_fibonacciSeries {

    /**
     * Write a java program to print fibonacci series
     *
     * Experience 0 - 3 years
     */

    public static void main(String[] args) {

        fiboSeries1(20, 0, 1);
        fiboSeries2();


    }


    /**
     * Fibonacci Series is a series of number whereby each number is the sum of the last two previous numbers
     *
     * Steps
     * * Create an integer array with size 10
     * *Initialize zero element to 0 fib[0]= 0
     * Initialize first element to 1 fib[1] = 1;
     */
    public static void fiboSeries1(int length, int firstArray, int secondArray) {

        int[] fibo = new int[length];
        fibo[0] = firstArray;
        fibo[1] = secondArray;

        for (int i = 2; i< length; i++) {
            fibo[i] = fibo[i-1] + fibo[i -2];

        }

        //print element in array
        for (int i : fibo) {
            System.out.print(i + " ");
        }
    }

    public static void fiboSeries2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max number: ");
        int lengthOfNumbers = sc.nextInt();
        System.out.println("Enter the First number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        int k = 0;
//        int a = firstNumber;
//        int b = secondNumber;

        System.out.print("1 1 ");

        while(k <= lengthOfNumbers) {
            k = firstNumber + secondNumber;

            System.out.print(k + " ");

            //shift the value from a to b to k
            firstNumber= secondNumber;
            secondNumber = k;
        }
    }


    //come up with one of my own
    public static void fiboSeries3 () {




    }

}
