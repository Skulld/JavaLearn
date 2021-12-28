import java.util.Scanner;
import java.util.Random;

public class Riddle
{
    public static void main (String [] args) {
        String answer;
        String[] clues = new String[]{"Подсказка 1", "Подсказка 2", "Подсказка 3"};
        Random random = new Random();
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
                        System.out.println(clues[random.nextInt(clues.length+1)]);
                        clueUse = true;}
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

