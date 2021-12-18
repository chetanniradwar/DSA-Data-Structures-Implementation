
import java.util.LinkedList;
public class DirectChaining {
 
int arr[] = new int[10];
LinkedList<String> hashTable[];
   public DirectChaining(){
    hashTable = new LinkedList[100];

   }
   public int hashFunction(String x , int M)
   {
    char ch[];
    ch = x.toCharArray();
  

    int i, sum;
    for (sum=0, i=0; i < x.length(); i++) {
      sum += ch[i];
    }
    return sum % M;
   }

   public void insert(String key)
   {
    int index = hashFunction(key, hashTable.length);
    if(hashTable[index]==null)  
    {
        LinkedList<String> l = new LinkedList<String>();
        l.add(key);
        hashTable[index]=l;
    } 
   
    else
    {
        hashTable[index].add(key);
    }
   }

   public int search(String key)
   {
            int index =hashFunction(key, hashTable.length);
            if(hashTable[index]==null)
            {
                return -1;
            }
            else{
                LinkedList<String> tmp = hashTable[index];
                if(tmp.contains(key))
                {
                    return index;
                }
                else 
                return -1;
            }
   }

   public void display()
   {    if(hashTable == null)
    {
        System.out.println("HashTable does not exist") ;
        return;
    }
       for(int i = 0 ; i< hashTable.length; i++)
       {
           System.out.println(i +" -> " + hashTable[i]);
       }
   }

   public void delete(String key)
   {
       if(hashTable == null)
       {
           System.out.println("Hashtable does not exist");
           return;
       }
       int index = hashFunction(key, hashTable.length);
       if(hashTable[index]==null)
       {
        System.out.println("Data does not exist");
        return;
       }
       LinkedList temp = hashTable[index] ;
       
       if(temp.remove(key) )
       {
            System.out.println("successfully removed");
            if(temp.isEmpty())
            {
                hashTable[index] = null ;
            }
       }
       else
       System.out.println("Data does not exist");
   }
   
  
}
