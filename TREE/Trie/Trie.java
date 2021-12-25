import java.util.Set;

import javax.lang.model.util.ElementScanner14;

public class Trie {

    Node root;

    public Trie() {
        root = null;
    }

    public void insert(String data) {

        if (root == null) {
            Node parent, child;
            child = new Node();
            parent = new Node();
            root = parent;
            parent.map.put(data.charAt(0), child);
            child.map.put(data.charAt(1), null);
            parent = child;
            for (int i = 2; i < data.length(); i++) {
                child = new Node();
                child.map.put(data.charAt(i), null);
                parent.map.put(data.charAt(i - 1), child);
                parent = child;
                // if(node.map.isEmpty())
                // child.map.put(data.charAt(i),null);

            }
            Node end = new Node();
            end.EndOfString = true;
            child.map.put(data.charAt(data.length() - 1), end);

        } else {
            Node parent = null;
            Node child = null;
            Node temp = root;
            int i;
            for (i = 0; i < data.length(); i++) {
                Character c =data.charAt(i);
                if (temp.map.containsKey(c))

                {   parent =temp;
                    temp = temp.map.get(c);
                    child=temp;
                } else {
                    temp.map.put(c, null);
                    parent = temp;
                    i++;
                    break;
                }
            }
            for (; i < data.length(); i++) {
                Character c =data.charAt(i);
                child = new Node();
                child.map.put(c, null);
                parent.map.put(data.charAt(i - 1), child);
                parent = child;

            }
            Node end = new Node();
            end.EndOfString = true;
            parent.map.put(data.charAt(data.length() - 1), end);
        }
    }

    public void delete() {

    }

    public boolean search(String target) {
        Node parent = root;
        for(int i = 0 ; i<target.length();i++)
        {   Character c = target.charAt(i);
           
            Node child = parent.map.get(c);
            if(child==null)
            {
                return false;
            }
            else
            {
                parent = child;
            }   
        }
        if(parent.EndOfString)
        {
                return true;
        }
        return false;
    }

    

    // public void printAll()
    // {
    // Node temp = root;
    // if(root == null)
    // {
    // System.out.println("Trie Does Not Exist");
    // return;
    // }

    // for(Ma :temp.map.entrySet())
    // {

    // }

    // }
    public void printString(Node node) {
        if (node.EndOfString) {
            System.out.println();
            return;
        }
        Set<Character> x = node.map.keySet();
        for (char c : x) {
            System.out.print(c);
            node = node.map.get(c);
            printString(node);
        }
    }
}
