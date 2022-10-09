import java.util.*;
import java.lang.*;
import java.io.*;

class BubbleSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    boolean isSorted;
		int[] array={8, 2, 4, 1 ,3};
		int i, j;
		
		for(i = 0; i< array.length; i++)
		    System.out.print(array[i] + " ");
		    
		System.out.println();    
		
		for(i=0; i<array.length; i++){
		    isSorted = true;
		    for(j=i; j < array.length - i; j++){
		        if(array[j] > array[j+1]){
					swap(array[j], array[j+1]);
		        }
		    }
		}
		for(i = 0; i< array.length; i++)
		    System.out.print(array[i] + " ");
	}
	
	private void swap(int index1, int index2){
	    int temp = 0;
		temp = index1;
		index1 = index2;
		index2 = temp;

	}
}