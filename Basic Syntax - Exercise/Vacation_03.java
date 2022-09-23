package basicSyntax.exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String weekday = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;

        if (groupType.equals("Students")) {
            if (weekday.equals("Friday")) {
                price = 8.45;

            } else if (weekday.equals("Saturday")) {
                price = 9.80;

            } else if (weekday.equals("Sunday")) {
                price = 10.46;

            }
            totalPrice = peopleCount * price;
            if (peopleCount >= 30) {
                totalPrice -= totalPrice * 0.15;
            }

        } else if (groupType.equals("Business")) {
            if (weekday.equals("Friday")) {
                price = 10.90;

            } else if (weekday.equals("Saturday")) {
                price = 15.60;

            } else if (weekday.equals("Sunday")) {
                price = 16;

            }
            totalPrice = peopleCount * price;
            if (peopleCount >= 100) {
                totalPrice -= 10 * price;
            }

        } else if (groupType.equals("Regular")) {
            if (weekday.equals("Friday")) {
                price = 15;

            } else if (weekday.equals("Saturday")) {
                price = 20;

            } else if (weekday.equals("Sunday")) {
                price = 22.50;

            }
            totalPrice = peopleCount * price;
            if (peopleCount >= 10 && peopleCount <= 20) {
                totalPrice -= totalPrice * 0.05;
            }


        }
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
