import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = new int[]{5,2,4,3,1};
        for( int i = 0 ; i< arr.length; i++)
        {   int min =arr[i];
            int minindex= i;
            for( int j = i+1;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    
                   
                    minindex = j;

                }
            }
            int temp = arr[i];
            arr[i] =arr[minindex];
            arr[minindex]= temp;
        }
        System.out.print(Arrays.toString(arr));

    }
}

