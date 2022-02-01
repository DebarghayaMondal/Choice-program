package com.company;

import java.util.Arrays;

public class Time {
    int t;
    public Time(int t)
    {
        this.t = t;
    }
    public int[] fun(int t)
    {
        int h,m;
        int[] a = new int[3];
        h=t/3600;
        t=t%3600;
        m=t/60;
        t=t%60;
        a[0]=h;
        a[1]=m;
        a[2]=t;
        return (a);
    }
}
