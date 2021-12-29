import java.util.Scanner;

public class Riddle
{
    public static void main (String [] args) {
        String answer;
        boolean itsright = false;
        boolean clueUse = false;
        System.out.println ("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner inputAnswer = new Scanner (System.in);

        for(int i = 1; i <= 3; i++){
            if (itsright == true){
                break;}
            answer = inputAnswer.nextLine();

            switch (answer){
                case ("Заархивированный вирус"):
                    System.out.println("Правильно!");
                    itsright = true;
                    break;
                case ("Подсказка"):
                    if (i == 1){
                        System.out.println("Подсказка");
                        clueUse = true;
                        i--;}
                    else {System.out.println("Подсказка уже недоступна");};
                    break;
                default:
                    if ((answer != "Заархивированный вирус") & ((i == 3) || (clueUse == true))) {
                        System.out.println("Обидно, приходи в другой раз");
                        itsright = true;
                        break;}
                    else {System.out.println("Подумай еще!");
                        break;}
            }
        }
    }
}

