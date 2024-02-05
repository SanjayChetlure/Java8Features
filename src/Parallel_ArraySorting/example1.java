package Parallel_ArraySorting;

import java.util.Arrays;

public class example1 
{
	public static void main(String[] args) 
	{
		int [] ar= {4,7,6,4,2,6,1};
		
		System.out.println("before sorting :-");
		for (int i = 0; i <= ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}
		
		//Arrays.sort(ar);
		//Arrays.sort(ar,4,7);
		//Arrays.parallelSort(ar);
		Arrays.parallelSort(ar,0,4);
		System.out.println("after parallel sorting :-");
		for (int i = 0; i <= ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
