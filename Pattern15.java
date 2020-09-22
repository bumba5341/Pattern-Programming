/*
Print the following Pattern


A
A B
A B C 
A B C D
A B C D E
A B C D E F

 */

package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class  P15{

    int n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void  output() throws IOException{
        System.out.print("Enter The Row No. ");
        n=Integer.parseInt(br.readLine());
        int i,j;

        for(i=1;i<=n;i++){
            char c= 65;
            for(j=1;j<=i;j++)
                System.out.print(c++ + " ");
            System.out.println();
        }

    }
}

public class Pattern15 {

    public  static void main(String [] args)throws IOException {
        P15 obj=new P15();
        obj.output();

    }
}
