public class selection_sort {

    static int[] selection (int[] array){

        int n = array.length;

        //indeks yg akan ditukar
        while ( n > 0 ) {

            int max = 0 ;

            //membandingkan nilai indeks
            for (int i = 1 ; i < n ; i++){

                if ( array[max] < array[i]){
                    max = i ;
                }

            }

            int temp = array[max] ;
            array[max] = array[n - 1];
            array[n-1] = temp ;

            n-- ;
        }

        return  array ;
    }


}
