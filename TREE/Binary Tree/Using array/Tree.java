public class Tree {
    
    String []tree;
    int lastNodeIndex ;
    public Tree(int size)
    {
            tree = new String[size+1];
            lastNodeIndex = 0;


    }

    public void insert(String data)
    {
       
        if(lastNodeIndex!=tree.length-1)
        {
            tree[lastNodeIndex+1] = data;
            lastNodeIndex++;

        }
        else
           {
               System.out.println("Tree is full");
           } 

       
    }
     
    
    public void preOrder(int index)
    {
        if(index>lastNodeIndex)
        return;
            System.out.print(tree[index] + "->");
            preOrder(2*index);
            preOrder(2*index+1);
    }
    
    public void inOrder(int index)
    {
        if(index>lastNodeIndex)
        return;
        inOrder(2*index);
            System.out.print(tree[index] + "->");
        inOrder(2*index+1);
    }
    
    public void postOrder(int index)
    {
        if(index>lastNodeIndex)
        return;
        postOrder(2*index);
        postOrder(2*index+1);
        System.out.print(tree[index] + "->");
    }
    
    public void levelOrder()
    {
       for(int i = 1 ; i<=lastNodeIndex ; i++)
            System.out.print(tree[i] + "->");
            
    }
    public void search(String target)
    {
        for(int i =1 ; i<=lastNodeIndex ; i++)
        {
            if(tree[i].equals(target))
            {
                System.out.println("present at index "+i);
                return;
            }

        }
        System.out.println("not found") ;

    }

    public void delete(String target)
    {
        for(int i =1 ; i<=lastNodeIndex ; i++)
        {
            if(tree[i].equals(target))
            {
                tree[i]=tree[lastNodeIndex];
                tree[lastNodeIndex]=null;
                lastNodeIndex--;
                return;
            }

        }
        System.out.println("not found") ;
    }

    public void deleteTree()
    {
        tree = null;
        lastNodeIndex = 0;
    }
    
}
