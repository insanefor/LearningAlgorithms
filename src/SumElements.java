import java.util.Arrays;

public class SumElements {
    public static int sumElements(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            int[] arr2 = new int[arr.length-1];
            System.arraycopy(arr, 1, arr2, 0, arr.length - 1);
               return arr[0] + sumElements(arr2);
        }
    }

}
