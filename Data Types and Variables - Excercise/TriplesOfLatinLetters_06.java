package dataTypesAndVariables.Excercise;

import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num ; j++) {
                for (int k = 0; k < num; k++) {
                    char first = (char) ('a' + i);
                    char second = (char) ('a' + j);
                    char third = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", first, second, third);
                }
            }

        }
    }
}
