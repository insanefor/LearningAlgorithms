public class MaxInListRecursion {
    public static int calculator(int[] arr, int max, int counter){ //упразднить max
        //   Возврат переменной при последнем вызове функции
        //[2,4,1,0]

        // Запись первого числа массива как максимальное
        if(counter == 0){
            max = arr[0];
        }
        ////////////////////////////

        //Основная проверка
        if(arr[counter] > max){
            max = arr[counter];
        }
        ///////////////////////////

        if(counter == arr.length - 1){
            return max;
        }
        ///////////////////////////

        counter++;
        return calculator(arr,max, counter);

    }

}
