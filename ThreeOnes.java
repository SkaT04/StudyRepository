package Learnen;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class LetCount{
    int col;
    char let;
    LetCount(int col, char let){
        this.col = col;
        this.let = let;
    }
}

public class ThreeOnes{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] letters = new char[]{
                'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z'
        };
        int n = Integer.parseInt(reader.readLine());
        int count = 0;
        StringBuilder str = new StringBuilder();
        LetCount[] letCounts = new LetCount[n];
        for(int i = 0; i < n; i++){
            letCounts[i] = new LetCount(Integer.parseInt(reader.readLine()), letters[i]);
        }
        while(!nullLq(letCounts)){
            for(int i = 0; i < n; i++){
                if(letCounts[i].col > 0){
                    str.append(letCounts[i].let);
                    letCounts[i].col--;
                }
            }
        }

        char[] strChar = str.toString().toCharArray();

        for(int i = 0; i < strChar.length - 1; i++){
            if(strChar[i] == letters[Arrays.binarySearch(letters, strChar[i])] &&
                    strChar[i + 1] == letters[Arrays.binarySearch(letters, strChar[i]) + 1]
            ){
                count++;
            }
        }
        writer.write(String.valueOf(count));

        reader.close();
        writer.close();
    }


    static boolean nullLq(LetCount[] lq){
        for (LetCount letCount : lq) {
            if (letCount.col > 0) return false;
        }
        return true;
    }
}