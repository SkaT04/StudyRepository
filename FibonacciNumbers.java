package Learnen;

import java.util.Scanner;

public class FibonacciNumbers {
    private static final int a0 = 0, a1 = 1;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(fib(input.nextInt()));
    }

    public static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        int a = a0;
        int b = a1;
        n-=2;
        while(n >= 0){
            int c = b;
            b = a + b;
            a = c;
            n--;
        }
        return b;
    }


}
