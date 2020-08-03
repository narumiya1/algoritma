public class Bubble {

    static int[] bubble (int[] arr) {
        int i, j, n, temp ;
        n = arr.length ;

        for (i=0; i<n; i++){
            for (j=0; j<n-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }

        return arr ;
    }



}
