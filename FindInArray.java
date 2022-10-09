public class FindInArray
{
	public static void main(String[] args) {
		int[] a = {2, 5, 1, 10, 3};
		boolean fount = false;
		int k = 10;
		
		for(int i=0; i < a.length; i++){
		    if(a[i] == k){
		        System.out.println(i);
                found = true;
		        break;
		    }
		}
		
		if(fount == false)
		    System.out.println("Element is not in the array");
	}
}
