package basicSyntax.exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;


        while (!input.equals("Start")) {
            double currentCoin = Double.parseDouble(input);

            if (currentCoin != 0.1 && currentCoin != 0.2 && currentCoin != 0.5 && currentCoin !=1 && currentCoin != 2) {
                System.out.printf("Cannot accept %.2f%n", currentCoin);
            } else {
                sum += currentCoin;
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (sum >= 2) {
                        sum -= 2;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        sum -= 0.7;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        sum -= 0.8;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1) {
                        sum -= 1;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }


            input = scanner.nextLine();
        }
            if (sum >= 0) {
                System.out.printf("Change: %.2f", sum);
            }

    }
}
