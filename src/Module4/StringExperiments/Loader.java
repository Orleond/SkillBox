package Module4.StringExperiments;
/*
 * Задание 1:
 * Написать код, использующий методы indexOf(), lastIndexOf, substring() и trim(), которые будут считать
 * сумму заработков всех людей в строке text.
 *
 * Задание 2:
 * Написать код с использованием регулярных выражений, который будет извлекать заработки любого количества
 * человек из строки и суммирует их
 */
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int sum = 0;
        int firstIndex = text.indexOf("заработал ");
        firstIndex += 10;
        int lastIndex = text.indexOf("рублей");
        sum += Integer.parseInt(text.substring(firstIndex, lastIndex).trim());
        firstIndex = text.indexOf("Петя");
        firstIndex += 7;
        lastIndex = text.indexOf("рубля");
        sum += Integer.parseInt(text.substring(firstIndex, lastIndex).trim());
        firstIndex = text.indexOf("Маша");
        firstIndex += 7;
        lastIndex = text.lastIndexOf("рублей");
        sum += Integer.parseInt(text.substring(firstIndex, lastIndex).trim());
        System.out.println(sum);
        System.out.println();

        text = text.replaceAll("[^ 0-9]", " ").trim();
        String[] salaries = text.split("\\s+");
        for (String s: salaries)
            sum += Integer.parseInt(s);
        System.out.println(sum);
    }
}