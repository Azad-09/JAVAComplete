public class Sprint09{
    public static void main(String[] args){
                System.out.println(bol());
          }
    
    public static boolean bol(){
        int arr[] = {101, 102, 101, 103, 104};
         int i = 0;
         for(i = 0; i < arr.length; i++){
             if(arr[i] != arr[i + 1])
                return true;
            else
                return false;
    }
    }
}