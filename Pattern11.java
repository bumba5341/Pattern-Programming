/*
print the following pattern

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21


 */

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class  P11{

    int n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void  output() throws IOException{
        System.out.print("Enter The Row No. ");
        n=Integer.parseInt(br.readLine());
        int i,j,count=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
                System.out.print(count++ +" ");
            System.out.println();
        }

    }
}

public class Pattern11 {

    public  static void main(String [] args)throws IOException {
        P11 obj=new P11();
        obj.output();

    }
}
