/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

/**
 *
 * @author sumed
 */
public class MergeSort {
        private int[] numbers;
        private int[] helper;

        private int number;

        public void sort(int[] values) {
                this.numbers = values;
                number = values.length;
                this.helper = new int[number];
                mergesort(0, number - 1);
        }

        private void mergesort(int low, int high) {
            
                if (low < high) {
                
                        int middle = low + (high - low) / 2;
              
                        mergesort(low, middle);
                     
                        mergesort(middle + 1, high);
                        
                        merge(low, middle, high);
                }
        }

        private void merge(int low, int middle, int high) {

             
                for (int i = low; i <= high; i++) {
                        helper[i] = numbers[i];
                }

                int i = low;
                int j = middle + 1;
                int k = low;
       
                while (i <= middle && j <= high) {
                        if (helper[i] <= helper[j]) {
                                numbers[k] = helper[i];
                                i++;
                        } else {
                                numbers[k] = helper[j];
                                j++;
                        }
                        k++;
                }
      
                while (i <= middle) {
                        numbers[k] = helper[i];
                        k++;
                        i++;
                }

        }
}
