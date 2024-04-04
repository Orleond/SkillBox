package Module5;
/*
 * Задание 1:
 * Перевернуть массив colors наоборот.
 */
public class Colors {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";

        String[] colors = text.split(",?\\s+");
        String temp;

        int j = colors.length - 1;
        for (int i = 0; i < colors.length / 2; i++) {
            temp = colors[i];
            colors[i] = colors[j];
            colors[j] = temp;
            j--;
        }
        System.out.println();
        for (String s: colors)
            System.out.println(s);
    }
}
