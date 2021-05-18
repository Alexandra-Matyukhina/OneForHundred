public class Main {
    public static void main(String[] args) {

        double balance = 175.60; // баланс в рублях
        double payment = 1760; // пополнение в рублях
        double bonus = 1; // бонус за пополнение (руб)
        int bonusTerms = 100; // бонус за каждые 100 рублей
        int bonusLimit = 1000;
        double totalBonus = 0;

        if (payment > bonusLimit) {
            totalBonus = (int) payment / bonusTerms * bonus;
        }

        System.out.println("Total bonus = " + totalBonus);

        double newBalance = balance + payment + totalBonus;
        System.out.println("New balance = " + newBalance);


    }
}
