public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");

        int initialAccount = 500;
        int depositAmount = 1001;
        int bonus = depositAmount / 100;
        int finalAccount = initialAccount + depositAmount;
        int finalAccountBonus = finalAccount + bonus;

        if (depositAmount > 1000) {
            System.out.println("Итоговый счёт: " + finalAccountBonus);
            System.out.println("Сумма бонуса: " + bonus);
        } else {
            System.out.println("Итоговый счет: " + finalAccount);
            System.out.println("Бонус не начислен");
        }
    }
}