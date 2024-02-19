package Test.PlayGround_old;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StringDate {
    public static void main(String[] args) {
        // Format y-M-d or yyyy-MM-dd
        String stringDate = "2017-07-25";
        String stringDate1 = "July 25, 2017";
        System.out.println(stringDate);
        // Convert String to Date using predefined formatters
        LocalDate date = LocalDate.parse(stringDate, DateTimeFormatter.ISO_DATE);
        System.out.println(date.plusDays(5));

        // Convert String to Date using pattern formatters
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date1 = LocalDate.parse(stringDate1, formatter);
        System.out.println(formatter);
        System.out.println(date1);

        // Using format method for the date
        int year = 2024;
        int month = 11;
        int day = 5;
        String europeanDatePattern = "dd.MM.yyyy";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        System.out.println(europeanDateFormatter.format(LocalDate.of(year, month, day)));
    }
}
