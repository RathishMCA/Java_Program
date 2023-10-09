
import java.util.*;

class Simple_Star_Pattern
{
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Row :");
        int R = scanner.nextInt();
        for(int i=1;i<=R;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" +" ");
            }
        System.out.println();
        for(int z=R;z>=1;z--)
        {
            System.out.print("*"+ " ");
        }
        
    }
        scanner.close();
    }
}