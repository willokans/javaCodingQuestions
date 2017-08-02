import java.util.Scanner;

/**
 * Created by wokanumeh on 01/08/2017.
 */
public class q2_checkIfPrime {

    /**
     * Check if number is Prime
     * Experience 0 - 3 years
     */

    public static void main(String[] args) {


        isPrime1();

    }


    /**
     * A number that can only be divided by 1 and it self
     */
    public static void isPrime1() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        boolean prime = true;

        for(int i=2; i < number; i++) {
            if (number%i == 0) {
                prime=false;
            }
        }
        System.out.println(number + " is not a prime number");

        if(prime == true) {
            System.out.println(number + " is prime number");
        }
    }



}
