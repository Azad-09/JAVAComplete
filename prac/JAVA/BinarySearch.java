import java.util.Scanner;

public class BinarySearch {
 public static int binarySearch(int array[], int numberToBeSearch, int beg, int end) {

    // Repeat until the pointers low and high meet each other
    while (beg <=end) {
      int mid = (beg + end)/ 2;

      if (array[mid] == numberToBeSearch)
        return mid;

      if (array[mid] < numberToBeSearch)
        beg = mid + 1;

      else
        end= mid - 1;
    }

    return -1;
  }

  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in); 
    int array[] = {10,12,14,16,18,20};
    int n = array.length;
    System.out.println("Enter the item which you want to search");  
    int number = sc.nextInt();  
    
    int index = binarySearch(array, number, 0, n - 1);
    if (index == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + index);
  }
}