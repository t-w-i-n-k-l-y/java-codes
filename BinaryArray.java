import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] ar = new int[n];
        boolean found = false;
        
        for(int i=0; i < n; i++){
            ar[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        
        for(int i=0; i < n; i++){
            if(ar[i] == k){
                System.out.println(i);
                found = true;
                break;
            }
        }
        
        if(found == false)
            System.out.println(-1);
	}
}
