package lesson5;

import java.util.concurrent.ThreadLocalRandom;

public class SaperUtils {

    public static void addMine(int[][] fields, int maxIndexRow, int maxIndexCol ){
        int randomRowIndex = ThreadLocalRandom.current().nextInt(maxIndexRow);
        int randomColIndex = ThreadLocalRandom.current().nextInt(maxIndexCol);
//
//        fields[randomRowIndex][randomColIndex] = -1;

        if (fields[randomRowIndex][randomColIndex] != -1){
            fields [randomRowIndex][randomColIndex] = -1;

            }else {
            addMine(fields, maxIndexRow, maxIndexCol);
        }

    }

}
