import java.util.*;

class SimpleTest 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Length Of Array :");
        int Length = scanner.nextInt();
        System.out.println("Enter The Value Of Array");
        int[] array = new int[Length];
        
        for(int Row = 0 ; Row < Length ; Row ++ )
        {
            array[Row] = scanner.nextInt(Row);
        }

        for(int x = 0 ; x < Length ; x++ )
        {
            for(int y = x+1 ; y <Length ; y++ )
            {
                if(array[x] < array[y])
                {
                    array[x] = array[x];
                }
                else
                {
                    array[x] = array[y];
                }
            }
        }

        for(int x = 0 ; x < Length ; x++ )
        {
            System.out.print(array[x] +" ");
        }

        scanner.close();
    }    
}
