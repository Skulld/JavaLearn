import java.util.Scanner;

public class ToNumber
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      int mainNum = in.nextInt();
      int sum = 0;

      for (int i = 1; i <= mainNum; i++)
         {if (i %2 !=0)
          {sum += i;}
         }
    //В условии не указано выводить сумму
     System.out.println(sum);
   }
}