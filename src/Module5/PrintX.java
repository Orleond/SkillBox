package Module5;
/*
 * Создать массив массивов строк таким образом, чтобы при его распечатке, чтобы распечатывался крестик
 * из крестиков
 */
public class PrintX {
    public static void main(String[] args) {
        String[][] arr = {
                {"X", " ", " ", " ", " ", " ", "X"},
                {" ", "X", " ", " ", " ", "X", " "},
                {" ", " ", "X", " ", "X", " ", " "},
                {" ", " ", " ", "X", " ", " ", " "},
                {" ", " ", "X", " ", "X", " ", " "},
                {" ", "X", " ", " ", " ", "X", " "},
                {"X", " ", " ", " ", " ", " ", "X"}
        };

        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
