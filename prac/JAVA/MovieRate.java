import java.util.*;
public class MovieRate{
    public static void main (String args []){
        String [][] arr = new String[5][2]; 
        Scanner sc = new Scanner (System.in);
        String[] movieName = new String[5];
        double[] rating = new double[5];
        System.out.println("Enter the movie name:");
        for(int i = 0; i < movieName.length; i++){
            movieName[i] = sc.nextLine();
        }
        System.out.println("Enter the rating:");
        for(int i = 0; i < rating.length; i++){
            rating[i] = sc.nextDouble();
        }

        arr = movieMap(movieName, rating);
        System.out.println("Movie Name \t Rating");
        System.out.println("-------------------------------");
        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 2; j++){

                System.out.print(arr[i][j] + "\t\t\t");
            }

            System.out.println();
        }

    }

    public static String[][] movieMap(String movie[], double rating[]){
        String Arr[][] = new String[5][2];

        for(int i = 0; i < 5; i++ ){

            for(int j = 0; j < 2; j++){
                
                if(j == 1){

                    if(rating[i]>= 4.5 && rating[i] <= 5)
                    Arr[i][j] = "Excellent";
                    else if(rating[i] >= 4 && rating[i] < 4.5 )
                    Arr[i][j] = "Good";
                    else if(rating[i] >= 3 && rating[i] < 4)
                    Arr[i][j] = "Average";
                    else if(rating[i] >= 0 && rating[i] < 3)
                    Arr[i][j] = "Bad";
                }
                Arr[i][j] = (j == 0)? movie[i] : Arr[i][j];
            }
        }
        return Arr;
    }
}