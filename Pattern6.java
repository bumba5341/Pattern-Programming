/*

          *
         **
        ***
       ****
      *****
     ******


 */

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ABC{
    int n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void output() throws IOException{
        System.out.print("Enter The Row No. ");
        n=Integer.parseInt(br.readLine());
        int i,j;
        for (i=1;i<=n;i++){

            for (j=n-i;j>=1;j--)
                System.out.print(" ");
            for (j=i;j>=1;j--)
                System.out.print("*");
            System.out.println();
        }

    }
}

public class Pattern6 {

    public static void main(String []args) throws IOException {
        ABC obj=new ABC();
        obj.output();


    }
}
