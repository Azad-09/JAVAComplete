
class GenericMethodDemo{
    public static void main (String [] args){
        GenericMethod obj = new GenericMethod();
        System.out.println("Object in String Format: " + obj.display("Test"));
        System.out.println("Object in Int Format: " + obj.display(89));
        System.out.println("Object in Double Format: " + obj.display(89.96));
        System.out.println("Object in Long Format: " + obj.display(9337310049L));
    }

    public <T> T display(T value){
      return value;
  }
}