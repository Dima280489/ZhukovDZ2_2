public class Main {
    public static void main(String[] args) {
        int customerAccount = 100;
        int replenishmentAmount = 800;
        int bonus = 0;

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        }

        int finalBalance = customerAccount + replenishmentAmount + bonus;
        System.out.println("Итоговый баланс=" + finalBalance);
    }
}