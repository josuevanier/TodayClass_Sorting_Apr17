package org.example;

public class QuickSort {
    private int array[];
    private int length;
    public static void main(String[] args) {

    }
    public void sort(int[] inputArr){
        this.array  = inputArr;
    }

    public  void quickSort(int low, int high) {
        if (low < high) {
            int temp = 0;
            int pivot = array[low];
            int large_Index = low + 1;
            int small_index = high;
            while (large_Index < small_index) {
                while (array[large_Index] < array[small_index]) {
                    large_Index++;
                }
                while (array[small_index] > pivot) {
                    small_index--;
                }
                if (large_Index < small_index) {
                    exchangeNumber(large_Index, small_index);
                }
            }
            if (array[small_index] < pivot){exachange(small_index, low);}
            if (low < small_index) quickSort(low, small_index - 1);
            if (high > small_index) quickSort(small_index + 1, high);


        }
    }
}
