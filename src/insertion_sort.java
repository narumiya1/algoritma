public class insertion_sort {

    static int[] insertion ( int[] array ) {

        int n = array.length ;
        int max ;
        int j ;

        int i = 1 ;

        //looping indeks array ketika kurang dari n
        while ( i < n ){
            System.out.print( "looping " +i+": ");
            //array ke - i
            max = array[i];
            System.out.print( " array max = " +max +" " );

            for ( j = i ; j > 0 ; j-- ){
                if ( max < array [j-1] ){
                    array[j] = array[j-1] ;
                    System.out.print( " array j-- =" +array[j-1]+"|"  );
                }else {
                    break ;
                }
            }

            array[j] = max ;
            System.out.print( " array[j] max = " +max  );

            i++ ;

            System.out.println();

        }

        return array ;
    }




}
