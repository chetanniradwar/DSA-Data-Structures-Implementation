public class Heap {
    int []arr;
    int treeSize ;
    String heapType;
    public Heap(int size, String heapType)
    {
            arr = new int[size+1];
            treeSize = 0;
            this.heapType =heapType;


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
        
        for(int i = 1; i<= treeSize ; i++)
        {
            System.out.print(arr[i] +" -> ") ;

        }
        System.out.println();
    }
    public boolean isFull()
    {
        if(treeSize==arr.length-1)
        return true;
        else
        return false;
    }
    public void insert(int data)
    {
        if(isFull())
        {
            System.out.println("Heap is full");
            return;
        }
        arr[treeSize+1] = data ;
        treeSize++;
        if(heapType.equals("min") && arr[treeSize]<arr[treeSize/2])
        heapify(treeSize);
        if(heapType.equals("max") && arr[treeSize]>arr[treeSize/2])
        heapify(treeSize);
    }

    public void heapify(int index)
    { 
        
        
        if(index/2==0)
        return;
        int parentindex = index/2;
        int temp;
        temp =arr[index] ;
        arr[index]= arr[parentindex] ;
        arr[parentindex] =temp;
        index=parentindex;
        parentindex= index/2;
        if(heapType.equals("min") && arr[index]<arr[parentindex])
        heapify(index);
        if(heapType.equals("max") && arr[index]>arr[parentindex])
        heapify(index);
    }


}
