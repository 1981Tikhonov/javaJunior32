package lesson2;

public class Main1 {

    public static void main(String[] args) {

        /**
         * Есть число, нужно напечатать на консоли "чётное "
         * либо "не чётное", в замисимостьи от того какое это число
         *Это может быть число из браузера. Только мы сейчас все это обренем в
         * конструкцию и else. Вот есть число, и если оно делится без остатка, значит оно четное.
         *  В противном слкчае не четное. Если мозг говорит если, то это
         *  оператор if. Вот это все переводтся как если: if() {
         *  }. Вычислим остаток от деления, этот number % (остаток) 2
         * Получается презультат в виде математического числа, и если
         * оно ноль == 0, если это 0, то печатаем на консоль  sout "четное".
         * В противном случае else и и тело }{, будет без дополнительного условия if.
         *
         */


        int number = 12;

        if(number % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");

        }

    }



    }

