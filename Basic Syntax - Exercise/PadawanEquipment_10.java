package basicSyntax.exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	If the calculated price of the equipment is less or equal to the money George Lucas has:
        //"The money is enough - it would cost {the cost of the equipment}lv."
        //•	If the calculated price of the equipment is more than the money George Lucas has:
        // "George Lucas will need {neededMoney}lv more."
        //•	All prices must be rounded to two digits after the decimal point.
        //George Lucas should buy 10% more, rounded up to the next integer. Also, every sixth belt is free.


        double budget = Double.parseDouble(scanner.nextLine());
        int padawans = Integer.parseInt(scanner.nextLine());
        double lsPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double totalCost = lsPrice * (Math.ceil(padawans + padawans * 0.1)) + robePrice * padawans +
                beltPrice * (padawans - Math.floor(padawans / 6.0));

        if (totalCost <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalCost - budget);
        }

    }
}
