public class BinarySearchRecursion {


    public static int search(int[] arr, int ask) {
        // [0, 2, 5, (6), 20, *25, 30]
        //  0  1   2   3   4   5   6
        //  1  2   3   4   5   6   7
        return search1(arr, ask, 0, arr.length - 1);

    }
    private static int search1(int[] arr, int ask, int begin, int end){
        int middle = (end + begin) / 2;
        System.out.println("begin " + begin);
        System.out.println("end " + end);
        System.out.println("middle " + middle);
        System.out.println("ask " + ask + "  real " + arr[middle] + "\n\n");

        if(arr[middle] == ask){
            return middle;
        }
        if(arr[middle] > ask){
            return search1(arr, ask, begin, middle - 1);
        }else{
            return search1(arr, ask,middle + 1, end);
        }

    }
}
