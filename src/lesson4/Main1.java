package lesson4;

public class Main1 {

    public static void main(String[] args) {
        /**
         * i строки
         * j колонки
         *
         *
         */


        int[][] numbers = new int[3][4];

//        System.out.print(numbers[0][0] + " ");
//        System.out.print(numbers[0][1] + " ");
//        System.out.print(numbers[0][2] + " ");
//        System.out.print(numbers[0][3] + " ");
//        System.out.println();
//        System.out.print(numbers[1][0] + " ");
//        System.out.print(numbers[1][1] + " ");
//        System.out.print(numbers[1][2] + " ");
//        System.out.print(numbers[1][3] + " ");
//        System.out.println();
//        System.out.print(numbers[2][0] + " ");
//        System.out.print(numbers[2][1] + " ");
//        System.out.print(numbers[2][2] + " ");
//        System.out.print(numbers[2][3] + " ");
//        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i][0] + " ");
//            System.out.print(numbers[i][1] + " ");
//            System.out.print(numbers[i][2] + " ");
//            System.out.print(numbers[i][3] + " ");
//            System.out.println();

            for (int j=0; j < numbers.length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();

        }


    }
}
