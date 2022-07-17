package lesson5;

public class HomeWork1 {

    public static int numberOfVowels(String str) {

        // строка, в которой нужно искать гласные

        // массив всех гласных
        char[] vowels = new char[]{'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};

        int counter = 0;

        char[] text = str.toCharArray();
        //цикл в цикле
        for (char ch1 : text) {
            for (char ch2 : vowels) {
                if (ch1 == ch2) {
                    counter++;
                }
            }
        }

        return counter;
    }
}