package Module6;
/*
 * Задание 1:
 * Создайте класс компании Company, содержащей сотрудников и реализующей методы:
 *      •	найм одного сотрудника — hire(),
 *      •	найм списка сотрудников – hireAll(),
 *      •	увольнение сотрудника – fire(),
 *      •	получение значения дохода компании – getIncome().
 * Аргументы и возвращаемое значение методов выберите на основании логики работы вашего приложения.
 * Создайте два метода, возвращающие список указанной длины (count). Они должны содержать сотрудников,
 * отсортированных по убыванию и возрастанию заработной платы:
 *      •	List<Employee> getTopSalaryStaff(int count),
 *      •	List<Employee> getLowestSalaryStaff(int count).
 * Создайте классы сотрудников с информацией о зарплатах и условиями начисления зарплаты:
 *      •	Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных
 *          для компании денег. Количество заработанных денег для компании генерируйте случайным образом
 *          от 115 000 до 140 000 рублей.
 *      •	TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной
 *          платы, если доход компании более 10 млн рублей.
 *      •	Operator — зарплата складывается только из фиксированной части.
 * Каждый класс сотрудника должен имплементировать интерфейс Employee. В интерфейсе Employee должен быть
 * объявлен метод, возвращающий зарплату сотрудника:
 *      •	getMonthSalary()
 * Аргументы и возвращаемое значение метода выберите в соответствии с логикой начисления зарплат.
 * Для демонстрации и тестирования работы ваших классов:
 *      1.	Создайте и наймите в компанию: 180 операторов Operator, 80 менеджеров по продажам Manager,
 *          10 топ-менеджеров TopManager.
 *      2.	Распечатайте список из 10–15 самых высоких зарплат в компании.
 *      3.	Распечатайте список из 30 самых низких зарплат в компании.
 *      4.	Увольте 50% сотрудников.
 *      5.	Распечатайте список из 10–15 самых высоких зарплат в компании.
 *      6.	Распечатайте список из 30 самых низких зарплат в компании.
 * Примеры вывода списка зарплат
 *  Список из пяти зарплат по убыванию:
 *      •	230 000 руб.
 *      •	178 000 руб.
 *      •	165 870 руб.
 *      •	123 000 руб.
 *      •	117 900 руб.
 * Рекомендации
 *      •	Можно создавать разные экземпляры компании со своим списком сотрудников и доходом.
 *      •	Чтобы получить данные компании внутри класса сотрудника, настройте хранение ссылки на Company и
 *          передавайте объект Company с помощью конструктора или сеттера.
 *      •	Учтите, в методы получения списков зарплат могут передаваться значения count, превышающие количество
 *          сотрудников в компании, или отрицательные.
 */

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static final int FIXED_SALARY_FOR_MANAGER = 60000;
    public static final int FIXED_SALARY_FOR_TOP_MANAGER = 90000;
    public static final int FIXED_SALARY_FOR_OPERATOR = 40000;
    private int income;
    private final List<Employee> employeeList;
    public Company() {
        income = 0;
        employeeList = new ArrayList<>();
    }
    public void hire(Employee e) {
        employeeList.add(e);
        income += e.getEarnedMoneyForTheCompany();
    }

    public void hireAll(List<Employee> employeeList) {
        this.employeeList.addAll(employeeList);
        for (Employee e: employeeList)
            income += e.getEarnedMoneyForTheCompany();
    }
    public void fire(int count) {
        for (int i = 0; i < count; i++) {
            income -= employeeList.get(employeeList.size() - 1).getEarnedMoneyForTheCompany();
            employeeList.remove(employeeList.size() - 1);
        }
    }

    public int getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count > employeeList.size() - 1 || count < 0) {
            System.out.println("Ошибка. Указано неверное количество сотрудников");
            return null;
        }
        List<Employee> list = new ArrayList<>();
        employeeList.sort((o1, o2) -> o2.getMonthSalary() - o1.getMonthSalary());
        for (int i = 0; i < count; i++) {
            list.add(employeeList.get(i));
        }
        return list;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count > employeeList.size() - 1 || count < 0) {
            System.out.println("Ошибка. Указано неверное количество сотрудников");
            return null;
        }
        List<Employee> list = new ArrayList<>();
        employeeList.sort((o1, o2) -> o1.getMonthSalary() - o2.getMonthSalary());
        for (int i = 0; i < count; i++) {
            list.add(employeeList.get(i));
        }
        return list;
    }

    public List<Employee> getEmployeeList() { return employeeList; }
}
