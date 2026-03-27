package Learnen.ThermalPanels;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = reader.readLine().split(" ");
        int R = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        double W, H;
        double D = Math.pow(Math.pow(((double) R / 2) - 2, 2) - 4*B, 0.5);
        W = ((double)R / 2 + 2 + D) / 2;
        H = (double)R/2 + 2 - W;

        writer.write(W + " " + H);
        reader.close();
        writer.close();
    }
}