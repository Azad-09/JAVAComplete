import java.util.Scanner;
 public class BinarySorting{
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the item which you want to search");  
    int num = sc.nextInt();  
    int arr[] = {10,12,14,16,18,20};
    int arrL = arr.length;
    
    int index = binarySort(arr, num, 0, arrL - 1);
    if (index == -1)
      System.out.println("Sorry!!! Not found");
    else
      System.out.println("Element found at index " + index);
  }

   public static int binarySort(int array[], int num2Search, int start, int end) {

    // Repeat until the pointers low and high meet each other
    while (start <= end) {
      int midInd = (start + end) / 2;

      if (array[midInd] == num2Search)
        return midInd;
      if (array[midInd] < num2Search)
        start = midInd + 1;
      else
        end = midInd - 1;
    }
    return -1;

  }

}

