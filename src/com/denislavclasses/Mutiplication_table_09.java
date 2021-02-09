package com.denislavclasses;

import java.util.Scanner;

public class Mutiplication_table_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int multiplier = 1;

        while (multiplier <= 10){
            System.out.printf("%d X %d = %d%n", number, multiplier, number*multiplier);
            multiplier++;
        }
    }
}
