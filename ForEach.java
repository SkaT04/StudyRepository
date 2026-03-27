package Learnen;



public class ForEach {
    public static void main(String[] args) {
        String[] daysOfWeek =
                { "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };


        for (String dayOfWeek : daysOfWeek) {
            System.out.print(" \n" + dayOfWeek);
        }
    }
}
