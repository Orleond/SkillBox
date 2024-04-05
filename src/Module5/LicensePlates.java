package Module5;
/*
 * Задание 1:
 * Написать программу, которая генерирует "блатные" автомобильные номера в формате "А333АА197",
 * который состоит из букв, имеющихся как в русском, так и в латинском алфавите (СМТВАРОНЕУКХ),
 * одинаковые цифры и все регионы с 1 по 197. Добавит их в ArrayList. Ниже добавить бесконечный
 * цикл, в котором из консоли получается автомобильный номер. Дальше этот номер должен искаться
 * в листе четырмя разными способами:
 *      1. Прямой перебор элементов (list.contains()
 *      2. Бинарный поиск (Collections.binarySearch()) (Список изначально должен быть создан отсортированным)
 *      3. Поиск с помощью HashSet
 *      4. Поиск с помощью TreeSet
 * Необходимо замерять время каждого из способов поиска и распечатывать его каждый раз.
 */

import java.util.*;
public class LicensePlates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String consoleLine;
        char[] letters = { 'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х' };
        ArrayList<String> licensePlatesList = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 0; k < letters.length; k++) {
                    for (int l = 0; l < letters.length; l++) {
                        for (int m = 1; m < 198; m++) {
                            licensePlatesList.add("" + letters[i] + j + j + j + letters[k] + letters[l] + m);
                        }
                    }
                }
            }
        }
        HashSet<String> hSet = new HashSet<>(licensePlatesList);
        TreeSet<String> tSet = new TreeSet<>(licensePlatesList);
        do {
            System.out.print("Введите искомый номерной знак: ");
            consoleLine = scanner.nextLine();
            if (!consoleLine.equals("stop")) {
                long endTime;
                long startTime = System.currentTimeMillis();
                if (licensePlatesList.contains(consoleLine)) {
                    endTime = System.currentTimeMillis();
                    System.out.println("Время выполнения поиска прямым перебором: " +
                            (endTime - startTime) + "мс");
                } else
                    continue;

                Collections.sort(licensePlatesList);
                startTime = System.currentTimeMillis();
                int a = Collections.binarySearch(licensePlatesList, consoleLine);
                endTime = System.currentTimeMillis();
                System.out.println("Время выполнения бинарного поиска: " +
                            (endTime - startTime) + "мс");

                startTime = System.currentTimeMillis();
                boolean t = hSet.contains(consoleLine);
                endTime = System.currentTimeMillis();
                System.out.println("Время выполнения поиска по HashSet: " +
                        (endTime - startTime) + "мс");

                startTime = System.currentTimeMillis();
                t = tSet.contains(consoleLine);
                endTime = System.currentTimeMillis();
                System.out.println("Время выполнения поиска по TreehSet: " +
                        (endTime - startTime) + "мс");


            }
        } while (!consoleLine.equals("stop"));
    }
}
