package org.jae.Fibonacci;
/*
Clase que calcula la sucesión o serie de Fibonacci
 */
public class Fibonacci {

    public int fib(int n){
        if(n<0) throw new RuntimeException("The value is negative: "+n);
        int a=0,b=1,c;
        for(int i=0;i<n;i++){
            c = b+a;
            a=b;
            b=c;
        }
        return a;
    }
}
