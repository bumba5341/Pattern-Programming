/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class  Excecute{
    int n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void output() throws IOException {
        System.out.print("Enter The Row No. ");
         n=Integer.parseInt(br.readLine());
        int i,j;

        for (i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }



    }

}

public class Pattern5 {
    public static  void main(String [] args) throws IOException{
        Execute obj=new Execute();
        obj.output();

    }

}
