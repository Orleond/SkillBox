package Module4;
/*
 * Задание:
 * Выполнить очистку и преобразование вводимого номера телефона из консоли, при этом номер телефона может
 * быть в следующих форматах:
 *      +7 904v123-67-88
 *      8 (905) 6378277
 *      905 45822-01
 *
 * Результат должен быть выведен в формате:
 *      +7 903 123-45-64
 */
import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        number = number.replaceAll("[^0-9]", "");
        if (number.length() == 10)
            number = "7" +  number.substring(1);
        else
            number = "7" + number;
        number = "+" + number.charAt(0) + " " + number.substring(1, 4) + " " +
                number.substring(4, 7) + "-" + number.substring(7, 9) + "-" +
                number.substring(9);
        System.out.println(number);
    }
}
