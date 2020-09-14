package Assignment_1;

public class Q_8 {	
	static int countOccurrences(int arr[], int n, int x) 
    { 
        int res = 0; 
        for (int i=0; i<n; i++) 
            if (x == arr[i]) 
              res++; 
        return res; 
    } 
      
    public static void main(String args[]) 
    { 
        int arr[] =  {1,1,1,1,2,2,3,4,5,5,6,6} ; 
        int x = 2; 
        int n = arr.length; 
        
        System.out.println(countOccurrences(arr, n, x)); 
    } 
}