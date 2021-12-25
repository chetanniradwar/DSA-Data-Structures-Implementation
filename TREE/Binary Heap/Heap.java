public class Heap {
    int []arr;
    int treeSize ;
    public Heap(int size)
    {
            arr = new int[size+1];
            treeSize = 0;


    }


    public boolean isEmpty()
    {
        if(treeSize == 0)
        {
                return true;
        }
        else
        return false;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.print("Heap is empty");
            return -1 ;
        }
        else
        return arr[1] ;
    }


    public void levelOrder()
    {   if(isEmpty())
        {
            System.out.println("Heap is empty");
            return;
        }
        
        for(int i = 1; i< treeSize ; i++)
        {
                    System.out.print(arr[i] +" -> ") ;

        }
        System.out.println();
    }

    
}
