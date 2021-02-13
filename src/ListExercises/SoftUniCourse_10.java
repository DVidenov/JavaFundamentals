package ListExercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCourse_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")){
            String [] tokens = input.split(":");
            String command = tokens[0];
            String lessonTitle = tokens[1];
            switch (command){
                case "Add":
                    //"Add:Databases" -> ["Add", "Databases"]
                    if (!schedule.contains(lessonTitle)){
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (!schedule.contains(lessonTitle)){
                        schedule.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    if (schedule.contains(lessonTitle)){
                        schedule.remove(lessonTitle);
                    }
                    int indexLesson = schedule.indexOf(lessonTitle);
                    if (schedule.get(indexLesson + 1).equals(lessonTitle + "-Exercise")) {

                    }
                    break;
                case "Swap":
                    String lessonTitle2 = tokens[2];
                    String exercise1 = lessonTitle + "-Exercise";
                    String exercise2 = lessonTitle2 + "-Exercise";
                    if (schedule.contains(lessonTitle) && schedule.contains(lessonTitle2)){
                        int index1 = schedule.indexOf(lessonTitle);
                        int index2 = schedule.indexOf(lessonTitle2);
                        schedule.set(index1, lessonTitle2);
                        schedule.set(index2, lessonTitle);
                    }
                    break;
                case "Exercise":
                    //exercise -> lesson-exercise
                    String exercise = lessonTitle + "-Exercise";
                    //слагаме упражнение ако има лекция и го няма упражнението
                    int indexLessontitle = schedule.indexOf(lessonTitle);
                    if (schedule.contains(lessonTitle)){
                        //има ли упражнение
                        if (indexLessontitle == schedule.size() - 1) {
                            schedule.add(indexLessontitle + 1, exercise);
                        }else if (!schedule.get(indexLessontitle + 1).equals(exercise)){
                            schedule.add(indexLessontitle + 1, exercise);
                        }
                    }else {
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        printList(schedule);
    }
    private static void printList (List<String> elements){
        int count = 1;
        for (String element:elements) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}