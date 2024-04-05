package Module5;
/*
 * Задание 1:
 * Написать программу, в которой будет хранится перечень e-mail'ов. E-mail'ы можно добавлять через консоль и
 * можно печатать их полный список командой list. Перечень e-mail'ов должен быть уникальным
 *
 * Задание 2:
 * Проверять корректность добавляемых e-mail'ов и, если он некорректный, писать об этом в консоль
 */

import java.util.HashSet;
import java.util.Scanner;
public class MailList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        HashSet<String> mailList = new HashSet<>();

        do {
            System.out.print("Введите e-mail: ");
            email = scanner.nextLine();
            if (email.equals("list"))
                for (String mail: mailList)
                    System.out.println(mail);
            else if (!email.equals("stop"))
                if (isCorrectEmail(email))
                    mailList.add(email);
                else
                    System.out.println("Некорректный ввод e-mail, повторите попытку.");
        } while (!email.equals("stop"));
    }

    public static boolean isCorrectEmail(String mail) {
        return mail.matches("\\w+[@]\\w+[.]\\w{2,4}");
    }
}
