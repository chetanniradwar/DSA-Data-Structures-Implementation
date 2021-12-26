
import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = new int[]{5,2,4,3,1,67,45,3};
        Heap h = new Heap(arr.length,"min");
        for( int i = 0 ; i< arr.length; i++)
       {
           h.insert(arr[i]);
        }

        for( int i = 0 ; i< arr.length; i++)
        {
           arr[i] = h.extract();
         }
 
        System.out.print(Arrays.toString(arr));
    }
}
