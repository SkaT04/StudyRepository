package Learnen;




class Solution {
    public static void main(String[] args) {



        double[] H = new double[]{0.21, 0.20, 0.19, 0.18, 0.17, 0.16, 0.15, 0.14, 0.13, 0.12};
        double[] L = new double[]{0.025, 0.026, 0.024, 0.022, 0.021, 0.021, 0.022, 0.028, 0.022, 0.023};
        double[] f = new double[10];
        double[] fdel = new double[10];
        double[] fdel2 = new double[10];

        double s = 0;
        for(int i = 0; i < 10; i++) {
            f[i] = f(H[i], L[i]);
            System.out.println("N = " + (i + 1) + "    H = " + H[i] + "   L = " + L[i] + "    f = " + f[i]);
            s += f[i];
        }

        s = s / 10;
        System.out.println("Fsr = " + s);

        for(int i = 0; i < 10; i++){
            fdel[i] = Math.abs(s - f[i]);
            fdel2[i] = Math.pow(fdel[i], 2);
            System.out.println("N = " + (i + 1) + "    Fdelta = " + fdel[i] + "    Fdelta2 = " + fdel2[i]);
        }

        double sumdelt = 0;

        for(int i = 0; i < 10; i++){
            sumdelt+=fdel2[i];
        }

        s = Math.pow(sumdelt / 90, 0.5);

        System.out.println("S = " + s);


    }

    public static double f(double H, double L){
        double m1 = 0.41, m2 = 0.1, g = 9.8;
        return ((Math.pow(m1, 2) * H) / ((m1 + m2) * L) + (m1 + m2)) * g;
    }
}