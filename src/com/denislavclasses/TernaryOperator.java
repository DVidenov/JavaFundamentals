package com.denislavclasses;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = Integer.parseInt(scanner.nextLine());
        int val2 = Integer.parseInt(scanner.nextLine());

        int max = val1 >= val2 ? val1 : val2;
        System.out.println(max);
    }
}
