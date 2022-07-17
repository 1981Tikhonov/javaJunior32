package lesson5;

import javax.xml.transform.Result;

public class CreateMethodUtils {


    public static String squareOfOnes(int row, int coll) {

        /**
         * 4) В метод передаем кол-во строк и кол-во колонок,
         * метод печатает на консоль квадрат из единичек по
         * этим параметрам
         *
         */

        String result = "";

//        int[][] numbers = new int [3][3];

        for (int i =1; i <= row; i++){
            for (int j=1; j <= coll; j++){
                result = result + "1";
            }
        result = result + "\n";
        }
        return result;
    }

}