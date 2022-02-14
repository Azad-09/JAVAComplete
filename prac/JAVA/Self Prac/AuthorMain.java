class Author{
    // Scopep-Specifier here is Private and can only be accesed by the member of class Author
    private String bookName;  
    private String authName;
    private String bookGenre;
    private double price;

    public void setBookName(String bokName){
        bookName = bokName;

    }
    public void setAuthorName(String autName){
        authName = autName;

    }
    public void setBookGenre(String bokGenre){
        bookGenre = bokGenre;

    }
    public void setBookPrice(double bokPri){
        price = bokPri;

    }

    public String details(){
        return ("Name of the book is: " + bookName + " and the author of the books is: " + authName + " it comes under the genre: " + bookGenre + " and it cost approximately around Rs" + price + "/-");
    } 


    
}

class AuthorMain{
    public static void main (String [] args){
        Author authObj = new Author();

        // Initialisation
        authObj.setBookName("Death");
        authObj.setAuthorName("SadhGuru");
        authObj.setBookGenre("Self-Help");
        authObj.setBookPrice(230);

        // Manipulation
        String authDetails;
        authDetails = authObj.details();

        // Display details
        System.out.println(authDetails);
    }
}