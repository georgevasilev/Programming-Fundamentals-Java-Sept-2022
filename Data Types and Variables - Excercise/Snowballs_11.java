package dataTypesAndVariables.Excercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balls = Integer.parseInt(scanner.nextLine());
        double highestValue = Double.MIN_VALUE;
        double highestSnow = Double.MIN_VALUE;
        double highestTime = Double.MIN_VALUE;
        double highestQuality = Double.MIN_VALUE;

        for (int i = 1; i <= balls; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            double value = Math.pow((snow * 1.0 / time), quality);

            if (value > highestValue) {
                highestValue = value;
                highestSnow = snow;
                highestTime = time;
                highestQuality = quality;
            }

        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)", highestSnow, highestTime, highestValue, highestQuality);
    }
}
