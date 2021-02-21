package ObjectsAndClasses.AdvertisementMessage_01;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phrases = "Excellent product.@Such a great product.@I always use that product.@Best product of its category.@Exceptional product.@I can’t live without this product.";
        String events = "Now I feel good.@I have succeeded with this product.@Makes miracles. I am happy of the results!@I cannot believe but now I feel awesome.@Try it yourself, I am very satisfied.@I feel great!";
        String authors = "Diana@Petya@Stella@Elena@Katya@Iva@Annie@Eva";
        String cities = "Burgas@Sofia@Plovdiv@Varna@Ruse";
        Random random = new Random();
        List <AdvertisementMessage> advMessage = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int random_phrases = (int)(Math.random() * (5) + 0);
            int random_events = (int)(Math.random() * (5) + 0);
            int random_authors = (int)(Math.random() * (7) + 0);
            int random_cities = (int)(Math.random() * (4) + 0);
            phrases = phrases.split("@")[random_phrases];
            events = events.split("@")[random_events];
            authors = authors.split("@")[random_authors];
            cities = cities.split("@")[random_cities];
            AdvertisementMessage advMess = new AdvertisementMessage(phrases, events, authors, cities);
            advMessage.add(advMess);
        }
        System.out.println(advMessage);
    }
}
