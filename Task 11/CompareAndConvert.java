import java.util.Scanner;

public class CompareAndConvert
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      //1
      String n1 = in.next();                    
      //2   
      int n2 = in.nextInt();                        
      
      Integer n1comp = Integer.parseInt(n1);

      int result = n1comp.compareTo(n2);  

      if (result == 1) { 
        System.out.println(n1comp);             //3
        double lesser = Double.valueOf(n2);
        System.out.println(lesser);             //4
      }
    else if (result == -1) { 
        System.out.println(n2);                 //3
        double lesser = Double.valueOf(n1comp);
        System.out.println(lesser);             //4
      }
      else {System.out.println("Невозможно выбрать число");}
   }

}