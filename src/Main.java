public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");

        int initial_account = 500;
        int deposit_amount = 2000;
        int bonus = deposit_amount / 100;
        int final_account = initial_account + deposit_amount;

        if (deposit_amount >= 1100) {
            System.out.println("Итоговый счёт: " + final_account);
            System.out.println("Сумма бонуса: " + bonus);
        } else {
            System.out.println("Итоговый счет: " + final_account);
            System.out.println("Бонус не начислен");
        }
    }
}