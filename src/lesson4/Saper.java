package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;

public class Saper {
    public static void main(String[] args) {
        /**
         * Игра сопер. Введите имя, выберите уровень, новичок, любитель или профессионал.
         * Создать двумерный массив и заполнить 10 минами рандомно, любитель 15 на 15, профессионал 20 на 20.
         *
         *
         *
         */

        System.out.println("Viberite uroven igri ");
        System.out.println("1 - Nov");
        System.out.println("2 - Lub");
        System.out.println("3 - Prof");
        System.out.println("4 - Osob ");

        Scanner scanner = new Scanner(System.in);

        String level = scanner.nextLine();
        int[][] fields = null;
        int max = 0;
        int maxmine = 0;

        if (level.equals("1") || level.equalsIgnoreCase("Nov")) {

            fields = new int[9][9];
            max = 9;
            maxmine = 10;

        } else if (level.equals("2") || level.equalsIgnoreCase("Lub")) {


            fields = new int[15][15];
            max = 15;
            maxmine = 15;
        }

        else if (level.equals("3") || level.equalsIgnoreCase("Prof")) {
            fields = new int[20][20];
            max = 20;
            maxmine = 20;
        }

        for (int mine = 0; mine < maxmine; mine++) {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(max);
                int randomColIndex = ThreadLocalRandom.current().nextInt(max);
                fields[randomRowIndex][randomColIndex] = -1;
            }


        //


        // Печатаем поле с минами

        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields.length; j++) {
                if (fields[i][j] == -1) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" - ");

                }
            }

            System.out.println();

        }


//        if (level.equals("2") || level.equalsIgnoreCase("Nov")){
//
//            int[][] fields = new int [16][16];
//
//            for (int mine = 0; mine < 40; mine++) {
//                int randomRowIndex = ThreadLocalRandom.current().nextInt(16);
//                int randomColIndex = ThreadLocalRandom.current().nextInt(16);
//                fields[randomRowIndex][randomColIndex] = -1;
//            }
//        }




}
}
