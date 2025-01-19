package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first binary number: ");
        String binary1Input = scanner.nextLine();
        System.out.print("Enter the second binary number: ");
        String binary2Input = scanner.nextLine();

        Binary binary1 = new Binary(binary1Input);
        Binary binary2 = new Binary(binary2Input);

        Binary sum = Binary.add(binary1, binary2);
        System.out.println("Sum: " + sum.getValue());

        Binary orResult = Binary.or(binary1, binary2);
        System.out.println("OR: " + orResult.getValue());

        Binary andResult = Binary.and(binary1, binary2);
        System.out.println("AND: " + andResult.getValue());

        Binary multiplyResult = Binary.multiply(binary1, binary2);
        System.out.println("Multiplication: " + multiplyResult.getValue());
    }
}
