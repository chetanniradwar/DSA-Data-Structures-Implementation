import java.util.ArrayList;
import java.util.Collections;



public class BucketSort {
    public static void main(String[] args) {
        int arr[] = new int[]{54,7,5,2,8,2,44,1,82,7,102,88};
      

        double s =Math.sqrt(arr.length) ;
        int bucketscount =(int) Math.round(s);
        ArrayList<Integer> bucket[] = new ArrayList[bucketscount] ;
        for(int i = 0 ; i< bucketscount ; i++)
        {
            bucket[i] =new ArrayList<Integer>() ;
        }
        int maxValue = Integer.MIN_VALUE ;
        for(int i = 0 ; i<arr.length;i++)
        {
               if(arr[i]>maxValue)
               {
                   maxValue = arr[i];
               }
        }
        int bucketindex;
        for(int i = 0 ; i<arr.length;i++)
        {  
             double temp = (arr[i]*bucketscount)/(double)maxValue ;
             bucketindex = (int) Math.ceil(temp) ;
             bucket[bucketindex-1].add(arr[i]);
        }

        for(int i = 0 ; i<bucket.length ; i++)
        {
            Collections.sort(bucket[i]);
            System.out.print(bucket[i]);
        }


        // System.out.print(Arrays.toString(arr));
   
}
}
