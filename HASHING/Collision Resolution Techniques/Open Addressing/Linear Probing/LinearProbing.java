public class LinearProbing {
    String hashTable[] ;
    int filledcells;
    public LinearProbing()
    {
        hashTable =new String[10];
        filledcells= 0;
    }

    public void reHashtable()
    {
       
                String newhashTable[] = new String[2*hashTable.length];
                for(int i = 0 ;i<  hashTable.length ; i++)
                {
                    newhashTable[i] = hashTable[i];
                }
                hashTable = newhashTable ;

        
    }


    public double calcLoadFactor()
    {
            double loadFactor = filledcells * 1.0/hashTable.length;
            return loadFactor;
    }

    public void insert(String key)
    {   
        

        int index =hashFunction(key , hashTable.length);
        for(int i = index ; ; i=(i+1)%hashTable.length)
        {   
            // System.out.println("in a loop");
            if(hashTable[i]==null)
            { 
            hashTable[i] = key ;
            filledcells++;
            if(calcLoadFactor()>0.75)
            reHashtable();
            break;
            }
            
           
        }
       


    }

    public int hashFunction(String key , int M)
    {
        char arr[] = key.toCharArray();
        int asciisum = 0;
        for(int i = 0 ; i< arr.length ; i++)
        {
            asciisum = asciisum + arr[i] ;
        }
        return asciisum % M ;
        
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
}
