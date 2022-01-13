import java.util.ArrayList;
import java.util.Arrays ;
import java.util.List;
class Main
{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solveNQueens(5));
    }
}

class Solution {
    public List<List<String>> solveNQueens(int n) {
        String board[][] = new String[n][n];
     
        for (String[] array : board) {
            Arrays.fill(array, ".");
        }
        
        List<List<String>> master = new ArrayList();
        
        place(0,board,master,n);
        return master;
    }
    
    
    public void place(int row, String board[][] ,List<List<String>> master,int n)
    {      
            if(row==n)
            {    
                   List<String> fin = new ArrayList <String>();
       
            
            for( int i = 0 ;i<n;i++)
            {               String[] eachrow = board[i];  
                            List<String> s =   Arrays.asList(eachrow);
                           String s1 = String.join("",s);
                fin.add(s1);
            }
                       
                    master.add(fin);
                    return;
            }
     for(int col = 0;col<n;col++)
       {
        if(isSafe(row,col,board,n))
        {
            board[row][col]="Q";
            place(row+1,board,master,n); 
            board[row][col]=".";
            // place(row,col+1, board,master,n);
        }
           
        
        
       }
            
 }
    
    public boolean isSafe(int row , int col, String[][] board,int n)
    {
               
        for(int c= 0; c<col;c++)
        {
        if(board[row][c].equals("Q")) return false;
    
        }
         for(int r= 0; r<row;r++)
        {
        if(board[r][col].equals("Q")) return false;
    
        }
      
        
       int c=col+1; int r=row-1;
        while(c<n&&r>=0)
        {
        if(board[r][c].equals("Q")) return false;
            
            c++;
            r--;
        }
           c=col-1;  r=row-1;
        while(c>=0&&r>=0)
        {
        if(board[r][c].equals("Q")) return false;
            
            c--;
            r--;
        }
        
        
        return true;
        
        
    }
    
        
    
}