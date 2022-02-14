class NumberFormat{
    public static void main (String [] args){
        try{
            String name =  "Azad";
            double con = Double.parseDouble(name);
            System.out.println(con);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}