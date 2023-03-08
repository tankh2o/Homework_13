public class Main {
    public static void main(String[] args) {
        Author author = new Author("Irwin", "Yalom");

        Book book = new Book("Вглядываясь в солнце", 2008, author);
        System.out.println(" Автор - " + author.getName() + author.getFamily() + ". Произведение - " + book.getName() + " - " + book.getPublicationYear() + " года издания.");

        System.out.println(author);
        System.out.println(book);











    }
}