import java.util.Scanner;

public class Matrix
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Введите кол-во строк:");
      int stroki = in.nextInt();
      System.out.println("Введите кол-во столбцов:");
      int stolb = in.nextInt();

    int[][] twoDimArray = new int[stroki][stolb];

    for (int i=0; i<stroki; i++){
        for (int j=0; j<stolb; j++){
            System.out.printf("%n%s%d%s%d%s%n", "Введите элемент [",i,"][",j,"]:");
            twoDimArray[i][j]=in.nextInt();
        }
      } 
    for (int j = 0; j < stolb; j++) {
        System.out.print(twoDimArray[0][j]*3+" ");
      }
   }
}