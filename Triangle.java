/*
Print Pattern:
   1
  232
 34543
4567654
*/
import java.util.*;
public class Triangle
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int  n ;
	   int i=1;
       n=sc.nextInt();
       while(i<=n)
       {
          int space=n;
          while(space>i)
          {
             System.out.print(" ");
             space--;
          }
          int j=1;
          int val1=i;
          while(j<=i)
          {
              System.out.print(val1);
              j++;
              val1++;
          }
          int val2=2*i-2;
          while(val2>=i)
           {
              System.out.print(val2);
              val2--;
           }
           System.out.print("\n");
           i++;
           sc.close();

        }
    }
}
