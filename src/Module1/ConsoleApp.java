package Module1;
/*
 * Задание:
 * Исправить приложение так, чтобы оно печатало дату не в американском, а в российском формате.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleApp {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}
