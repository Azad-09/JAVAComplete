import java.util.*;
public class LinearSorting{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the score of the player:");
        int score  = sc.nextInt();
        int[] plyScore = {32, 55, 70, 99, 95};
        String[] plyName = {"Pujara", "Virat", "Dhoni", "Tendulkar", "Gambhir"};
        for(int i = 0; i < plyScore.length; i++){
            if(score == plyScore[i]){
                System.out.println("Player who scored the inputed score is: " + plyName[i]);
                //break;
            }else{
                System.out.println("There is no player who stand to your Expectation");
                break;
            }
        }
        
    }

    
}