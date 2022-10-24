import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {-1, 3, 5,-30, 6, 1, -31};
        int[] b = {0, 2, 5, 6, 20, 25, 30};
        int max = MaxInListRecursion.calculator(a);
        System.out.println(max);
        System.out.println(BinarySearchRecursion.search(b,20));
       // System.out.println(BinarySearch.BinarySearch1(b,3));
        //System.out.println(BinarySearchRecursion.search(b,8));


     //  Fact.factorialFunction(3);



    }
}
