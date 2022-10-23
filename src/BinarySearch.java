public class BinarySearch {
    public static int BinarySearch1(int[] arr, int num){
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int middle;
        int counter = 0;

        while(startIndex <= endIndex){
            counter++;
            System.out.println("Iteration " + counter);
            middle = (startIndex + endIndex) / 2;
            if(endIndex - startIndex == 1){
                if(arr[startIndex] == num){
                    return startIndex;
                }else return endIndex;
            }
            // System.out.println("middle index " + middle + " __ number " + arr[middle] + " __ search " + num);
            if(arr[middle] == num){
                System.out.println("Your number was found!");
                return middle;
            }
            if(arr[middle] > num){
                endIndex = middle - 1;
             //   System.out.println("middle > num\n");
            }else {
                startIndex = middle + 1;

            }
        }
        return 7337;
    }
    /*
    python

    def search(list, item):

  low = 0
  high = len(list)-1
  count = 0

  while low <= high :
      count = count + 1
      print("iteration ")
      mid = int((low + high)/2)
      print(mid)
      guess = list[mid]
      if guess == item :
            return mid
      if guess > item:
           high = mid - 1
      else:
           low = mid + 1


  return None

my_list = [1, 2, 3, 4, 5, 6, 7, 8]

print(search(my_list, 8))
    * */
    }
