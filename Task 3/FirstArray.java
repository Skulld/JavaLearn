public class FirstArray 
{
     public static void main(String[] args) 
     { 
       
   int[] anArray = new int[] {55, 69, 19, 94, 20};

   int startValue = anArray[0];

   anArray[0] = anArray[anArray.length-1];
   anArray[anArray.length-1] = startValue;

   System.out.println(anArray[0]+anArray[anArray.length/2]);
     }
 }