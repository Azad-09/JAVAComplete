class TwoDimensionalArray
{
public static void main(String[] args)
{ 
 int medalTally[][]=new int[][]{{46,37,38},{26,18,26},{27,23,17} };

  for(int[] i:medalTally){

  for(int j:i){

  System.out.print("\t"+j);
}
System.out.println();
}
}}