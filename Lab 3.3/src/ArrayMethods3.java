
public class ArrayMethods3 {
	
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
		back = list1.length-1;
		front =0;
		for(int i = 1; i <list1.length; i++ ) {
			
		}
		return pivot;
		
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		if(back>front) {
			int pivotPos = partition(list1, front, back);
			quickSort(list1, front, pivotPos-1);
			quickSort(list, pivotPos+1, back)
		}
	}
	
}
