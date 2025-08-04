import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormats {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String format1 = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String format2 = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String format3 = date.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy"));

        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
    }
}
