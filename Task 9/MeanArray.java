import java.util.Scanner;

public class MeanArray 
{
     public static void main(String[] args) 
    { 
       
    Scanner in = new Scanner(System.in);
      int arraySize = in.nextInt();
      double[] anArray = new double[arraySize];
      double meanNum = 0;

      for (int i = 0; i < arraySize; i++){
        System.out.printf("%n%s %d %s%n", "Введите", i+1, "элемент массива:");
        anArray[i] = in.nextDouble();
        meanNum += anArray[i];}

      meanNum = (meanNum / arraySize);
      for (double element : anArray){
         System.out.println(element*meanNum);
     }
    }
}