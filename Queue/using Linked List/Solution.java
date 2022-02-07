public class Queue {
    Node back ;
        Node front ;
        Queue() {
            // Implement the Constructor
            back = null;
            front = null ;
            
        }
    
        /*----------------- Public Functions of Queue -----------------*/
    
        boolean isEmpty() {
            // Implement the isEmpty() function
             if(front ==null && back ==null)
            {
                    
              return true;
            }
            else
                 return false ;
        }
    
        void enqueue(int data) {
            // Implement the enqueue() function
            Node node = new Node(data) ;
            if(front ==null && back ==null)
            {
                    
                front = node ;
                back = node ;
            }
            else 
            {
                back.next = node;
                back = back.next ;
            }
        }
    
        int dequeue() {
            // Implement the dequeue() function
             if(front ==null && back ==null)
            {
                    
              return -1;
            }
            else if( front ==back)
            {
                int val = front.val;
                front =null;
                back = null;
                return val ;
            }
            else
            {
                    int val = front.val;
                Node temp=front.next ;
                front.next =null ;
                front = temp;
               
                return val ;
            }
            
        }
    
        int front() {
            // Implement the front() function
            if(isEmpty() )
                return -1 ;
            else
                return front.val ;
        }
    
    }
    
    class Node
    {
    int val ;
        Node next ;
        public Node(int val)
        {
            this.val = val;	
        }
    
    }
    