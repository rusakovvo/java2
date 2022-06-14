public class Origin {
    public static void main(String[] args) {
        int accountBalanceBefore = 100; // изначальный баланс
        int addedMoney = 1100; // дополнительно внесено на счет
        int accountBalanceAfter = accountBalanceBefore + addedMoney;

        int bonusMoney;
        if (addedMoney > 1000) {
            bonusMoney = addedMoney / 100;
        } else {
            bonusMoney = 0;
        }
        System.out.println("начислено бонусных рублей " + bonusMoney);
        System.out.println("изначальный баланс " + accountBalanceBefore);
        System.out.println("внесено на счет " + addedMoney);
        System.out.println((bonusMoney + accountBalanceAfter) + " текущий баланс, с учетом бонусных рублей");
    }
}
