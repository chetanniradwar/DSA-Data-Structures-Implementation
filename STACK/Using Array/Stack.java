public class Stack {
    int arr[] ;
    int top ;
    public Stack(int size)
    {
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty()
    {
            if(top == -1)
            return true;
            else
            return false;
    }

    public boolean isFull()
    {
        if(top == arr.length-1)
        return true;
        else
        return false;
    }

    public int peek()
    {
       if(isEmpty())
       {
           System.out.println("Stack is Empty");
           return -1;
       }
      
        return arr[top];
    }

    public void push(int data)
    {
        if(isFull())
        System.out.print("Stack is full");
        else 
        {   top++;
            arr[top] = data;
            
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.print("Stack is Empty");
            return -1;
        }

        else 
        {
           int data= arr[top] ;
            top--;
            return data;
        }
    }

}
