package Module6;
/*
 * Задание 1:
 * Реализовать классы, которые будут представлять собой разные виды клиентов банка:
 * единый абстрактный класс Client и классы для физических лиц, юридических лиц и
 * индивидуальных предпринимателей, которые от этого класса наследуются. У каждого
 * клиента должен быть расчетный счет. Для физических лиц снятие с лицевого счета
 * без комиссии, для юридических лиц снятие облагалось комиссией в 1%, а для
 * индивидуальных предпринимателей пополнение облагалось комиссией 1%, если сумма
 * пополнения меньше 1000 р и 0,5%, если сумма ровна или больше 1000 р
 */

import java.util.HashSet;

abstract class Client {
    private int personalAccount;
    private int balance;
    private static final HashSet<Integer> personalAccountList = new HashSet<>();

    public Client() {
        do {
            personalAccount = (int)(Math.random() * 1000000);
        } while (personalAccountList.contains(personalAccount));
    }

    public void putMoney(int money) {
        if (money <= 0)
            System.out.println("Положить можно только положительную сумму");
        else {
            balance += money;
            System.out.println("Баланс пополнен на " + money + " руб.");
        }
    }
    public void getMoney(int money) {
        if (money > balance)
            System.out.println("Недостаточно средств");
        else {
            balance -= money;
            System.out.println("Операция снятия денег выполнена");
        }
    }
    public int checkBalance() {
        System.out.println("На балансе " + balance + " руб.");
        return balance;
    }
    public int getPersonalAccount() {
        return personalAccount;
    }
}
