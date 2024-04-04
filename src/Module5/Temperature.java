package Module5;
/*
 * Задание:
 * Создать массив с температурами 30 пациентов. Температура должна генерироваться случайным
 * образом с помощью Math.random() в промежутке от 32 до 40 градусов. После этого отдельно
 * посчитать среднюю температуру по больнице и количество здоровых поциентов. И вывести
 * всё на экран. Список всех температур вывожить в строку.
 */
public class Temperature {
    public static void main(String[] args) {
        float[] client = new float[30];
        for (int i = 0; i < client.length; i++) {
            client[i] = (float)(Math.random() * 8 + 32);
        }
        float sumTemp = 0;
        int count = 0;
        for (float f: client){
            System.out.printf("%.2f ", f);
            sumTemp += f;
            if (f >= 36.6)
                count++;
        }
        System.out.println();
        System.out.printf("Средняя температура по больнице: %.2f\n", sumTemp / client.length);
        System.out.println("Количество здоровых пациентов: " + count);
    }
}
