public class MaxInListRecursion {
    public static int calculator(int[] arr, int counter){ //упразднил max
        //проверял логику по массиву [8,9,1,0]

        // Пропуск хода для первого элемента массива
        if(counter == 0){
            counter++;
            calculator(arr, counter);
        }
        ////////////////////////////

        //Основная проверка. Если текущий элемент меньше предыдущего, то текущий принимает максимальное значение
        if(arr[counter] < arr[counter - 1]) arr[counter] = arr[counter - 1];
        ///////////////////////////

        //   Возврат переменной при последнем вызове функции
        if(counter == arr.length - 1) return arr[counter];

        ///////////////////////////

        return calculator(arr, counter + 1);

    }

}
