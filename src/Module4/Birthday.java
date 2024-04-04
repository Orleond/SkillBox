package Module4;
/*
 * Задание 1:
 * Написать код, который будет печатать ваши дни рождения и их дни недели.
 * Год 1991 - Mon
 *
 * Задание 2:
 * Сделать вывод по-русски.
 */
import java.util.Calendar;

public class Birthday {
    public static void main(String[] args) {
        String[] days = {"Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"};
        Calendar calendar = Calendar.getInstance();
        for (int year = 1991; year < 2092; year++) {
            calendar.set(year, Calendar.OCTOBER, 21);
            System.out.println("Год " + year + " -- " + days[calendar.get(Calendar.DAY_OF_WEEK)-1]);
        }
    }
}
