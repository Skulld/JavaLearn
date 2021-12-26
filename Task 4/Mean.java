import java.util.Scanner;

public class Mean 
{
     public static void main(String[] args) 
     { 
       
    Scanner numbers = new Scanner(System.in);
      float x = numbers.nextFloat();
      float y = numbers.nextFloat();
      float z = numbers.nextFloat();

      float meanvalue = (x+y+z)/3;

      System.out.println("Среднее арифметическое:"+meanvalue);

      int compare=(int)meanvalue/2;

      if (compare > 3){
        System.out.println("Программа выполнена корректно");
      }
     }
 }