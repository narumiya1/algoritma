public class quick_sort {

    static int partition(int [] array, int loew, int high){

        int pivot = array[high];

        int i = (loew - 1);

        for (int j = loew ; j < high ; j++){
            if ( array[j] < pivot){

                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j]= temp;
            }
        }

        int temp = array[i+1];
        array[i + 1] = array[high];
        array[high] = temp;

        return  i + 1;
    }

    void sort(int arr[], int loew, int high){

        if ( loew < high){
            int pi = partition(arr, loew, high);
            sort(arr, loew, pi-1);
            sort(arr, pi+1, high);
        }


    }

    void printarr(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int []array = {9,0,9,7,5,4,2,1};
        int n = array.length;

        quick_sort pob = new quick_sort();

        pob.sort(array, 0 ,n-1);
        pob.printarr(array);

    }
}
