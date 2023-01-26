public class Main {

    public static void main(String[] args) {
        int balance = 1100;
        int addedend = 100;

        int bonus = 1;
        if (balance > 1000) {
            bonus = balance / 100;
        }

        int finalBalance = balance + addedend + bonus;

        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус: " + bonus);

    }
}
