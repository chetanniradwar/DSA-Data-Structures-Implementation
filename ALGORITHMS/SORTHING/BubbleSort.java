import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[]{4,5,67,3,2,3,234,53,77};
        for( int i = 0 ; i< arr.length; i++)
        {
            for( int j = 0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]  =temp;
                }
            }
        }

        System.out.print(Arrays.toString(arr));
    }
}
