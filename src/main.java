import java.util.List;

public class main {

    public static void main(String[] args) {
        Fibonacii fb = new Fibonacii();
        List<Integer> list = fb.getFibonacci(9);
        System.out.println(" fibonacci ");
        for ( int  i : list){
            System.out.print( i+ " ");
        }


        System.out.println();
        System.out.println("phyramid");
        Phyramid phyramid = new Phyramid();
        phyramid.phyramid();


        System.out.println();
        System.out.println("sorting algorithm");

        int [] array = {0,8,7,6,4,4,1,1,3};
        int n = array.length;
        System.out.println("array sebelum disorting ");
        for (int i = 0; i<n;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println();


        selection_sort ob = new selection_sort();
        ob.selection(array);
        int c = array.length;
        System.out.println("selection sort : ");
        for (int i = 0 ; i < c ; i++){
            System.out.print( array[i] +" ");
        }

        System.out.println(" ");

        System.out.println("bubble sort :");

        Bubble bubble = new Bubble();
        bubble.bubble(array);

        for (int i = 0 ; i < n ; i++){
            System.out.print( array[i] +" ");
        }

    }
}
