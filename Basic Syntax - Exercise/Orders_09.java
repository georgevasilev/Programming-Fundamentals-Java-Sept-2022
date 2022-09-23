package basicSyntax.exercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double total = 0;
        double grandTotal = 0;


        for (int i = 1; i <= orders; i++) {

            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            total = (days * capsuleCount) * capsulePrice;

            System.out.printf("The price for the coffee is: $%.2f%n", total);
            grandTotal += total;
        }
        System.out.printf("Total: $%.2f", grandTotal);
    }
}
