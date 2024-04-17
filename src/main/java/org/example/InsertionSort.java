package org.example;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arrays = {1,2,4,5,7};
        int temp, loc;
        for(int i = 0; i < arrays.length; i++){
            if(arrays[i] > arrays[i + 1]) {
                temp = arrays[i + 1];
                loc = i + 1;
                while (loc != 1 && arrays[loc - 1] > temp) {
                    arrays[loc] = arrays[loc - 1];
                    loc = loc - 1;
                }

                arrays[loc] = temp;
            }
        }
    }
}
