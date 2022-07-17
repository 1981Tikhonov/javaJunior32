package lesson5;

public class HomeWork2 {

    public static String reverseText(String str) {
//        public static String reverseWithCharArray (String inputString){
/**
 * 2. Метод принимает входящими параметрами текст,
 * печатает на консоль этот же текст, только в обратном порядке
 *
 */


        char[] arrayWort = str.toCharArray();
        String result = "";
        for (int i = arrayWort.length - 1; i >= 0; i--) {
            result += arrayWort[i];
        }
        return result;

    }
}




