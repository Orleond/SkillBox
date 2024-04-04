package Module2;
/*
 * Задание:
 * Написать код, который будет печатать значения min, middle и max в зависимости от возроста
 */

public class Ages {
    public static void main(String[] args) {
        int vasyaAge = 25;
        int katyaAge = 22;
        int mishaAge = 25;

        int min = -1;
        int middle = -1;
        int max = -1;
        min = Math.min(vasyaAge, katyaAge);
        min = Math.min(min, mishaAge);

        max = Math.max(vasyaAge, katyaAge);
        max = Math.max(max, mishaAge);
        if (vasyaAge != min && vasyaAge != max)
            middle = vasyaAge;
        if (katyaAge != min && katyaAge != max)
            middle = katyaAge;
        if (mishaAge != min && mishaAge != max)
            middle = mishaAge;
        if (middle == -1) {
            if (mishaAge == katyaAge || mishaAge == vasyaAge)
                middle = mishaAge;
            else
                middle = katyaAge;
        }

        System.out.println("min = " + min);
        System.out.println("middle = " + middle);
        System.out.println("max = " + max);
    }
}
