import java.util.Arrays;

public class SortingByChoice {

    public static int[] SortAlgorithm(int[] input){

        for(int a = 0; a < input.length; a++){
            int minIndex = a;
            for(int b = a + 1; b < input.length; b++){
                if(input[b] < input[minIndex]){
                    minIndex = b;
                }
            }
            int backup = input[a];
            input[a] = input[minIndex];
            input[minIndex] = backup;
        }

        return input;
    }
}
