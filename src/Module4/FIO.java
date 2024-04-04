package Module4;
/*
 * Задание 1:
 * Написать программу, которая разделяет строку на Фамилию Имя и Отчество, при этом эту строку
 * программа должна принимать из консоли, чтобы пользователь печатал Фамилию Имя и Отчество, а она
 * разделяла автоматически и печатала их в виде:
 *      Фамилия: Иванов
 *      Имя: Пётр
 *      Отчество: Васильевич
 *
 * Задание 2:
 * Сделать эту программу устойчивой к ошибкам
 *
 * Задание 3:
 * Написать программу, которая разбивает строку на Фамилию Имя и Отчество с использованием
 * регулярного выражения
 */
import java.util.Scanner;

public class FIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fio;
        do {
            System.out.print("Введите ФИО в фомате \"Фамилия Имя Отчество\": ");
            fio = scanner.nextLine();
        } while (fio.split(" ").length != 3);
        System.out.println("Фамилия: " + fio.substring(0, fio.indexOf(" ")));
        System.out.println("Имя:" + fio.substring(fio.indexOf(" "), fio.lastIndexOf(" ")));
        System.out.println("Отчество:" + fio.substring(fio.lastIndexOf(" ")));
    }
}
