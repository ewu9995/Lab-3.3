
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
		return back;
		
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		
	}
	
	public static String[] merge(String[] list1 , String[] list2) {
		/*
		 * This method will combine two pre-conditioned sorted arrays into one sorted arrays.
		 * To do so, a new array must be created, which in this case is combinedArray.
		 * To add the values into the arrays, the two arrays must be compared.
		 * So in this case, if the comparing of two strings is less than zero, then the compared value will be added to the array first as it is smaller.
		 * To find the values, there are two loops that loop through each of the two arrays if the values are less than the array length, as
		 * going over will break it.
		 * 
		 */
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
}
