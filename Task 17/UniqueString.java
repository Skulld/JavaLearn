import java.util.Scanner;

public class UniqueString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк:");
        int n = in.nextInt();
        String[] strs = new String[n];
        String mostUnique = "";
        int max = 0;

        for (int i = 0; i < n; i++){
            System.out.printf("%n%s%d%s", "Строка №", i+1, ": ");
            strs[i] = in.next();
            String temp = strs[i].toLowerCase();
            String buffer="";
            int counter=0;
            for (int j = 0; j < temp.length(); j++){

                if (!(buffer.contains(String.valueOf(temp.charAt(j))))) {
                    buffer += String.valueOf(temp.charAt(j));
                    counter++;}
                mostUnique = (max < counter) ? strs[i] : mostUnique;
                max = (max < counter) ? counter : max;

            }
        }
        System.out.printf("%n%s%s", "Ответ: ", mostUnique);
    }
}