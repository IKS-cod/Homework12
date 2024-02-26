public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Author authorOne = new Author("Михаил", "Булгаков");
        Book bookOne = new Book("Мастер и Маргарита",authorOne, 1967);
        Author authorTwo = new Author("Николай", "Гоголь");
        Book bookTwo = new Book("Мертвые души",authorTwo, 1841);
        bookTwo.setYearPublication(1842);
        System.out.println("authorOne.getName() = " + authorOne.getName());
        System.out.println("authorOne.getSurName() = " + authorOne.getSurName());
        System.out.println("bookOne.getTitle() = " + bookOne.getTitle());
        System.out.println("bookOne.getAuthor() = " + bookOne.getAuthor());
        System.out.println("bookOne.getYearPublication() = " + bookOne.getYearPublication());
        System.out.println("bookTwo.getYearPublication() = " + bookTwo.getYearPublication());
    }
}

class Book {
    private String title;
    private Author author;
    private int yearPublication;

    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author=author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

}

class Author {
    private String name;
    private String surName;

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }
}
