public class AccountManager {
    private double balance; //kişinin hesabındaki para miktarı
    public void deposit(double amount){
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws Exception {
        //withdraw hesaptan para çekmek anlamına gelir.
        if (balance>=amount){
            balance = getBalance() - amount;
        }else
            throw new BalanceInsufficentException("Bakiye yetersiz.");

    }

    public double getBalance() {
        return balance;
    }
}
