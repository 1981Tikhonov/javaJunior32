package lesson5;

public class SsmallerNumberUtils {


    public static int SsmallerNumberUtils(int a, int b, int c) {

        /**
         * 5) В метод передаем 3 числа, метод должен вернуть меньшее число из 3х
         */

        int min;

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

      int result = min;

        return result;
    }
}


