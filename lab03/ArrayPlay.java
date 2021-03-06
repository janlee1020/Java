/*
*This class is provide practice dealing with arrays
*
*@author - Janet Lee
*@version - 2/07/2020
*/

public class ArrayPlay
{

   public static void main(String[] args)
   {
      int[] first = new int[6];
      for (int i = 0; i < first.length; i++)
      {
         first[i] = 0;
      }
      
      //print array elements
      int[] array = new int[6];
      for (int i = 0; i < array.length; i++)
      {
         array[i] = -1;
      }
      for (int i = 0; i < array.length; i++)
      {
         System.out.println("array{" + i + "] = " +array[i]);
         array[i] = 0;
      }
      
      //print myArray elements
      int[] myArray = new int[6];
      for (int i = 0; i < myArray.length; i++)
      {
         myArray[i] = i;
      }
      for (int i = 0; i < array.length; i++)
      {
         System.out.println("myArray{" + i + "] = " + i);
         myArray[i] = 0;
      }
      Die dice = new Die();
      int face;
      for (int ii = 0; ii < 100;ii++)
      {
         face = dice.roll();
         first[face-1] += 1;
      }

      for (int i = 0; i <first.length; i++)
      {
         System.out.println(i+1 +" was rolled " + first[i]+ " times.");
      }
          

      //This is for Working with two arrays
      double[] one = {4.5, 11.2, 23.5, 19.2, 98.3, 68.1, 99.5,100.2,1771.4, 912312};
      double[] two = new double[10];

      System.out.println("Before:");
      for (int i = 0; i < one.length; i++)
      {
         System.out.println(one[i]+"    "+two[i]);
      }
      for (int i = 0; i < one.length; i++)
      {
         two[i] = one[i];
      }
      System.out.println("After:");
      for (int i = 0; i < one.length; i++)
      {
         System.out.println(one[i]+"    "+two[i]);
      }
      one[2] = 192142321.1;
      one[0]=25.7;
      one[1]=886.4;
      one[3]=75847398.2;
      one[4]= 41832.5;
      one[5]= 3248973.3;
      one[6]=432480924.1;
      one[7]=238491.4;
      one[8]=413.8;
      one[9]=3546.4;
      two[5] = 5615312.4;
      System.out.println("After Change:");
      for (int i = 0; i < one.length; i++)
      {
        System.out.println(one[i]+"    "+two[i]);
      }
   }
}