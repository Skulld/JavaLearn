import java.util.Scanner;

public class ConsoleOperation 
{
     public static void main(String[] args) 
     { 
       
    Scanner numbers = new Scanner(System.in);
      float x = numbers.nextFloat();
      float y = numbers.nextFloat();
      String sign = numbers.next();

    switch (sign) {
     case "+":
        System.out.println(x+y);
         break;
     case "-":
        System.out.println(x-y);
         break;
     case "*":
        System.out.println(x*y);
         break;
     case "/": 
     System.out.println(x/y);
         break;
      default: 
         break;
      }
     }
 }