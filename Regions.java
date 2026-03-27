package Learnen;

import java.util.Scanner;

public class Regions {
    public static void main(String[] args) {
        int N;
        double x, y;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите координаты точки М(x;y):");

        System.out.println("Введите x: ");
        if(input.hasNextDouble()){
            x = input.nextDouble();
        } else {
            System.out.println("Для х введено не число");
            return;
        }




        System.out.println("Введите y: ");
        if(input.hasNextDouble()) {
            y = input.nextDouble();
        } else {
            System.out.println("Для y введено не число");
            return;
        }

        input.close();

        System.out.printf("\nКоординаты точки M(%.3f;%.3f)", x, y);

        if(x == 0){
            if(y <= 0){
                N = 4;
            } else if(y >= 2){
                N = 4;
            } else {
                N = 3;
            }

        } else if(x > 0){
            if(y > x + 2){
                N = 2;
            } else if(y <= x){
                N =4;
            } else {
                N = 3;
            }

        } else {
            if(y >= x + 2){
                N = 4;
            } else if(y <= x){
                N = 2;
            } else {
                N = 1;
            }

        }

        System.out.printf("\nТочка принадлежит %d участку", N);

    }
}
