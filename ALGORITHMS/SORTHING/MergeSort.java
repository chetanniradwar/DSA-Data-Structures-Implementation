import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int arr[] = new int[] {9,8,7,6,5,4,3,2,1};
         arr =mergeSort(arr);
        System.out.print(Arrays.toString(arr));
        

    }

    public static int[] mergeSort(int arr[]) {
        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                int temp = arr[1];
                arr[1] = arr[0];
                arr[0] = temp;
            }
            return arr;
        }
        if (arr.length == 1)
            return arr;

        int arr1[] = new int[arr.length / 2];
        int arr2[] = new int[(arr.length + 1) / 2];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2)
                arr1[i] = arr[i];
            else
                arr2[i - arr.length / 2] = arr[i];
        }
        arr1 = mergeSort(arr1);
        System.out.print(Arrays.toString(arr1)+" ** ");
        arr2 = mergeSort(arr2);
        System.out.print(Arrays.toString(arr2)+"  ");
        for (int i = 0; i < arr.length; i++) {
            int minimum = Integer.MAX_VALUE;
            int minindex= -1;
            for (int j = 0; j < arr.length; j++) {
                if (j < arr.length / 2) {

                    if (arr1[j] < minimum ) {
                        minimum = arr1[j];
                        minindex = j;

                    }
                } else {

                    if (arr2[j - arr.length / 2] < minimum  ) {
                        minimum = arr2[j - arr.length / 2];
                        minindex = j;
                    }
                }
            }
            arr[i] = minimum;
                if(minindex<arr.length/2)
                arr1[minindex] = Integer.MAX_VALUE;
                else
                arr2[minindex-arr.length/2]= Integer.MAX_VALUE;
            minimum = Integer.MAX_VALUE;
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        return arr;

    }
}
