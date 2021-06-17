public class Selection_Sorting {
    public static int[] selection_sort(int[] A){
        //long speed = System.currentTimeMillis(), speed2; //marking the moment the loops start
        for(int i = 0; i < A.length-1; i++){
            //System.out.println("Progress: " + i + "/" + A.length);  //progress bar
            //speed2 = System.currentTimeMillis();
            //System.out.println("Speed: " + (speed2 - speed));  //progress speed
            int minIndex = i;
            for (int j = i + 1; j < A.length; j++){

                if(A[j] < A[minIndex]){
                    minIndex  = j; //comparing smaller value with placeholder variable and saving its index
                }
            }

            int temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;

        }
        return A;
    }

    public static int[] selection_sort_desc(int[] A){
        for(int i = 0; i < A.length-1; i++){
            int minIndex = i;
            for (int j = i + 1; j < A.length; j++){
                if(A[j] > A[minIndex]){ //switch comparison operator for descending
                    minIndex  = j; //comparing smaller value with placeholder variable and saving its index
                }
            }

            int temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;

        }
        return A;
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

    public static int[] fillUpArrayDecreasing(int[] A){
        int i;
        for (i = 0; i < A.length; i++){
            A[i] = A.length - i;
        }
        return A;
    }

    public static int[] fillUpArrayWorstCaseSelectionSort(int[] A){
        //The WORST CASE of an input for the Selection Sort is not a decreasing integer array, it is in fact a "Sine Wave" input, alternatively increasing and decreasing input (ex. 7 6 8 5 9 4 10 3)
        //This will make sure that the array sorting via selection sort requires the maximum amount of swaps (n-1)
        int i;
        int c = 0;
        int mid = A.length / 2;

        for (i = 0; i < A.length; i++){
            if(i % 2 != 0){
                A[i]=mid + c;
            }else{
                A[i]= mid - c;
                c++;
            }
        }
        return A;
    }

}
