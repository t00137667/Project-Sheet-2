import javax.swing.*;

public class BookUserInterface {
    static String title, ISBN;
    static float price;
    static int numPages;

    public static void main(String[] args) {

        //Enter the first book

        bookInput(1);

        Book favouriteBook = new Book(title,price,ISBN,numPages);

        //Enter the second book
        bookInput(0);

        Book leastBook = new Book(title,price,ISBN,numPages);

        System.out.println(favouriteBook.toString());
        System.out.println(leastBook.toString());

        //String outputFormat = String.format("",);



        JOptionPane.showMessageDialog(null,"Favourite Book:\n"+
                "\nTitle: "+favouriteBook.getTitle() +
                "\nPrice: "+favouriteBook.getPrice() +
                "\nISBN: "+favouriteBook.getISBN() +
                "\nNumber of pages: "+favouriteBook.getNumberOfPages(),"Book Info List",JOptionPane.PLAIN_MESSAGE);


    }
    private static void bookInput(int i)
    {
        String titleText;

        if (i == 1)
            titleText = "Favourite ";
        else
            titleText = "Least Favourite ";

        title = JOptionPane.showInputDialog(null,"Please enter the title of the book",titleText + "Book",1);
        price = Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the price of the book",titleText + "Book",2));
        ISBN = JOptionPane.showInputDialog(null,"Please enter the ISBM of the book (10 or 13 characters)",titleText + "Book",3);
        numPages = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of pages in the book",titleText + "Book",0));
    }
}
