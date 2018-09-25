public class Book {
    private String title;
    private float price;
    private String ISBN;
    private int numberOfPages;

    public String toString()
    {
        String output = String.format("%s%s%s%.0f%s%s%s%d","Title: ",getTitle()," Price: ",getPrice()," ISBN: ",getISBN()," Number Of Pages: ",getNumberOfPages());

        return output;
    }

    public Book()
    {
        title = "No Title";
        price = 0.00f;
        ISBN = "NO ISBN";
        int numberOfPages = 0;
    }

    public Book(String title,float price,String ISBN,int numberOfPages)
    {
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setNumberOfPages(numberOfPages);
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setPrice(float price)
    {
        this.price = price;
    }
    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }
    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }
    public String getTitle()
    {
        return title;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public float getPrice()
    {
        return price;
    }
    public int getNumberOfPages()
    {
        return numberOfPages;
    }
}
