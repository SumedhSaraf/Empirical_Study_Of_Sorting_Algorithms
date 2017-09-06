/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;


public class SelectionSort {
    
    public void sort(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                
                if (a[j] < a[min])
                {
                  min = j;
                }  
            }
                swap (a,i,min);
                 
            }
            
        
    }
    public void swap (int a[],int i,int j)
    {
           int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}


//Algorithm	Data structure	Time complexity:Best	Time complexity:Average	Time complexity:Worst	Space complexity:Worst
//Quick sort	Array	O(n log(n))	O(n log(n))	O(n2)	O(1)
//Merge sort	Array	O(n log(n))	O(n log(n))	O(n log(n))	O(n)
//Heap sort	Array	O(n log(n))	O(n log(n))	O(n log(n))	O(1)
//Smooth sort	Array	O(n)	O(n log(n))	O(n log(n))	O(1)
//Bubble sort	Array	O(n)	O(n2)	O(n2)	O(1)
//Insertion sort	Array	O(n)	O(n2)	O(n2)	O(1)
//Selection sort	Array	O(n2)	O(n2)	O(n2)	O(1)

