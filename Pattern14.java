/*
Print the following pattern

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

 */


package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class  P14{

    int n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void  output() throws IOException{
        System.out.print("Enter The Row No. ");
        n=Integer.parseInt(br.readLine());
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
                System.out.print(i+" ");
            System.out.println();
        }

    }
}

public class Pattern14 {

    public  static void main(String [] args)throws IOException {
        P14 obj=new P14();
        obj.output();

    }
}
