/*
 
 I Want to print the following pattern.
 
 when n=5
    *****
   *   *
  *   *
 *   *
*****  


when n=10
         **********                                   
        *        *
       *        *
      *        *
     *        *
    *        *
   *        *
  *        *
 *        *
**********


when n=15
              ***************
             *             *
            *             *
           *             *
          *             *
         *             *
        *             *
       *             *
      *             *
     *             *
    *             *
   *             *
  *             *
 *             *
***************

*/





package patten;
import java.io.*;

public class Barfi {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How Many Row You Want To Print ");
		int n=Integer.parseInt(br.readLine());
		int i,j;
		
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=n-i;j++) {       // This loop print the begining space
				
				System.out.print(" ");
			}
			
			if(i==1 || i==n) {     // Print 1st and last row with *
				for(j=1;j<=n;j++) {
					System.out.print("*");
					
				}
			}
			else {
				
				System.out.print("*");
				for(j=1;j<=n-2;j++) {      // This loop for space in between 2 *
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
	}

}
