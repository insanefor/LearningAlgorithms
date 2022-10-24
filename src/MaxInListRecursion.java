public class MaxInListRecursion {
    public static int calculator(int[] arr){
        return calc1(arr,0,arr[0]);
    }
    private static int calc1(int[] arr, int index, int max){
        if(index == arr.length){
            return max;
        }
        if(arr[index] > max){
            max = arr[index];
        }
        return calc1(arr, index + 1, max);
    }
}
