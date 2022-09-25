package dataTypesAndVariables.Excercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int water = Integer.parseInt(scanner.nextLine());
            if (water <= capacity) {
                capacity = capacity - water;
            } else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.printf("%d", 255 - capacity);
    }
}
