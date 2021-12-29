import java.util.Scanner;

public class ConsoleOperation 
{
      public static void main(String[] args)
    {

        Scanner numbers = new Scanner(System.in);
        System.out.println("Введите первое число:");
        float x = numbers.nextFloat();
        System.out.println("Введите второе число:");
        float y = numbers.nextFloat();
        System.out.print("Введите знак операции, которую хотите выполнить:");
        String sign = numbers.next();

        if ((sign.equals("/")) & (y == 0))  {
        System.out.print("На ноль делить нельзя");}
   else {
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
}