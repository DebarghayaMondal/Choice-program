package com.company;

public class Sum {
    int n;
    public Sum (int n)
    {
        this.n = n;
    }
    public int fun (int n)
    {
        int s=0,i;
        while(n>0)
        {
            i=n%10;
            s=s+i;
            n=n/10;
        }
        return s;
    }
}
