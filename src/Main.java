public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int score = 50000;
        int bonus = score / 100;

        System.out.println("Счёт клиента :" + balance);
        System.out.println("Сумма пополнения :" + score);
        if (score > 1050) {
            System.out.println("Сумма бонусов :" + bonus);
        } else {
            System.out.println("Сумма бонусов :" + 0);
        }
        int account = balance + score + bonus;
        if (score > 1050) {
            System.out.println("Итого :" + account);
        } else {
            System.out.println("Итого :" + (balance + score));
        }
    }
}