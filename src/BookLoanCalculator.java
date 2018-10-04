import java.util.Calendar;
import java.util.GregorianCalendar;

public class BookLoanCalculator {
    public static void main(String[] args) {
        GregorianCalendar today, borrowDate, returnDate;

        today = new GregorianCalendar();
        borrowDate = new GregorianCalendar(2018,2,1);
        returnDate = new GregorianCalendar(2018, 9,4);

        System.out.println(-borrowDate.get(Calendar.DAY_OF_YEAR)+returnDate.get(Calendar.DAY_OF_YEAR));
    }
}
