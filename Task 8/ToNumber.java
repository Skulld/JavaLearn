import java.util.Scanner;

public class ToNumber
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      int mainNum = in.nextInt();
      int sum = 0;

      for (int i = 1; i <= mainNum;) {
            sum += i;
            i = i+2;}
     System.out.println(sum);
    }
}