import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Arstan", "arstan@mail.com", "man");
        Author author2 = new Author("Arlen", "arlen@mail.com", "man");
        Author author3 = new Author("Ayan", "ayan@mail.com", "man");
        Author author4 = new Author("Aybek", "aybek@mail.com", "man");
        Author author5 = new Author("Aynazik", "aynazik@mail.com", "woman");


        Author[] authors = {author1, author2, author3, author4, author5};

        Book book1 = new Book("My dream", "Dc. Jack", 1000, 5);
        Book book2 = new Book("Future", " Dc. James", 5000, 4);
        Book book3 = new Book("My dream", "Dc. Swep", 3000, 3);
        Book book4 = new Book("My dream", "Michael", 4000, 2);
        Book book5 = new Book("My dream", "Tom hard", 4500, 1);

        Book[] books = {book1, book2, book3, book4, book5};
        Scanner scanner = new Scanner(System.in);
        getNameCountry(scanner.next(), authors);
        getPrice(books);

    }


    public static void getPrice(Book[] books) {
        int max = books[0].getPrice();
        int min = books[0].getPrice();
        for (int a = 0; a < books.length; a++) {
            max = Math.max(max, books[a].getPrice());
            min = Math.min(min, books[a].getPrice());
        }
        System.out.println(max);
        System.out.println(min);


    }
    public static void getNameCountry(String getNameCountry,Author[]authors){
        for(Author author:authors){
            if(author.getFullName().equals(getNameCountry));
            System.out.println(author.toString());
        }
    }
}





