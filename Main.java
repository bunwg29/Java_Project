import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. To show infor of student ");
            System.out.println("2. To show infor of book in library");
            System.out.println("3. Add Student");
            System.out.println("4. Add Book");
            System.out.println("5. Borrow Book");
            System.out.println("6. Give Book Back");
            System.out.println("7. List of Book that borrowed");
            System.out.println("8.Exit");
            String line = scanner.nextLine();
            switch (line) {
                case "1":
                    System.out.println(library.ShowStudent());
                    break;
                case "2":
                    System.out.println(library.ShowBookInLibrary());
                    break;
                case "3":
                    System.out.println("Enter id of student:");
                    String ids = scanner.nextLine();
                    System.out.println("Enter name of student");
                    String names = scanner.nextLine();
                    System.out.println("Enter class of student");
                    String classs = scanner.nextLine();
                    library.addStudent(ids, names, classs);
                    break;
                case "4":
                    System.out.println("Enter id of book");
                    String idb = scanner.nextLine();
                    System.out.println("Enter name of book");
                    String nameb = scanner.nextLine();
                    library.addBook(idb, nameb);
                    break;
                case "5":
                    System.out.println("Enter id of student");
                    String studentId = scanner.nextLine();
                    System.out.println("Enter id of book that want borrow");
                    String bookId = scanner.nextLine();
                    library.BorrowBook(studentId, bookId);
                    break;
                case "6":
                    System.out.println("Enter id of student");
                    String studentIdb = scanner.nextLine();
                    System.out.println("Enter id of book that borrowed");
                    String bookIdb = scanner.nextLine();
                    library.giveBookBack(studentIdb,bookIdb);
                    break;
                case "7":
                    System.out.println(library.BookBorrowed());
                    break;
                case "8":
                    return;
                default:
                    System.out.println("Enter again!");
            }
        }
    }
}
