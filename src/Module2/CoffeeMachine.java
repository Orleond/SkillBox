package Module2;

public class CoffeeMachine {
    public static void main(String[] args) {
        int moneyAmount = 10;  // Количество внесенных денег в кофемашину

        int cappucinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;

        boolean isMilkEnough = false;
        boolean canByAnything = false;
        boolean moneyEnoughForCappucino = moneyAmount >= cappucinoPrice;
        boolean moneyEnoughForlatte = moneyAmount >= lattePrice;
        boolean moneyEnoughForEspresso = moneyAmount >= espressoPrice;
        boolean moneyEnoughForWater = moneyAmount >= waterPrice;

        if (moneyEnoughForCappucino && isMilkEnough) {
            System.out.println("Вы можете купить каппучино");
            canByAnything = true;
        }

        if (moneyEnoughForlatte && isMilkEnough) {
            System.out.println("Вы можете купить латте");
            canByAnything = true;
        }

        if (moneyEnoughForEspresso) {
            System.out.println("Вы можете купить эспрессо");
            canByAnything = true;
        }

        if (moneyEnoughForWater) {
            System.out.println("Вы можете купить воду");
            canByAnything = true;
        }

        System.out.println(canByAnything ? "Выберите напиток: " : "Недостаточно средств!");
    }
}
