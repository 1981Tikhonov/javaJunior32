package lesson5;

public class HomeWorke22 {

    public static void main(String[] args) {
        /**
         * . Метод принимает входящими параметрами текст,
         *   печатает на консоль этот же текст, только в обратном порядке
         *
         *  метод 2
         */

        String inputString = "Wort";
        String reversedString = new StringBuffer(inputString).reverse().toString();
        System.out.println(reversedString);

    }
}
