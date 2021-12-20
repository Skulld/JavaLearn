import java.util.Random;

public class RandomArray 
{
    public static void main(String[] args) 
    { 
    Random random = new Random();
    int[] anArray = new int[15];
    anArray[0] = random.nextInt(41) - 20;
    int min = anArray[0];
    int max = anArray[0];

    for(int i = 0; i < 15; i++){
        anArray[i] = random.nextInt(41) - 20;
      if (anArray[i] < min)
        {min = anArray[i];}
      if (anArray[i] > max) 
        {max = anArray[i];}
      }
      System.out.print(max+" "+min+"\n");

      if (Math.abs(min) > Math.abs(max)) 
        {System.out.println(min);}
        else 
          {System.out.println(max);};

      // -Если наибольший из модулей - System.out.println(Math.max(Math.abs(min),Math.abs(max)));
    }
}