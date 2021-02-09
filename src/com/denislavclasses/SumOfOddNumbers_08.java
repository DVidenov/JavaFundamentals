package com.denislavclasses;

import java.util.Scanner;

public class SumOfOddNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i < n; i++) {
            int oddMumber = 2 * i - 1;
            sum += oddMumber;
            System.out.println(oddMumber);
        }
        System.out.printf("Sum: %d", sum);
    }
}
