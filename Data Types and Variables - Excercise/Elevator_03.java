package dataTypesAndVariables.Excercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //people
        int p = Integer.parseInt(scanner.nextLine()); //capacity
        int courses = 0;
        if (p >= n) {
            System.out.println("1");
        } else {
            courses = n / p;
            if (n % p != 0) {
                courses = courses + 1;
            }
            System.out.println(courses);
        }
    }
}
