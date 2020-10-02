import java.util.*;
public class Prime
{
   public static void main(String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // Reading inputs
        int i,j; 
        for(i=1;i<=n;i++) 
        {
            if(i==0 || i==1) // Because we know every number is divisible by 0 and 1.
            {
                continue;
            }
            boolean k = false; // Taking a boolean value while will be set to false as the loop starts.
            for(j=2;j<=i/2;j++) 
            {
                if(i%j==0)
                {
                    k = true;
                    break;
                }
                
            }
            if(k==false)
            {
              System.out.println(i);
            }
        }
        sc.close();
    
    }
}
