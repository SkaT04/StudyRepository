package Learnen;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class ThreeOnes1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int n = input.nextInt();
        int[] ql = new int[n];
        int[] ql1 = new int[n];

        for(int i = 0; i < n; i++){
            ql[i] = input.nextInt();
        }
        while(!equals(ql, ql1)){
            for(int i = 0; i < n; i++){
                ql1[i] = ql[i];
            }
            for(int i = 0; i < ql.length - 1; i++){
                if(ql[i] > 0){
                    if(ql[i + 1] > 0){
                        ql[i]--;
                        count++;
                    }
                }
            }
            ql[n - 1]--;

        }
        System.out.println(count);

    }
    static boolean equals(int[] ql, int[] ql1){
        int l = ql.length;
        for (int i = 0; i < l - 1; i++){
            if (ql[i] != ql1[i]) {
                return false;
            }
        }
        return true;
    }
}


