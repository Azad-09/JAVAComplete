 class BookStore{
    String genre;
    String authorName;
    String custName;

    
}

class MainProg{
        public static void main(String [] args){

            BookStore raja = new BookStore();
            raja.custName = "Raja Babu";
            raja.authorName = "Hargobind Khurrana";
            raja.genre = "Self- Help";
            System.out.println("Name of Customer: " + raja.custName + "\n" + " Author Name: " + raja.authorName + "\n"  + " Genre: " + raja.genre);

            BookStore azad = new BookStore();
            azad.custName = "Azad Mahapatra";
            azad.authorName = "Jai Shankar";
            azad.genre = "Foreign Affairs"; 
            System.out.println("Name of Customer: " + azad.custName +  "  Author Name: " + azad.authorName +  " Genre: " + azad.genre);
        }
    }