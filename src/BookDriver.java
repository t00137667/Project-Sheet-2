public class BookDriver {
    public static void main(String[] args) {

        Book newBook = new Book();

        System.out.println(newBook.getTitle()+ " " +newBook.getPrice()+ " " +newBook.getISBN()+ " " +newBook.getNumberOfPages());

        newBook.setTitle("Book One");
        newBook.setPrice(10.00f);
        newBook.setISBN("1234567891234");
        newBook.setNumberOfPages(100);

        System.out.println(newBook.getTitle()+ " " +newBook.getPrice()+ " " +newBook.getISBN()+ " " +newBook.getNumberOfPages());
    }
}
