public class Main {
    public static void main(String[] args) {
        int x = 100;
        int s = 12000;
        int i = s / 100;

        System.out.println("Счёт клиента :" + x);
        System.out.println("Сумма пополнения :" + s);
        if (s > 1050) {
            System.out.println("Сумма бонусов :" + i);
        } else {
            System.out.println("Сумма бонусов :" + 0);
        }
        int a = x + s + i;
        if (s > 1050) {
            System.out.println("Итого :" + a);
        } else {
            System.out.println("Итого :" + (x + s));
        }
    }
}