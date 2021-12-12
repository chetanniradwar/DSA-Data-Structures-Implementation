import java.util.ArrayList;

public class implementation
{
public static void main(String args[])
{
    System.out.println("author @Chetan Niradwar");


    TreeNode drinks = new TreeNode("drinks");
        TreeNode hot =drinks.newChild("hot");
            TreeNode tea = hot.newChild("tea") ;
            TreeNode coffee = hot.newChild("coffee") ;
        TreeNode cold = drinks.newChild("cold") ;
            TreeNode alcoholic = drinks.newChild("alcoholic") ;
            TreeNode bear = alcoholic.newChild("bear") ;
            TreeNode nonalcoholic = drinks.newChild("nonalcoholic") ;
                TreeNode cola = nonalcoholic.newChild("cola") ;
                TreeNode pepsi =nonalcoholic.newChild("pepsi") ;
    
    drinks.displayTree(0) ;
    

}
}

class TreeNode
{

    String value;
    int level;
   ArrayList <TreeNode> t ;
public TreeNode(String value)
{
    this.value = value;

    this.t = new ArrayList<TreeNode> () ;
}
public TreeNode newChild(String value)
{
    TreeNode node = new TreeNode(value);
    t.add(node) ;
    return node;
}

public void displayTree(int level)
{   
   
    System.out.print("   ".repeat(level));
    System.out.println(this.value);
    
    if(t.size() == 0)
    return;
    else
    for(TreeNode x : t) 
    {           
                // System.out.println(x.value) ;
                // System.out.print("   ".repeat(level));
                x.displayTree(level+1) ;
    }
}

}

