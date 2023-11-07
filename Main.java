import java.util.List;
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("DN-01","MB Bank");

        bank.CreateUser("100", "Bun", 2005, "1", "29", 5000000, "Cam Lo - Quang Tri");
        bank.CreateUser("101", "Hoang", 2005, "2", "30", 1000000, "Cam Lo - Quang Tri");
        bank.CreateUser("102", "Nguyen", 2005, "3", "31", 2000000, "Cam Lo - Quang Tri");

        System.out.println(bank.toString());

        List<User> userinBank = bank.getUserListByBankId("1");
        for (User user : userinBank) {
            System.out.println(user.toString());
            System.out.println("---------------------------------");
        }

        double totalBalance = bank.TotalMoneyOfBank();
        System.out.println("Total money in bank " + totalBalance);

        bank.deposit("100",1000000);
        bank.transfer("101","2","30",2000000);
        bank.withdraw("102",200000);

        bank.sort();
        System.out.println(bank.toString());
    }
}