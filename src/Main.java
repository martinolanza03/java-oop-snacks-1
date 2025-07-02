import com.bank.AccountBank;

public class Main {
    public static void main(String[] args) {
        AccountBank visa = new AccountBank(463266236);

        System.out.println(visa.numberBank);
        System.out.println(visa.balance);

        visa.setBalance(2000.10f);
        System.out.println(visa.getBalance());
        visa.setBalance(2200.10f);
        System.out.println(visa.getBalance());
    }
}
