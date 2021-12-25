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
}
