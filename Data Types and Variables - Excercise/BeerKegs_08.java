package dataTypesAndVariables.Excercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double biggest = Integer.MIN_VALUE;
        String biggestModel = "";

        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > biggest) {
                biggest = volume;
                biggestModel = model;
            }
        }

        System.out.println(biggestModel);
    }
}
