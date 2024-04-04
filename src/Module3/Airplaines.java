package Module3;
/*
 * Задание:
 * Подключить к проекту библиотеку airport и распечатать количество самолетов в аэропорту
 */
import com.skillbox.airport.Airport;

public class Airplaines {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        System.out.println(airport.getAllAircrafts().size());
    }
}
