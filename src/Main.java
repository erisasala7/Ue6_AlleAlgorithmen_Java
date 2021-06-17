import java.time.ZonedDateTime;

public class Main {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        long timerstart, timerend;
        int cacheSize = 3 * 1024 * 1024;
        int arraysize = (int) cacheSize / Integer.SIZE;
        int biggersize = (int) arraysize * 2;
        int[] array_innerhalb_cache = new int[arraysize];
        int[] array_ausserhalb_cache = new int[biggersize];


        Quick_Sorting.clearCache(cacheSize);
        System.out.println(ANSI_BLUE + "Quick Sort Algorithm\n" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Quick Sort: Best case run with array of size:  " + arraysize + ANSI_RESET);
        Selection_Sorting.fillUpArrayRng(array_innerhalb_cache);
        timerstart = ZonedDateTime.now().toInstant().toEpochMilli();
        Quick_Sorting.quickSort_bestcase(array_innerhalb_cache, 0, arraysize - 1);
        timerend = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);
        //Quick_Sorting.clearCache(cacheSize);
        System.out.println(ANSI_BLUE + "Quick Sort: Worst case run with array size: " + arraysize + ANSI_RESET);
        Selection_Sorting.fillUpArrayRng(array_innerhalb_cache);
        timerstart = ZonedDateTime.now().toInstant().toEpochMilli();
        Quick_Sorting.quickSort_worstcase(array_innerhalb_cache, 0, arraysize - 1);
        timerend = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);


        System.out.println(ANSI_BLUE + "Quick Sort: Best case run with array size bigger than  cache size " + biggersize + ANSI_RESET);
        Selection_Sorting.fillUpArrayRng(array_ausserhalb_cache);
        timerstart = ZonedDateTime.now().toInstant().toEpochMilli();
        Quick_Sorting.quickSort_bestcase(array_ausserhalb_cache, 0, biggersize - 1);
        timerend = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);
        //Quick_Sorting.clearCache(cacheSize);

        System.out.println(ANSI_BLUE + "Quick Sort: Worst case run with array size bigger than  cache size " + biggersize + ANSI_RESET);
        Selection_Sorting.fillUpArrayRng(array_ausserhalb_cache);
        timerstart = ZonedDateTime.now().toInstant().toEpochMilli();
        Quick_Sorting.quickSort_worstcase(array_ausserhalb_cache, 0, biggersize - 1);
        timerend = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);


        System.out.println(ANSI_BLUE + "\nSelection Sort Algorithm\n" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Selection Sort: Randomly filled array with size:  " + arraysize + ANSI_RESET);
        Quick_Sorting.clearCache(cacheSize);
        Selection_Sorting.fillUpArrayRng(array_innerhalb_cache);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);
        timerstart = System.currentTimeMillis();
        Selection_Sorting.selection_sort(array_innerhalb_cache);
        timerend = System.currentTimeMillis();
        System.out.println(ANSI_BLUE + "Sorted array:" + ANSI_RESET);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        System.out.println(" ");

        //selection sort - regular array size - best case run
        System.out.println(ANSI_BLUE + "Selection Sort: Best case run with array of size: " + arraysize + ANSI_RESET);
        Quick_Sorting.clearCache(cacheSize);
        Selection_Sorting.fillUpArrayIncreasing(array_innerhalb_cache);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);
        timerstart = System.currentTimeMillis();
        Selection_Sorting.selection_sort(array_innerhalb_cache);
        timerend = System.currentTimeMillis();
        System.out.println(ANSI_BLUE + "Sorted array:" + ANSI_RESET);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        System.out.println(" ");

        //selection sort - regular array size - worst case run
        System.out.println(ANSI_BLUE + "Selection Sort: Worst case run with array of size: " + arraysize + ANSI_RESET);
        Quick_Sorting.clearCache(cacheSize);
        Selection_Sorting.fillUpArrayWorstCaseSelectionSort(array_innerhalb_cache);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);
        timerstart = System.currentTimeMillis();
        Selection_Sorting.selection_sort(array_innerhalb_cache);
        timerend = System.currentTimeMillis();
        System.out.println(ANSI_BLUE + "Sorted array:" + ANSI_RESET);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        System.out.println(" ");


        System.out.println(ANSI_BLUE + "Selection Sort: Randomly filled array with size bigger than  cache size:  " + biggersize + ANSI_RESET);
        Quick_Sorting.clearCache(cacheSize);
        Selection_Sorting.fillUpArrayRng(array_ausserhalb_cache);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);
        timerstart = System.currentTimeMillis();
        Selection_Sorting.selection_sort(array_ausserhalb_cache);
        timerend = System.currentTimeMillis();
        System.out.println(ANSI_BLUE + "Sorted array:" + ANSI_RESET);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        System.out.println(" ");

        //selection sort - regular array size - best case run
        System.out.println(ANSI_BLUE + "Selection Sort: Best case run with array of size bigger than  cache size: " + biggersize + ANSI_RESET);
        Quick_Sorting.clearCache(cacheSize);
        Selection_Sorting.fillUpArrayIncreasing(array_ausserhalb_cache);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);
        timerstart = System.currentTimeMillis();
        Selection_Sorting.selection_sort(array_ausserhalb_cache);
        timerend = System.currentTimeMillis();
        System.out.println(ANSI_BLUE + "Sorted array:" + ANSI_RESET);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        System.out.println(" ");

        //selection sort - regular array size - worst case run
        System.out.println(ANSI_BLUE + "Selection Sort: Worst case run with array of size bigger than  cache size: " + arraysize + ANSI_RESET);
        Quick_Sorting.clearCache(cacheSize);
        Selection_Sorting.fillUpArrayWorstCaseSelectionSort(array_ausserhalb_cache);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);
        timerstart = System.currentTimeMillis();
        Selection_Sorting.selection_sort(array_ausserhalb_cache);
        timerend = System.currentTimeMillis();
        System.out.println(ANSI_BLUE + "Sorted array:" + ANSI_RESET);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        System.out.println(" ");

        System.out.println(ANSI_BLUE + "Count Sort Algorithm\n" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Count Sort: Randomly filled array with size:  " + arraysize + ANSI_RESET);
        Quick_Sorting.clearCache(cacheSize);
        Count_Sorting.fillUpArrayRng(array_innerhalb_cache);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);
        timerstart = System.currentTimeMillis();
        Count_Sorting.countSort(array_innerhalb_cache);
        timerend = System.currentTimeMillis();
        System.out.println(ANSI_BLUE + "Sorted array:" + ANSI_RESET);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);

        System.out.println(" ");

        //selection sort - regular array size - best case run
        System.out.println(ANSI_BLUE + "Count Sort: Best case run with array of size: " + arraysize + ANSI_RESET);
        Quick_Sorting.clearCache(cacheSize);
        Count_Sorting.fillUpArrayIncreasing(array_innerhalb_cache);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);
        timerstart = System.currentTimeMillis();
        Count_Sorting.countSort(array_innerhalb_cache);
        timerend = System.currentTimeMillis();
        System.out.println(ANSI_BLUE + "Sorted array:" + ANSI_RESET);
        Quick_Sorting.printArray(array_innerhalb_cache, arraysize);
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        System.out.println(" ");

        System.out.println(ANSI_BLUE + "Count Sort Algorithm\n" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Count Sort: Randomly filled array with size bigger than  cache size:  " + biggersize + ANSI_RESET);
        Quick_Sorting.clearCache(cacheSize);
        Count_Sorting.fillUpArrayRng(array_ausserhalb_cache);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);
        timerstart = System.currentTimeMillis();
        Count_Sorting.countSort(array_ausserhalb_cache);
        timerend = System.currentTimeMillis();
        System.out.println(ANSI_BLUE + "Sorted array:" + ANSI_RESET);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        System.out.println(" ");

        //selection sort - regular array size - best case run
        System.out.println(ANSI_BLUE + "Count Sort: Best case run with array of size bigger than  cache size: " + biggersize + ANSI_RESET);
        Quick_Sorting.clearCache(cacheSize);
        Count_Sorting.fillUpArrayIncreasing(array_ausserhalb_cache);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);
        timerstart = System.currentTimeMillis();
        Count_Sorting.countSort(array_ausserhalb_cache);
        timerend = System.currentTimeMillis();
        System.out.println(ANSI_BLUE + "Sorted array:" + ANSI_RESET);
        Quick_Sorting.printArray(array_ausserhalb_cache, biggersize);
        System.out.println(ANSI_BLUE + "Elapsed Time in milliseconds: " + (timerend - timerstart) + ANSI_RESET);
        System.out.println(" ");

    }
}
