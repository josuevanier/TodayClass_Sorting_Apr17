import java.util.Arrays;

public class SortingBubble {
    public static void main(String[] args) {
        int[] arrays = {8,2,3,4};
        int temp;

        for(int i = 0; i < args.length ; i++){
            for(int j = 0; j < args.length - 1 - i; j++){
                if(arrays[j] > arrays[j + 1]){
                     temp = arrays[j];
                     arrays[i] = arrays[j + 1];
                     arrays[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
