package Learnen;

import java.util.ArrayList;
import java.util.List;

public class RabinKarp {

    public static List<Integer> search(String text, String pattern) {
        List<Integer> occurrences = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();
        if (m > n) return occurrences;

        long p = 131;          // основание
        long mod = 1_000_000_007L;

        // Предвычисление степеней
        long[] pow = new long[n + 1];
        pow[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow[i] = (pow[i - 1] * p) % mod;
        }

        // Префиксные хэши для text
        long[] hashText = new long[n + 1];
        for (int i = 0; i < n; i++) {
            hashText[i + 1] = (hashText[i] * p + text.charAt(i)) % mod;
        }

        // Хэш для pattern
        long hashPattern = 0;
        for (int i = 0; i < m; i++) {
            hashPattern = (hashPattern * p + pattern.charAt(i)) % mod;
        }

        // Поиск
        for (int i = 0; i <= n - m; i++) {
            long curHash = (hashText[i + m] - hashText[i] * pow[m] % mod + mod) % mod;
            if (curHash == hashPattern) {
                // Проверка на случай коллизии
                if (text.substring(i, i + m).equals(pattern)) {
                    occurrences.add(i);
                }
            }
        }
        return occurrences;
    }

    public static void main(String[] args) {
        String text = "abracadabra";
        String pattern = "abra";
        List<Integer> res = search(text, pattern);
        System.out.println(res); // [0, 7]
    }
}