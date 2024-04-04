package Module4.IntegerExperiments;
/*
 * Задание 1:
 * Найти в этом проекте ошибку и исправить ее заменой Integer на int.
 *
 * Задание 2:
 * Реализовать метод sumDigits(), чтобы он считал сумму цифр в числе, используя методу Integer.toString
 * и используя методы строки charAt() и length().
 */
public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(container.count));
    }

    public static Integer sumDigits(Integer number)
    {
        int sum = 0;
        String num = Integer.toString(number);
        for (int i = 0; i < num.length(); i++) {
            sum += num.charAt(i)-48;
        }
        return sum;
    }
}
