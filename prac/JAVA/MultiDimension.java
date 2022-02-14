public class MultiDimension{
    public static void main(String args[]){
        int markTally[][] = {{43,21,35}, {33,11,25}, {13,20,32}};
        for(int i = 0; i<3;i++){
            for(int k = 0; k < 3; k++){
                System.out.print(markTally[i][k]+ "\t");
            }
            System.out.println();
        }

        System.out.println();
///////////////////////////////////////////
         for(int i = 0; i<3;i++){
             int sum = 0;
            for(int k = 0; k < 3; k++){
                sum = sum + markTally[k][i];
            }
            System.out.println("Sum of column " + (i + 1) + " is: " + sum);
        }

        System.out.println();
///////////////////////////////////////////////  
             int addleft = 0, addRight = 0 ;      
         for(int i = 0; i<3;i++){
            
            for(int k = 0; k < 3; k++){
                if(i == k)
                addleft = addleft + markTally[i][k];

                if(i + k == 2)
                addRight = addRight + markTally[i][k];
            }
        }
            System.out.println("Sum of diagonal is: " + addleft);
            System.out.println("Sum of diagonal is: " + addRight);
    }
}