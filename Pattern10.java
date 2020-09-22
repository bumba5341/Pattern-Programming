/*
Print the following pattern


        *
       * *
      *   *
     *     *
    *       *
   *         *
  *           *
 ***************

 */


package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class  Pten{

    int n;
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    void  output() throws IOException {
        System.out.print("Enter the Row No. ");
        n=Integer.parseInt(br.readLine());
        int i,j;

        for (i=1;i<=n;i++){

            for(j=n-i;j>0;j--)
                System.out.print(" ");
            System.out.print("*");
            if(i!=1) {
                if(i!=n) {
                    for (j = 1; j <= 1 + (i - 2) * 2; j++)
                        System.out.print(" ");

                }

               System.out.print("*");

            }

            if(i==n){
                for(j=1;j<2*n-2;j++)
                    System.out.print("*");
            }
            System.out.println();


        }
    }
}

public class Pattern10  {
    public  static  void  main(String [] args) throws  IOException{
        Pten obj=new Pten();
        obj.output();

    }
}
