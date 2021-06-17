public class Count_Sorting {
    public static void countSort(int[] arr) {
        int arrayLength = arr.length;
        if (arrayLength == 0)
            return;
        /** find maximum and minimum values **/
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arrayLength; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        int range = max - min + 1;

        int[] count = new int[range];
        /** initialize the occurrence of each element in the count array **/
        for (int i = 0; i < arrayLength; i++)
            count[arr[i] - min]++;
        /** calculate sum of indexes **/
        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];
        /** modify original array according to the sum count **/
        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                arr[j++] = i + min;
    }
    public static int[] fillUpArrayRng(int[] A){
        int i;
        int rng;
        for (i = 0; i < A.length; i++){
            rng = (int)Math.floor(Math.random()*(A.length));
            A[i]=rng;
        }
        return A;
    }

    public static int[] fillUpArrayIncreasing(int[] A){
        int i;
        for (i = 0; i < A.length; i++){
            A[i] = i;
        }
        return A;
    }


    // Prints the array
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void clearCache(int cacheSize){
        //because of Garbage Collector, this does not work well in Java, as the memory positions are
        //simply assigned for deletion and not really deleted
        String[] source = new String[cacheSize];
        String[] target = new String[source.length];
        System.arraycopy(source, 0, target, 0, source.length);
    }
}
