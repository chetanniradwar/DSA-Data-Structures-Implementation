

public class BinarySearch {
    public static void main(String[] args) {
        // BinarySearch
     int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
     int target=9;
     int st=0;
     int en=arr.length-1;
     int mid;
     while(st<=en)
     {
     mid=(st+en)/2;
     if(arr[mid]==target)
     {
     System.out.println(mid+1);
     break;
     }
     else if(target>arr[mid])
     st=mid+1;
     else if(target<arr[mid])
     en=mid-1;
     
     }
     if(st>en)
     System.out.println("not found");
     
     
    
    }
}
    

