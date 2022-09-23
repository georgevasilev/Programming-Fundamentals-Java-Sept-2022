package basicSyntax.exercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        //Every second lost game, Peter trashes his headset.
        //Every third lost game, Peter trashes his mouse.
        //When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
        //Every second time when he trashes his keyboard, he also trashes his display.

        int headsets = lostGames / 2;
        int mouses = lostGames / 3;
        int keyboards = lostGames / 6;
        int displays = lostGames / 12;

        double rageExpenses = headsets * headsetPrice + mousePrice * mouses + keyboardPrice * keyboards + displayPrice * displays;

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
