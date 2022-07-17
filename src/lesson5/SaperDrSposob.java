package lesson4;

import lesson5.SaperUtils;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperDrSposob {
    public static void main(String[] args) {
        System.out.println("Выберите уровень игры: ");
        System.out.println("1 - Новичек");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();
        int[][] fields = null;

        if(level.equals("1") || level.equalsIgnoreCase("новичек")){
            fields = new int[9][9];

            for(int mine = 0; mine < 10; mine++){
                // добавление одной мины
                SaperUtils.addMine(fields, 9, 9);
            }
        }


        if(level.equals("2") || level.equalsIgnoreCase("любитель")){
            fields = new int[16][16];

            for(int mine = 0; mine < 40; mine++){
//                int randomRowIndex = ThreadLocalRandom.current().nextInt(16);
//                int randomColIndex = ThreadLocalRandom.current().nextInt(16);
//                fields[randomRowIndex][randomColIndex] = -1;
                SaperUtils.addMine(fields, 16, 16);

            }
        }

        //

        // печатаем поле с минами
        for(int i = 0; i < fields.length; i++){
            for(int j = 0; j < fields[i].length; j++){
                if(fields[i][j] == -1){
                    System.out.print(" * ");
                }else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
