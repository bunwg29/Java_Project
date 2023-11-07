public class User implements UserInterface
{
    private String id;
    private String userName;
    private int yearOfBirth;
    private String bankId;
    private String accountId;
    private double accountBalance;
    private String address;
    private boolean isVIP;

    public User(String id, String userName, int yearOfBirth, String bankId, String accountId, double accountBalance, String address) {
        this.id = id;
        this.userName = userName;
        this.yearOfBirth = yearOfBirth;
        this.bankId = bankId;
        this.accountId = accountId;
        this.accountBalance = accountBalance;
        this.address = address;
        this.isVIP = accountBalance > 10000000;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public String getBankId() {
        return bankId;
    }
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public boolean isVIP() {
        return isVIP;
    }
    public void setVIP(boolean vIP) {
        isVIP = vIP;
    }

    @Override
    public void deposit(double amount) {
        accountBalance += amount;
    }
    @Override
    public void transfer(double amount, User recipient, String recipientAccountId) {
        if(checkBalance() >= amount && isVIP() == false)
        {
            accountBalance -= (amount + 2);
            recipient.deposit(amount);
        }
        if(checkBalance() >= amount )
        {
            accountBalance -= amount;
            recipient.deposit(amount);
        }
        else
        {
            System.out.println("Not enough money to transfer");
        }
    }
    @Override 
    public void withdraw(double amount) {
        if(checkBalance() >= amount)
        {
            if(amount >= 50000)
            {
                this.accountBalance -= amount;
            }
            else
            {
                System.out.println("The lowest amount to withdraw is 50,000");
            }
        }
        else
        {
            System.out.println("Not enough money to withdraw");
        }
    }
    @Override
    public double checkBalance() {
        return  accountBalance;
    }
    @Override
    public String toString() {
        return "\nID: " + id + "\n" +
                "Name: " + userName + "\n" +
                "Age: " + yearOfBirth + "\n" +
                "Account Number: " + accountId + "\n" +
                "Account Balance: " + accountBalance + "\n" +
                "Address: " + address + "\n";
    }
}