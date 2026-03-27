package Learnen;

public class Function {
    public static void main(String[] args) {
        double x0 = 0.25, x1 = 0.45, x2 = 0.5;

        System.out.printf("\n\nСумма ряда в точке x = 0,25 равна %f", sumOfSeries(x0));

        System.out.printf("\nЗначение функции в точке x = 0,25 равно %f", function(x0));

        System.out.printf("\n\nСумма ряда в точке x = 0,45 равна %f", sumOfSeries(x1));

        System.out.printf("\nЗначение функции в точке x = 0,45 равно %f", function(x1));

        System.out.printf("\n\nСумма ряда в точке x = 0,5 равна %f", sumOfSeries(x2));

        System.out.printf("\nЗначение функции в точке x = 0,5 равно %f", function(x2));

    }
    static double sumOfSeries(double x){
        int n = 1;
        double y = 0, a;
        do{
            a = Math.pow(-1, n - 1)*((Math.pow(x,n)/n + Math.pow(2*x,n)/n));
            y += a;
            n++;

        }
        while(Math.abs(a) >= Math.pow(10,-6));


        return y;
    }
    static double function(double x){
        return Math.log(1 + 3*x + 2 * Math.pow(x, 2));
    }
}


