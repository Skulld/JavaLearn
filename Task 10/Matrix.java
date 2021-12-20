import java.util.Scanner;

public class Matrix
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      int length = in.nextInt();
      int depth = in.nextInt();

    int[][] twoDimArray = new int[depth][length];

    for (int i=0; i<depth; i++){
        for (int j=0; j<length; j++){
            twoDimArray[i][j]=in.nextInt();
        }
      } 
    for (int j = 0; j <= depth; j++) {
        System.out.print(twoDimArray[0][j]*3+" ");
      }
   }
}