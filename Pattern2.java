/*



 *
 * *
 * * *
 * * * *
 * * * * *


  */



package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Execute{

    int n;
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    void output() throws IOException {

        System.out.print("Enter The Row No. ");
        n=Integer.parseInt(br.readLine());
        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

class Pattern2{
    public static void main(String[] args) throws IOException{
        Execute obj=new Execute();
        obj.output();


    }
}