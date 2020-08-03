public class Phyramid {

    public static void phyramid() {

        int i , j, k ;

        //space
        for (i = 1; i <=5 ; i++){

            for (j = 5 ; j > i  ; j--) {
                System.out.print( " " );
            }

            for (k = 1 ; k < (2 * i) ; k++) {
                System.out.print( "*" );
            }

            System.out.println();
        }

        System.out.println();

        // genjang
//        for ( i = 1 ; i <=5 ; i++){
//
//            for ( j = 1 ; j <= i ; j++){
//
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

        //new line
//        for ( i = 4 ; i >= 1 ; i-- ){
//            //space
//            for ( j = 5 ; j > i ; j--){
//                System.out.print(" ");
////                System.out.print(" ");
//            }
//
//            for ( k = 1 ; k <= j ; k++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

    }

}
