package Module4;
/*
 * Задание:
 * Написать класс, реализующий доставку гуманитарной помощи в ящиках. В программе имеются:
 * грузовики, контейнеры и ящики. В грузовик помещается 12 контейнеров. В контейнер помещается
 * 27 ящиков. Необходимо написать программу, которая получает на вход итоговое количество ящиков
 * и печатает номера грузовиков, номера контейнеров и номера ящиков, которые в них находятся.
 * Пример вывода:
 *      Грузовик 10
 *          Контейнер 57
 *              Ящик 543
 *              Ящик 544
 *              ...
 *          Контейнер 58
 *              Ящик 615
 *              Ящик 616
 *
 * Количество помещающихся контейнеров в грузовике и количество ящиков, помещающихся в контейнере
 * задать переменными в начале программы, чтобы их можно было менять.
 */
import java.util.Scanner;

public class Containers {
    public static void main(String[] args) {
        int maxConteiners = 12;
        int maxBoxes = 27;
        Scanner scanner = new Scanner(System.in);
        int boxes = scanner.nextInt();
        int containers = boxes / 12;
        if (containers % 12 != 0)
            containers++;
        int cargos = containers / 27;
        if (cargos % 27 != 0)
            cargos++;

        int containerCount = 1, boxCount = 1;
        for (int i = 1; i < cargos; i++) {
            System.out.println("Грузовик " + i);
            for (int j = 1; j <= maxConteiners; j++) {
                System.out.println("\tКонтейнер " + containerCount);
                for (int k = 0; k <= maxBoxes; k++) {
                    System.out.println("\t\tЯщик " + boxCount);
                    boxCount++;
                    if (boxCount == boxes)
                        break;
                }
                containerCount++;
                if (containerCount == containers)
                    break;
            }
        }
    }

}
