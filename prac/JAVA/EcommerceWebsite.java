import java.util.*;
public class EcommerceWebsite {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       // total money to be spent
       System.out.println("total amount :");
       int amount=sc.nextInt();
       //  cost of each item
       System.out.println("cost of each item :");
       int priceOfEachItem=sc.nextInt();
       // no of tags exchanged for one free item.
       System.out.println("no. of tags :");
       int tags=sc.nextInt();
       sc.close();
       System.out.println("The total number of items (purchased + free items) : "+countTotalItemsPurchasedIncludingFreeItem(amount , priceOfEachItem, tags));    
}

    static int count = 0;
    public static int countTags(int items, int tags){     
        if(items<tags){
            return count;
        }
        else{
            count++;
            countTags(items-tags, tags);
            return count;
        }
    }

    public static int countTotalItemsPurchasedIncludingFreeItem(int amount,int priceOfEachItem, int tags){
        int items = amount/priceOfEachItem;
        int freeItems = countTags(items, tags);
        return items + freeItems;
    }     
}