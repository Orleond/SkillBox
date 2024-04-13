package Module7.LambdaExpressions;
/*
 * Задание 1:
 * Написать сортировку с помощью лямбда-выражения по зарплате и по алфавиту одновременно
 *
 * Задание 2:
 * С помощью Stream API в одну строчку распечатать максимальную зарплату среди тех, кто пришел
 * на работу в 2017 году
 */

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class Main
{
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args)
    {
        ArrayList<Employee> staff = loadStaffFromFile();

        staff.stream()
                .filter(e -> {
                    String date = e.getWorkStart().toString();
                    return date.contains("2017");
                })
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

        Collections.sort(staff, (o1, o2) -> {
            if (o1.getName().equals(o2.getName()))
                return o1.getSalary().compareTo(o2.getSalary());
            return o1.getName().compareTo(o2.getName());
        });
        //staff.forEach(System.out::println);
    }

    private static ArrayList<Employee> loadStaffFromFile()
    {
        ArrayList<Employee> staff = new ArrayList<>();
        try
        {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for(String line : lines)
            {
                String[] fragments = line.split("\t");
                if(fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                    fragments[0],
                    Integer.parseInt(fragments[1]),
                    (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}