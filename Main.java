import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Room room = new Room();
        while(true)
        {
        System.out.println("-----MANAGER HOTEL-----");
        System.out.println("Enter 1 to add new Person");
        System.out.println("Enter 2 to show information the customer of hotel");
        System.out.println("Enter 3 to get price");
        System.out.println("Enter 4 to remove persons");
        System.out.println("Enter 5 to exit programing");
        String line = scanner.nextLine();
        switch (line) {
            case "1":
                System.out.println("Enter name of customer");
                String name = scanner.nextLine();
                
                System.out.println("Enter identify of customer");
                String id = scanner.nextLine();
                System.out.println("Enter Phone number of customer");
                int pnumber = scanner.nextInt();
                System.out.println("Enter number of rental days");
                int day = scanner.nextInt();
                System.out.println("Enter type of room of customer");
                String type = scanner.next();
                room.addPerson(name, id, pnumber, day, type);
                break;
            case "2":
                System.out.println(room.toString());
                break;
            case "3":
                System.out.println("Enter identify of customer");
                String idd = scanner.next();
                System.out.println("Enter type room of customer");
                String typer = scanner.next();
                room.getPrice(idd,typer);
                break;
            case "4":
                System.out.println("Enter id of customer");
                String idr = scanner.nextLine();
                Person rid = room.getPersons(idr);
                if(rid != null)
                {
                room.removePerson(idr);
                }
                else
                {
                    System.out.println("Not exist customer");
                }
            break;
            case "5":
                return;
                
        } 
        }
    }
}
