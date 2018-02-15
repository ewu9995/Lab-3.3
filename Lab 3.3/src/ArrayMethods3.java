import java.util.Arrays;

public class ArrayMethods3 {
	
	//starter code
		public static void main(String[] args) {
			int[] list1 = {4,1,6,0,8,9,2,3,};
			String[] list = {"ferwe","berwe", "aeeee"};
			
			long start = System.nanoTime();
			String[] mergeResult = mergeSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.println("Merge test took: " + time + " nanoseconds");
			System.out.println(Arrays.toString(mergeResult));
			
			start = System.nanoTime();
			int pivotFinalPos =partition(list1, 1, 1);
			end = System.nanoTime();
			time = end - start;
			System.out.println("Partition test took: " + time + " nanoseconds");
			System.out.println("Final Pivot Position: " + pivotFinalPos);
			System.out.println(Arrays.toString(list));
		}
		 
	



	public static String[] mergeSort(String[] list) 
	{
		//Base case
		if(list.length ==1)
			return list;
		//Recursive step
		return(merge(mergeSort(left), mergeSort(right)));
		
	}
	
	
	public static int partition(int[] list1, int front, int back) 
	{
		int pivot = list1.length-1/2;
		int pivotLocation = 0;
		back = list1.length-1;
		front = 0;
		for(int i = 1; i <list1.length; i++ ) {
			if (list1[i] <= pivot) 
			 {
				swap(list1, i, i-1); 
				pivotLocation = i;
			 }
			 
			else if(list1[i] > pivot && back > i)
			 {
			
				swap(list1, i, back);
				i--;
				back--;
			 }
			 
			}
			return pivotLocation; 	
		}
		
	
	//swaps values
	public static void swap(int []arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}


	
	public static void quickSort(int[] list1, int front, int back)
	{
		if(back>front) {
			int pivotPos = partition(list1, front, back);
			quickSort(list1, front, pivotPos-1);
			quickSort(list1, pivotPos+1, back);
		}
	}
	
}
