package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c,t,n,r;
        int [] a;
        System.out.print("Choice = ");
        c= in.nextInt();
        if (c==1)
        {
            System.out.print("Second = ");
            t=in.nextInt();
            Time time = new Time(t);
            a= time.fun(t);
            int h,m,s;
            h=a[0];
            m=a[1];
            s=a[2];
            System.out.print(h+":"+m+":"+s);
        }
        else if (c==2)
        {
            System.out.print("Number = ");
            n=in.nextInt();
            Sum sum = new Sum(n);
            r= sum.fun(n);
            System.out.print("Sum = "+r);
        }
        else
        {
            System.out.print("Wrong choice");
        }
    }
}
