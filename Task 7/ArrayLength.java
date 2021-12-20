import java.util.Scanner;

public class ArrayLength 
{
     public static void main(String[] args) 
    { 
       
     int x=25;
     int y=3;
     int z=-4;  

    Scanner anArray = new Scanner(System.in);
      int arrayLng = anArray.nextInt();
      int[] myArray = new int[arrayLng]; 

    for (int i = 0; i < arrayLng; i++) 
      {
            myArray[i] = anArray.nextInt();
      }

    for (int i = 0; i < arrayLng; i++) 
      {
          if (myArray[i] == x || myArray[i] == y || myArray[i] == z)
        {System.out.println("Данное значение имеется в константах");
        break;}
        
      }

    }
  }