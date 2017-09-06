/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

import com.google.common.base.Stopwatch;

import dnl.utils.text.table.TextTable;
import java.util.Arrays;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author sumed
 */
public class Algo {

    public static void  shuffle(int[] arr)
    {
        Random rand = new Random();

        int N = arr.length;
        for(int i = 0;i < N; i++)
        {
                
           int r = rand.nextInt(i);
           int temp = arr[i];
           arr[i] = arr[r];
           arr[r] = temp;
    }
    }
            public static  int[] generate(int N)
            {
               Random rand = new Random();
               int[] arr = new int[N];
               for (int i = 0;i < N;i++)
               {
                   arr[i] =  rand.nextInt(200000);
               }
               return arr;
            }

    public static void main(String[] args) {
    	String[] columnNames = {"InputSize","Time1","Time2","Time3","Time4","Time5",
    			"Time6","Time7","Time8","Time9","Time10","Avg Time"};
    	//String[] columnNames1 = {"InputSize","Type Of Array","Time1"};
		Object data[][]  = new Object[100][15];	
      QuickSort q = new QuickSort();
      //InsertionSort i = new InsertionSort();
      long sum = 0;
      int[] input = null;
      int[] input1 = null;
      int row = 0;
      int col = 0;
      int count = 0;
      int f = 0;
      for (int i = 10000 ;i <= 1000000 ; i = i + 10000)
      { 

      data[count][0] = i;
      System.out.print(i);
      sum = 0;
      int h = 0;
          for (int j = 1 ;j <= 10;j++ )
          {
             //input =  generate(i); 
             //s.sort(input);
             //     input1 =  generate(i/2); 
             input = generate(i);
             //s.sort(input);
            // s.sort(input);
//         for(int o = i/2 ;o<i;o++)
//         {
//             input[o] = input1[h];
//              h = h + 1;
//         }
//         h = 0;
             //  Array.Copy(input1, 0, input, (i/2 + 1),i/2);
             
                Stopwatch stopwatch = new Stopwatch().start();    
               q.sort(input);
              stopwatch.stop();
            long millis = stopwatch.elapsedTime(TimeUnit.MILLISECONDS);
            data[count][j] = millis;
           sum = sum + millis;
    
          }
          data[count][11] = (double)sum/(double)10;
          System.out.print(","+sum);
          //System.out.println();
         //System.out.println((double)sum/(double)10);
          count = count + 1;          
      }

 	 TextTable tt1 = new TextTable(columnNames, data);

     tt1.printTable();
      
 }
    
      
    
}