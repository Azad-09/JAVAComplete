import java.util.*;
class Author{
    private String book_name;
    private String author_name;
    private int book_cost;

    public String getBookName(){
        return book_name;
    }
    
    public String getAuthorName(){
        return author_name;
    }
    
    public String getBookCost(){
        return book_cost;
    }
}

class AuthorMain{

    Author obj1 = new Author();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Name of the Book:");
    obj1.getBookName() = sc.nextLine();
    System.out.println("Enter the Authors Name:");
    obj1.getAuthorName() = sc.nextLine();
    System.out.println("Enter the cost of the book:");
    obj1.getBookCost() = sc.nextInt();

    System.out.println("The name of the book is: " + obj1.getBookName + "\n" + "Authors name is: " + obj1.getAuthorName + "\n" + "Cost of the book: " + obj1.getBookCost);

}