//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

class NumberStar
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=1,m=0;
        if(n%2==0)
        {
            m=n/2;
        }
        else
        {
            m=(n/2)+1;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==i || j==n-i+1 || i==m)
                {
                    System.out.print(j+" ");
                }
                else if(j==m && i!=m)
                {
                    System.out.print(i+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*Input:(any number) eg:5
Output:
1   1   5 
  2 2 4   
1 2 3 4 5 
  2 4 4   
1   5   5 
*/