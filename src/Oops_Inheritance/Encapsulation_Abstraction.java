package Oops_Inheritance;

// Problem 1
class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public char getGender() { return gender; }

    @Override
    public String toString() {
        return "Author{name='" + name + "', email='" + email + "', gender=" + gender + "}";
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() { return name; }
    public Author getAuthor() { return author; }
    public double getPrice() { return price; }
    public int getQtyInStock() { return qtyInStock; }

    public void setPrice(double price) { this.price = price; }
    public void setQtyInStock(int qtyInStock) { this.qtyInStock = qtyInStock; }

    public void printDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qtyInStock);
        System.out.println("Author Details: " + author);
    }
}

public class Encapsulation_Abstraction {
    public static void main(String[] args) {

        Author author = new Author("Shrunal Nimje", "shrunal@example.com", 'M');
        Book book = new Book("Java Mastery", author, 499.99, 100);
        book.printDetails();
    }
}
