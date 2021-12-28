import java.util.Scanner;

public class ConverterPhysics
{
    public static void main(String[] args)
    {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");

        Scanner numbers = new Scanner(System.in);
        int weightOrHeight = numbers.nextInt();
        double k=0;
        double si;

        if (weightOrHeight == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - унция, 3 - фунт");
            int measure = numbers.nextInt();

            System.out.println("Введите число");
            float number = numbers.nextFloat();

            switch(measure) {
                case 1: k=1; //kilos
                    break;
                case 2: k=35.27; //ounces
                    break;
                case 3: k=2.205; //pound
                    break;
                default: System.out.println("Такой единицы измерения не существует");
                    break;}
            si=number*k;
            if (k !=0) {
                System.out.printf("%n%s%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f", "Результат:", "Килограммы:", si, "Унции: ", si*35.27, "Фунты:", si*2.205);
            }
        }

        else if (weightOrHeight == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int measure = numbers.nextInt();

            System.out.println("Введите число");
            float number = numbers.nextFloat();

            switch(measure) {
                case 1: k=1; //metrs
                    break;
                case 2: k=0.0006; //miles
                    break;
                case 3:  k=1.094; //yards
                    break;
                case 4: k=3.281; //foot
                    break;
                default: System.out.println("Такой единицы измерения не существует");
                    break;}
            si=(float)number*k;
            if (k !=0) {
                System.out.printf("%n%s%n%s%.2f%n%s%.5f%n%s%.2f%n%s%.2f", "Результат:", "Метры: ", si, "Мили: ", si*0.0006, "Ярды: ", si*1.094, "Футы: ", si*3.281);
            }
        }

    }
}