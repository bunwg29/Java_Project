public interface UserInterface {
    void deposit(double amount);
    void transfer(double amount, User recipient, String recipientAccountId);
    void withdraw(double amount);
    double checkBalance();
}