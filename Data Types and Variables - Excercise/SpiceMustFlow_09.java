package dataTypesAndVariables.Excercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int extracted = 0;
        int currentYield = startingYield;

        while (currentYield >= 100) {

            extracted = extracted + currentYield;
            if (extracted >= 26) {
                extracted -= 26;
            }

            days++;
            currentYield = startingYield - days * 10;

        }
        if (extracted >= 26) {
            extracted -= 26;
        }

        System.out.println(days);
        System.out.println(extracted);





    }
}
