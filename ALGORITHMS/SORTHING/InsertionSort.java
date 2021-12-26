import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = new int[]{5,78,14,42,63,89};
        for( int i = 1 ; i< arr.length; i++)
        {  int current = arr[i];
            int j ;
            for(  j = i-1;j>=0;j--)
            {  
               if(arr[j] >current)
               {
                    arr[j+1] = arr[j] ;
               }
               else
               break;
            }
            arr[j+1]=current;
        }
        System.out.print(Arrays.toString(arr));
}
}
