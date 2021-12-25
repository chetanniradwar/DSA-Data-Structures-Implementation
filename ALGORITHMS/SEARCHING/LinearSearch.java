public class LinearSearch {
    public static void main(String[] args) {

        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        int target=10;
           System.out.print( search(arr ,arr.length,target));

    }
        public static int search(int arr[], int n, int k) {


            for(int i=0;i<n;i++)
            {
                if(arr[i]==k)
                {
                    return i+1; 
                }
            }
            
            return -1;
            }

        }
    

