public class Quick_Sorting {

    public static void swap (int array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    public static void quickSort_bestcase(int[] arr, int low, int high)
    {
        //check for empty or null array
        if (arr == null || arr.length == 0){
            return;
        }

        if (low >= high){
            return;
        }

        //Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        long pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j)
        {
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot)
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot)
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (i <= j)
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (low < j){
            quickSort_bestcase(arr, low, j);
        }
        if (high > i){
            quickSort_bestcase(arr, i, high);
        }


    }
    public static void quickSort_worstcase(int[] arr, int low, int high)
    {

        //check for empty or null array
        if (arr == null || arr.length == 0){
            return;
        }

        if (low >= high){
            return;
        }

        //Get the pivot element from the middle of the list
        // int middle = low + (high - low) / 2;
        long pivot = arr[high];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j)
        {
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot)
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot)
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (i <= j)
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (low < j){
            quickSort_worstcase(arr, low, j);
        }
        if (high > i){
            quickSort_worstcase(arr, i, high);
        }



    }
    public  static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            if(arr[i] != 0 )// testing purposes
                System.out.print(arr[i]+" ");
        System.out.print("\n");

    }

    public static void clearCache(int cacheSize){

        String[] source = new String[cacheSize];
        String[] target = new String[source.length];
        System.arraycopy(source, 0, target, 0, source.length);
    }

}
