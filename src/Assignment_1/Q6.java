package Assignment_1;

public class Q6 {
	
	public static void twn (int a[])
	{
		int n1 = 0;
		int n2 = 0;
		
		for(int n:a) {
			
			if(n1<n)
			{
				n1=n2;
				n1=n;			
			}
			else if(n2<n){
				n2=n;
			}
			
			
		}
		System.out.print("secont max number:"+n2);
	}
	public static void main(String[] args) {
		
		int[] a = {10,9,6,3,8};
		Q6.twn(a);
	}
}