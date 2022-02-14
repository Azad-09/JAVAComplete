 public class PalindromeString{

    public static void main (String args []){
        String[] arr = {"katak", "civic", "Radhe", "Shyam"};
        int result = findPalindromeWords(arr);
        System.out.println(result);
    }
 
    public static int findPalindromeWords(String[] words) {
          int count = 0 ;
    	 Arrays.sort(words) ;

    	for(int i = 0; i < words.length; i++) {
        StringBuffer sb = new StringBuffer(a[i]);
        sb.reverse();
        if (Arrays.binarySearch(words, i + 1, words.length, sb.toString()) > i)
            count ++ ;
    }
    return count ;
    }
}

