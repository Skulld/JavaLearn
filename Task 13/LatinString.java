import java.util.Scanner;

public class LatinString
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int counter = 0;

      //С учетом дубликатов?
      String[] words = str.split(" ");
      for (String word : words) {
      	if (word.matches("^[a-zA-Z]+$")) {
			System.out.print(word+" ");
      		counter++;
      	}
      }
      System.out.printf("%n%d",counter);
    }
}