package lesson3;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        /**
         * ссылочный тип этор стринг, указали тип и указхываем название переменной
         * ставим равно двойные ковычки и вводим текстовую переменную
         *
         * Нам пользователь задал пароль, нам нужно напечатать на консоль
         * подходит этот пароль или нет
         * он подходит если
         * он содержит более 8 символов
         * он содержит цифру в себе
         * он содержит большую букву
         * Откуда задавать пароль, сделаем так, что бы было с консоли.
         * in - это клавиатура
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Password: ");
        String inputPassword = scanner.nextLine();
        System.out.println(inputPassword);


        char[] charsFromPassword = inputPassword.toCharArray();
        int l = charsFromPassword.length;

        if (l < 8) ;
        {
            System.out.println("Длина пароля меньше 8 символов!!!");
            //return;
        }

        int  beg = 65;
        int  end = 90;

        int countNumbers = 0;
        int w = 0;
        while (w < l)
        {
            int ascii = (int) charsFromPassword[w];
            System.out.println(ascii);
            w++;

            //if (charsFromPassword[w] == '0' ||
             //       charsFromPassword[w] == '1' || charsFromPassword[w] == '2') {
            //    countNumbers++;
            //}
        }


    }
}
