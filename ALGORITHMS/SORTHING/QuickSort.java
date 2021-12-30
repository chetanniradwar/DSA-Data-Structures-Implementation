import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = new int[]{4,45,2,4,79,5,5,7,5,4,1,6,2,45,52};
        
            quickSort(arr ,0, arr.length-1);
        System.out.print(Arrays.toString(arr)); 
    }


    public  static void quickSort(int arr[] , int s , int e )
    {
        if(s<e)
        {
            
            int pivot = partition(arr,s,e);
            quickSort(arr,s,pivot-1);
            quickSort(arr,pivot+1,e);
        }
    }


    public static int partition( int arr[] ,int s , int e)
    {
        int pivot = e;
        int pindex = s;
        if(s>=e)
        return pivot;
        for( int i = s ;i<e ;i++)
        {
            if(arr[i]<=arr[pivot])
            {
                int temp = arr[i];
                arr[i]= arr[pindex];
                arr[pindex]= temp;

                pindex++;
            }
        }
        int temp = arr[e];
        arr[e]= arr[pindex];
        arr[pindex]= temp;
    
        return pindex;    


    }
    
}
// mycodeschool