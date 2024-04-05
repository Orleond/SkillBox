package Module6;
/*
 * Задание 1:
 * Создать класс, который будет представлять собой расчетный счет в банке с тремя основными
 * методами: положить деньги, снять деньги, проверить баланс.
 * Создать два класса-наследника: депозитарный счет, с которого нельзя снимать деньги в
 * течение месяца после последнего пополнения и карточный счет, при снятии с которого
 * будет взыматься комиссия 1 процент.
 */

import java.time.LocalDate;
public class Deposit extends BankAccount {
    private LocalDate lastDeposit;
    private LocalDate nextDeposit;

    public Deposit() {
        super();
        nextDeposit = LocalDate.now().plusMonths(1);
    }

    public Deposit(int money) {
        super(money);
        nextDeposit = LocalDate.now().plusMonths(1);
    }

    public void putMoney(int money) {
        if (money <= 0)
            System.out.println("Положить можно только положительную сумму");
        else {
            super.putMoney(money);
            nextDeposit = LocalDate.now().plusMonths(1);
            System.out.println(nextDeposit);
        }
    }

    public void getMoney(int sum) {
        if (LocalDate.now().isBefore(nextDeposit))
            System.out.println("Ошибка! Не прошел месяц с последнего пополнения депозита!");
        else if (sum > super.checkBalance())
            System.out.println("На балансе недостаточно средств");
        else {
            super.getMoney(sum);
        }
    }

}
