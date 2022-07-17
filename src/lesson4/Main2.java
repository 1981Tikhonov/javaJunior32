package lesson4;

public class Main2 {
    public static void main(String[] args) {
        /**
         * Есть массив 8 на 8. Пусть весь массив будет заполнен нолями, но нужно вывести на консоль
         * в шахматном порядке, где ноль попадпет на желтое выводим 1, где на зеленую, выводим 0.
         *
         *
         *
         *
         */

        int [][] numbers = new int[8][8];

        for (int i=0; i < numbers.length; i++){
            for (int j=0; j < numbers[i].length; j++){
                if ((i + j) % 2 == 0){
                    System.out.print("0 ");
                }else {
                    System.out.print("1 ");

                }
            }
            System.out.println();

        }


    }
}
