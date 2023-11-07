import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class Bank
{
    private String id;
    private String bankname;
    private List<User> users;

    public Bank(String id, String bankname)
    {
        this.id = id;
        this.bankname = bankname;
        this.users = new ArrayList<>();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getBankname() {
        return bankname;
    }
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public double TotalMoneyOfBank()
    {
        double total = 0;
        for(User user : users)
        {
            total += user.getAccountBalance();
        }
        return total;
    }
    @Override
    public String toString()
    {
        return "Bank ID: " + id + "\n" +
                "Bank Name: " + bankname + "\n" +
                "List of User: \n" + users + "\n" +
                "Total Money of Bank: " + TotalMoneyOfBank();
    }
    private User getUserById(String userId) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }
    public void CreateUser(String id, String userName, int yearOfBirth, String bankId, String accountId, double accountBalance, String address)
    {
        User nuser = new User(id,userName,yearOfBirth,bankId,accountId,accountBalance,address);
        users.add(nuser);
    }


    public List<User> getUserListByBankId(String bankId) {
        List<User> usersInBank = new ArrayList<>();
        for (User user : users) {
            if (user.getBankId().equals(bankId)) {
                usersInBank.add(user);
            }
        }
        return usersInBank;
    }

    public void deposit(String userId, double amount) {
        User user = getUserById(userId);
        if (user != null) {
            user.deposit(amount);
        } else 
        {
            System.out.println("Not existing user");
        }
    }

    public void transfer(String senderId, String recipientId, String recipientAccountId, double amount)
    {
        User sender = getUserById(senderId);
        User recipient = getUserById(recipientId);
        
        if(sender != null && recipient != null)
        {
            sender.transfer(amount, recipient, recipientAccountId);
        }
        else
        {
            System.out.println("Not existing");
        }
    }

    public void withdraw(String userId, double amount) {
        User user = getUserById(userId);
        if (user != null) {
            user.withdraw(amount);
        } else {
            System.out.println("Not existing user");
        }
    }

    public void sort()
    {
        users.sort(Comparator.comparingDouble(User::checkBalance));
    }  
    
    


}