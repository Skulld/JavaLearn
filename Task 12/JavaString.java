public class JavaString
{
   public static void main(String[] args) 
   {
      
     String str = "I like Java!!!";

     if ((str.contains("Java")) == true && (str.startsWith("I like") == true) && (str.endsWith("!!!") == true)) { 
      System.out.println(str.toUpperCase());}

   System.out.println(str.substring(7, 11).replace('a','o'));
   }
}