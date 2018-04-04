package hw;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int max_number; // maximum value for random number
        int random_number; // eventual random number value
        Scanner sc; // scanner
        Random r; // random value

        System.out.println("Enter a number");

        sc = new Scanner(System.in);
        max_number = sc.nextInt();
        r = new Random();
        random_number = r.nextInt(max_number);

        System.out.println(
                "You entered " + max_number +
                (random_number == max_number ? " and " : " but ") +
                "the random number was " + random_number
        );
    }
}
