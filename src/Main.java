public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Irwin", "Yalom");
        Author author2 = new Author("Irwina", "Yaloma");


        if (author1.equals(author2)) {
            System.out.println("Равны через .equals()");
        } else {
            System.out.println("Не равны через .equals()");
        }








    }
}