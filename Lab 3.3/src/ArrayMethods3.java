import java.util.Arrays;

public class ArrayMethods3 {
	
	//starter code
		public static void main(String[] args) {
			int[] list1 = {4,1,6,0,8,9,2,3,};
			String[] list = {"ferwe","aerwe","yeeee", "zzzzzz", "aaaaaa"};
			
			long start = System.nanoTime();
			String[] mergeResult = mergeSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.println("Merge test took: " + time + " nanoseconds");
			System.out.println(Arrays.toString(mergeResult));
			
			start = System.nanoTime();
			int pivotFinalPos = partition(list1, 1, 1);
			end = System.nanoTime();
			time = end - start;
			System.out.println("Partition test took: " + time + " nanoseconds");
			System.out.println("Final Pivot Position: " + pivotFinalPos);
			System.out.println(Arrays.toString(list1));
		}
		 
	



	public static String[] mergeSort(String[] list) 
	{
		//Base case
		if(list.length == 1)
			return list;
		//Recursive step
		
		// left is index to to 1/2
		//right is 1/2 to end
		String[] left = Arrays.copyOfRange(list, 0, list.length/2 );
		String[] right = Arrays.copyOfRange(list, list.length/2, list.length); 
		return(merge(mergeSort(left), mergeSort(right)));
		
	}
	public static String[] merge(String[] list1 , String[] list2) {

			String [] combinedArray = new String[list1.length + list2.length]; //new array must be length of both arrays combined
			int x=0; //list1 indexes
			int y=0; //list2 indexes
			int z=0; //new array (combinedArray)
			  while (x < list1.length && y < list2.length) //both arrays must be less than their intended length (any longer with break the code)
		        {
		            if (list1[x].compareTo(list2[y]) < 0) //compares the values in the 2 arrays and see which is smaller
		            {
		               combinedArray[z] = list1[x]; //since the value in list1 is smaller in this case, list1[x] becomes part of the sorted array before list2[y]
		                x++;
		            }
		            else
		            {
		            	combinedArray[z] = list2[y]; //since list2[y] is smaller, it is placed before list1[x]
		                y++; 
		            }
		            z++;
		        	}
			  		
			  		//loops through the arrays to find values
			  		if (x < list1.length)
			  		{
			        combinedArray[z] = list1[x];
			        x++; z++;
			  		}

			  		if (y < list2.length)
			  		{
			        combinedArray[z] = list2[y];
			        y++; z++;
			  		}

			    return combinedArray; //returns the combined sorted array 
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
