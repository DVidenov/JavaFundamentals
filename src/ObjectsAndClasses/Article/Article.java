package ObjectsAndClasses.Article;

public class Article {
    private String title;
    private String content;
    private String author;

    //Constructor
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //methods
    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor (String newAuthor){
        this.author = newAuthor;
    }

    public void rename (String newTitle){
        this.title = newTitle;
    }

    @Override
    public String toString(){
        return title + " - " + content + ": " + author;
    }
}
