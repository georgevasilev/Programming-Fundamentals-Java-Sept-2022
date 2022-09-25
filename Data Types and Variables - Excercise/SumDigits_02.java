package dataTypesAndVariables.Excercise;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int currentNum = num;
        int sum = 0;

        while (currentNum > 0) {
            sum = sum + (currentNum % 10);
            currentNum = currentNum / 10;

        }
        System.out.println(sum);

    }
}
