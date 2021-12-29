import java.util.Scanner;

public class Currency
{
    public static float dollar(float rate, float amount) {
        return (float) amount/rate;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        float rate = in.nextFloat();
        System.out.print("Количество рублей: ");
        int amount = in.nextInt();

        float dollarvalue = dollar(rate, amount);
        System.out.printf("%s %.2f %s", "Итого:", dollarvalue, "долларов");
    }
}