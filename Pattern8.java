/*

 ******
  *****
   ****
    ***
     **
      *

 */

package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BAC {
    int n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void output() throws IOException {
        System.out.print("Enter The Row No. ");
        n=Integer.parseInt(br.readLine());
        int i,j;

        for (i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (j=n;j>=i;j--)
                System.out.print("*");

            System.out.println();

        }




    }

}

public class Pattern8 {
    public static  void main(String [] args) throws IOException {
        BAC obj=new BAC();
        obj.output();

    }
}

