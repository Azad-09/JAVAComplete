public class Test{
    public static void main (String ars []){
        System.out.println(maxNumber());
    }

    public static int maxNumber(){
	String[] words = {"katak", "madam", "Ram"};
	
	     int count = 0;
        String reverse = "";
        for(int i = 0; i < words.length; i ++){
            String orginal = words[i];
            for(int j = (words[i].length()-1); j >= 0; j--){
                reverse +=  orginal.charAt(j);
            }
            if(orginal == reverse){
                count = count + 1; 
            }
        }
        return count;

    }
}