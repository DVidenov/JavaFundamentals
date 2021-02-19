package ObjectsAndClasses.Articles_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String title = input.split(", ")[0];
            String content = input.split(", ")[1];
            String author = input.split(", ")[2];
            Article article = new Article(title, content, author);
            articles.add(article);
        }
        String command = scanner.nextLine();
        switch (command){
            case "title":
                articles.sort(Comparator.comparing(Article::getTitle));
                for (Article article: articles) {
                    System.out.println(article);
                }
                break;
            case "content":
                articles.sort(Comparator.comparing(Article::getContent));
                for (Article article: articles) {
                    System.out.println(article);
                }
                break;
            case "author":
                articles.sort(Comparator.comparing(Article::getAuthor));
                for (Article article: articles) {
                    System.out.println(article);
                }
                break;
        }
    }
}
