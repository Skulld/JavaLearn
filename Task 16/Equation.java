import java.util.Scanner;

public class Equation
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int x = 0;
	
	if ((str.indexOf('x')==-1) || (str.length()!=5) || (!(str.matches(("[x0-9][[+]|[-]][x0-9][=][x0-9]"))))) {
    System.out.println("Некорректный формат");}
   else {
      if (str.indexOf("x")==0) { 
         x = (str.charAt(1) =='+') ? (int)(str.charAt(4)-'0')-(int)(str.charAt(2)-'0') : (int)(str.charAt(4)-'0')+(int)(str.charAt(2)-'0');}
      else if (str.indexOf("x")==2) {
         x = (str.charAt(1) =='+') ? (int)(str.charAt(4)-'0')-(int)(str.charAt(2)-'0') : (int)(str.charAt(0)-'0')+(int)(str.charAt(4)-'0');}
      else {x = (str.charAt(1) =='+') ? (int)(str.charAt(0)-'0')+(int)(str.charAt(2)-'0') : (int)(str.charAt(0)-'0')-(int)(str.charAt(2)-'0');}
      System.out.printf("%n%s%s %n%s%d", "Ввод: ", str, "Вывод: ", x);
      }
   }
}
