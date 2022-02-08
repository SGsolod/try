public class Main {
    public static void main(String[] args) {
        int currentBalance = 125; //Текущий баланс
        int replenishmentAmount = 1250; //Сумма пополнения
        if (replenishmentAmount > 1000) {
            int bonus = replenishmentAmount / 100;
            int x = replenishmentAmount + currentBalance + bonus;
            System.out.println("На счет зачислено " + replenishmentAmount + " рублей.");
            System.out.println("Итоговая сумма на счете с учетом бонусов " + x + " рублей.");
        } else {
            int grandTotal = replenishmentAmount + currentBalance; //Итоговая сумма
            System.out.println("Сумма пополнения - " + replenishmentAmount + " рублей");
            System.out.println("Ваш баланс - " + grandTotal + " рублей");

        }
    }
}
