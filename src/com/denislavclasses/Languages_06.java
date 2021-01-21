package com.denislavclasses;

import java.util.Scanner;

public class Languages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String county = scanner.nextLine();

        switch (county){
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Mexico":
            case "Argentina":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
