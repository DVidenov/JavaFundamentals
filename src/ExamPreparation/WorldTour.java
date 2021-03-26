package ExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder initialStringBuilder = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")){
            String[] commandParts = input.split(":");

            switch (commandParts[0]){
                case "Add stop":
                    int addStopIndex = Integer.parseInt(commandParts[1]);
                    String stopToIndex = commandParts[2];
                    if (addStopIndex >= 0 && addStopIndex < initialStringBuilder.length()) {
                        initialStringBuilder.insert(addStopIndex, stopToIndex);
                    }
                    System.out.println(initialStringBuilder);
                    break;
                case "Remove stop":
                    int removeBeginIndex = Integer.parseInt(commandParts[1]);
                    int removeEndIndex = Integer.parseInt(commandParts[2]);
                    if (removeBeginIndex >= 0 && removeBeginIndex < initialStringBuilder.length() &&
                            removeEndIndex >= 0 && removeEndIndex < initialStringBuilder.length()){
                        initialStringBuilder.delete(removeBeginIndex, removeEndIndex + 1);
                    }
                    System.out.println(initialStringBuilder);
                    break;
                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];
                    String destination = initialStringBuilder.toString();
                    destination = destination.replace(oldString, newString);
                    initialStringBuilder = new StringBuilder(destination);
                    System.out.println(initialStringBuilder);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", initialStringBuilder);
    }
}
