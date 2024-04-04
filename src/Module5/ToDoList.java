package Module5;
/*
 * Написать программу, которая в себе хранит список дел, которой можно управлять из консоли. Команды
 * в консоли должны быть следующие:
 *      ADD какое-то дело
 *      LIST    пример вывода:
 *          0 - Перенести все книги в чулан
 *          1 - написать программу расчета числа пи
 *      ADD 0 какое-то еще дело
 *      DELETE 4
 *      EDIT 3 новое описание дела
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String task;
        String taskTitle;
        String taskBody = "";
        do {
            System.out.print("Введите команду (help): ");
            task = scanner.nextLine();
            if (task.split(" ").length == 1) {
                taskTitle = task;
            } else {
                taskTitle = task.substring(0, task.indexOf(" "));
                taskBody = task.substring(task.indexOf(" ")).trim();
            }
            switch (taskTitle) {
                case "help" -> help();
                case "ADD" -> added(taskBody, toDoList);
                case "LIST" -> printList(toDoList);
                case "EDIT" -> edit(taskBody, toDoList);
                case "DELETE" -> delElem(taskBody, toDoList);
            }
        } while(!task.equals("stop"));
    }

    public static void help() {
        System.out.println("""

                Список доступных команд:
                \tADD название дела
                \t\tдобавляет дело в список
                \tADD [N] название дела
                \t\tдобавляет дело в список под номером N
                \tLIST
                \t\tвыводит список дел
                \tEDIT [N] новое название дела
                \t\tотредактировать дело под номером N
                \tDELETE [N]
                \t\tудалить дело под номером N
                \tstop
                \t\tзавершить программу
                """);
    }
    public static void added(String str, ArrayList<String> toDoList) {
        int num = -1;
        if (hasNumber(str)) {
            num = Integer.parseInt(str.substring(0, str.indexOf(" ")));
            str = str.substring(str.indexOf(" ") + 1);
        }
        if (num == -1 || num > toDoList.size())
            toDoList.add(str);
        else
            toDoList.add(num, str);
    }
    public static boolean hasNumber(String str) {
        return (str.charAt(0) == '0' || str.charAt(0) == '1' || str.charAt(0) == '2' || str.charAt(0) == '3' ||
                str.charAt(0) == '4' || str.charAt(0) == '5' || str.charAt(0) == '6' || str.charAt(0) == '7' ||
                str.charAt(0) == '8' || str.charAt(0) == '9');
    }
    public static void printList(ArrayList<String> toDoList) {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " " + toDoList.get(i));
        }
    }
    public static void edit(String str, ArrayList<String> toDoList) {
        int num = -1;
        if (hasNumber(str)) {
            num = Integer.parseInt(str.substring(0, str.indexOf(" ")));
            str = str.substring(str.indexOf(" ") +1 );
        }
        if (num != -1 && num < toDoList.size())
            toDoList.set(num, str);
        else
            System.out.println("Элемент для редактирования не найден");
    }
    public static void delElem(String str, ArrayList<String> toDoList) {
        int index = Integer.parseInt(str);
        if (index < toDoList.size())
            toDoList.remove(index);
    }
}
