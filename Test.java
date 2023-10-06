import java.util.*;

public class Test{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Array Limit");
        int Length = scanner.nextInt();
        System.out.println("Enter The Array Element");

		int array[] =new int[Length];
        for(int i = 0 ; i<Length;i++)
        {
            array[i] = scanner.nextInt();
        }
		System.out.println("Before Sorting :: ");
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println("After Sorting :: ");
        System.out.println(Arrays.toString(array));
        scanner.close();
	}
	
	public static void insertionSort(int array[]){
		int n = array.length;
		for(int i=1;i<n;i++){
			int key = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > key){
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
		}
	}
}