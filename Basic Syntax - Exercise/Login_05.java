package basicSyntax.exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int attempts = 0;

        for (int position = username.length() - 1; position >=0 ; position--) {
            char currentChar = username.charAt(position);

            password += currentChar;
        }
        String input = scanner.nextLine();
        while (!input.equals(password)) {
            if (attempts > 2) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            attempts++;

            input = scanner.nextLine();
        }
        if (input.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
