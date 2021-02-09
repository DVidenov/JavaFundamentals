package first_exercises;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = userName.length() -1; i >= 0 ; i--) {
            char currentSymbol = userName.charAt(i);
            passwordBuilder.append(currentSymbol);
        }
        String passWord = passwordBuilder.toString();

        String command = scanner.nextLine();

        int count = 0;
        while (!command.equals(passWord)){
            System.out.println("Incorrect password. Try again.");
            if (count == 4 ){
                System.out.printf("User %s blocked!", userName);
                break;
            }
            count++;
            command = scanner.nextLine();
        }
        if (command.equals(passWord)){
            System.out.printf("User %s logged in.", userName);
        }
    }
}
