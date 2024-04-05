package Module6;
/*
 * Задание 1:
 * Создать класс, который будет представлять собой расчетный счет в банке с тремя основными
 * методами: положить деньги, снять деньги, проверить баланс.
 * Создать два класса-наследника: депозитарный счет, с которого нельзя снимать деньги в
 * течение месяца после последнего пополнения и карточный счет, при снятии с которого
 * будет взыматься комиссия 1 процент.
 */
public class BankAccount {
    private int balance;
    public BankAccount() {
        balance = 0;
    }
    public BankAccount(int money) {
        balance = money;
    }

    public void putMoney(int money) {
        if (money <= 0)
            System.out.println("Положить можно только положительную сумму");
        else
            balance += money;
    }

    public void getMoney(int sum) {
        if (sum > balance)
            System.out.println("На балансе недостаточно средств");
        else {
            balance -= sum;
            System.out.println("Снятие средств прошло успешно");
        }
    }

    public int checkBalance() {
        System.out.println("Баланс счета: " + balance + " рублей");
        return balance;
    }
}
