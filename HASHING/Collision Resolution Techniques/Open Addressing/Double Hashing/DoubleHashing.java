public class DoubleHashing {
    String[] hashTable;
    int filledCells;

    public DoubleHashing() {
        hashTable = new String[10];
        filledCells = 0;
    }

    public int hashFunction1(String key, int M) {
        char arr[] = key.toCharArray();
        int sum = 0;
        for (char x : arr) {
            sum = sum + x;
        }
        return sum % M;
    }

    public int hashFunction2(String key, int M) {
        char arr[] = key.toCharArray();
        int sum = 0;
        for (char x : arr) {
            sum = sum + (2 * x);
        }
        System.out.println("hashFunction 2 sum " + sum);
        return sum % M;
    }

    public void insert(String key) {

        if (calcLoadFactor() >= 0.75)
            reHashtable();

        int index1 = hashFunction1(key, hashTable.length);
        int index2 = hashFunction2(key, hashTable.length);

        int newIndex;
        for (int counter = 0;; counter++) {

            newIndex = (index1 + (counter * index2)) % hashTable.length;
            if (hashTable[newIndex] == null) {
                hashTable[newIndex] = key;
                break;
            }
        }
    }

    public void display() {
        if (hashTable == null) {
            System.out.println("HashTable does not exist");
            return;
        }
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(i + " -> " + hashTable[i]);
        }
    }

    public void search(String key) {
        int index = hashFunction1(key, hashTable.length);

        for (int i = index; i < index + hashTable.length; i++) {

            int newindex = i % hashTable.length;
            if (hashTable[newindex] != null && hashTable[newindex].equals(key)) {
                System.out.println("This key is present on index :" + newindex);
                return;
            }
        }
        System.out.println("not found");

    }

    public void delete(String key) {
        int index = hashFunction1(key, hashTable.length);

        for (int i = index; i < index + hashTable.length; i++) {
            int newindex = i % hashTable.length;
            if (hashTable[newindex] != null && hashTable[newindex].equals(key)) {
                System.out.println("This key is present on index :" + newindex);
                hashTable[newindex] = null;
                System.out.println("Successfully deleted");
                return;
            }
        }
        System.out.println("The key is not present in Hashtable");
    }

    public void reHashtable() {

        String newhashTable[] = new String[2 * hashTable.length];
        for (int i = 0; i < hashTable.length; i++) {
            newhashTable[i] = hashTable[i];
        }
        hashTable = newhashTable;

    }

    public double calcLoadFactor() {
        double loadFactor = filledCells * 1.0 / hashTable.length;
        return loadFactor;
    }

}
