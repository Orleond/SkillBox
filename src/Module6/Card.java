package Module6;
/*
 * Задание 1:
 * Создать класс, который будет представлять собой расчетный счет в банке с тремя основными
 * методами: положить деньги, снять деньги, проверить баланс.
 * Создать два класса-наследника: депозитарный счет, с которого нельзя снимать деньги в
 * течение месяца после последнего пополнения и карточный счет, при снятии с которого
 * будет взыматься комиссия 1 процент.
 */

public class Card extends BankAccount {
    public Card() {
        super();
    }

    public Card(int money) {
        super(money);
    }

    public void getMoney(int sum) {
        int sumWithPercent = sum + (int)Math.ceil(sum * 0.01);
        if (sumWithPercent > super.checkBalance())
            System.out.println("На балансе недостаточно средств");
        else
            super.getMoney(sumWithPercent);
    }
}
