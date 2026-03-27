package Learnen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exeptions {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите ваше имя: ");
            String name = reader.readLine();
            if(name.equals("")){
                throw new IOException("Имя не может быть пустым");
            }

            System.out.print("Введите ваш возраст: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.println("Привет, " + name + "! Вам " + age + " лет.");
        } catch (IOException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Ошибка: Введенный возраст не является числом.");
        }
    }
}

