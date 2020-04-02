package starPattern;

public class starPattern {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<=n-1;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
		
		for (int i=0; i<=n-1; i++) 
		{ 
		  for (int j=-1; j<=i; j++) 
		    { 
		       System.out.print(" "); 
		    } 

		     for (int j=0; j<=n-2-i; j++) 
		    {
		        System.out.print(" *"); 
		       
		    } 
		    System.out.println(""); 
		} 

	}
}
