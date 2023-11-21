import java.util.List;
import java.util.ArrayList;
public class Library {
    private List<Student> students;
    private List<Book> books;
    //Constructor
    public Library() {
        this.students = new ArrayList<Student>();
        this.books = new ArrayList<Book>();
    }

    // Show List of students
    public List<Student> ShowStudent()
    {
        return this.students;
    }

    // Show List of Books
    public List<Book> ShowBookInLibrary()
    {
       return this.books;
    }

    // Add student
    public void addStudent(String id, String name, String clas)
    {
        Student studentn = new Student(id, name, clas);
        this.students.add(studentn);
    }

    // Add Book
    public void addBook(String id, String name) {
        Book bookn = new Book(id, name);
        this.books.add(bookn);
    }

    // Funtions to find Student and Book support for features
    public Student findStudent(String id)
    {
        for(Student student : students)
        {
            if(student.getId().equals(id))
            {
                return student;
            }
        }
        return null;
    }
 
    public Book findBook(String id)
    {
        for(Book book : books)
        {
            if(book.getId().equals(id))
            {
                return book;
            }
        }
        return null;
    }

    // Funtions to borrow book
    public List<Book> borrowed = new ArrayList<Book>();
    public void BorrowBook(String studentId, String bookId){
    
        Student s1 = findStudent(studentId);
        Book b1 = findBook(bookId);

        if(s1 != null && b1 != null)
        {
            books.remove(b1);
            borrowed.add(b1);
            System.out.println("Borrow Book Successfully");
        }
        else
        {
            System.out.println("Not exist student or book");
        }
    }

    // Funtions to find book borrowed
    public Book findBookBorrowed(String id)
    {
        for(Book b : borrowed)
        {
            if(b.getId().equals(id))
            {
                return b;
            }
        }
        return null;
    }


    // Funtions to give book back
    public void giveBookBack(String studentId, String bookid)
    {
        Student s1 = findStudent(studentId);
        Book b1 = findBookBorrowed(bookid);
        if(s1 != null && b1 != null)
        {
            books.add(b1);
            borrowed.remove(b1);
            System.out.println("Give Book Back Sucessfully");
        }
        else
        {
            System.out.println("Not exist student or book");
        }
    }

    // List of book borrowed
    public List<Book> BookBorrowed()
    {
        return this.borrowed;
    }
}
