public class Solution {
public static void main(String[] args) {
    Trie t = new Trie();
    t.insert("apple");
    t.insert("app");
    t.insert("apis");
    t.insert("api");
    // t.insert("apkr");
    // System.out.println(t.search(""));
    System.out.println(t.search("apple"));
    System.out.println(t.search("app"));
    System.out.println(t.search("apis")); 
    System.out.println(t.search("api")); 
    t.delete("api");
    t.delete("app");
    t.delete("apple");
    t.delete("apis");
    System.out.println(t.search("apple"));
    System.out.println(t.search("app"));
    System.out.println(t.search("apis")); 
    System.out.println(t.search("api"));
    // System.out.println(t.search("apkr"));
    // System.out.println(t.search("apis"));
}
}


class Trie {
    TrieNode root ;
public Trie() {
     root = new TrieNode();
}

public void insert(String word) {
    TrieNode node = root;
    for(int i = 0 ; i<word.length();i++)
    {
        char letter = word.charAt(i);
        if(!existInNode(letter,node))
        {
            node.ref[letter -'a']= new TrieNode();
            node.count++;
        }
        else
        {
            
        }
        node = node.ref[letter-'a'];
    }
    node.endOfWord =true;
   
    
}

public boolean search(String word) {
    
     TrieNode node = root;
    for(int i = 0 ; i<word.length();i++)
    {
        char letter = word.charAt(i);
        if(existInNode(letter,node))
        {
            node = node.ref[letter-'a'];
        }
        else
        {
            return false;
        }
        
    }
    if(node.endOfWord)
    return true;
    
    return false;
    
}

public boolean startsWith(String prefix) {
     TrieNode node = root;
    for(int i = 0 ; i<prefix.length();i++)
    {
        char letter = prefix.charAt(i);
        if(existInNode(letter,node))
        {
            node = node.ref[letter-'a'];
        }
        else
        {
            return false;
        }
        
    }
    return true;
}

public boolean existInNode(char letter, TrieNode node)
{
    if(node.ref[letter -'a'] == null)
        return false;
    else 
        return true;
}
public void delete(String word)
{
 deletechar(root,word);    
}

public TrieNode deletechar(TrieNode node ,String word)
{  
    if(word.equals(""))
    {   
        if(node.endOfWord)
        {   
                if(node.count==0)
                {
              node.endOfWord = false;
                return null;
                }
                else
                {
                        node.endOfWord = false;
                        return node;
                }
        }
        else
        {
            return node;
        }
     }   
    if(node.ref[word.charAt(0) -'a']!=null)
    node.ref[word.charAt(0)-'a'] = deletechar(node.ref[word.charAt(0)-'a'], word.substring(1));
    else
    {
        return node;
    }
        if(node.ref[word.charAt(0)-'a'] ==null )
            node.count--;
        
        if(!node.endOfWord  && node.count==0)
        return null;
        else
        {
        return node;
        }
}
}
class TrieNode
{   
TrieNode ref[] ; ;
boolean endOfWord;
int count ;
public    TrieNode()
{
ref= new TrieNode[26];
endOfWord = false;
count =0;
}
}
 