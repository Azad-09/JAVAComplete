class Three{
    public static void main(String [] args){
        try{
             //ArrayBoundException
        int a[] = {30,401,55};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Laag Gaye 😎");

        }


        // //NumberFormat
        // String str = "Sorry Mistake is Here 😢";
        // int number = parseInt(str);
        // System.out.println("Number: " + number);

    }
}