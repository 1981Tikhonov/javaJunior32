package lesson5;

public class Mein2 {

    public static void main(String[] args) {
        //

        MathOperations.printTypeOfTriangle(2,4,5);
        MathOperations.printTypeOfTriangle(4,4,4);
        MathOperations.printTypeOfTriangle(4,4,5);

        double ploshad1 = MathOperations.ploshadTriangle(2,4,3);
        double ploshad2 = MathOperations.ploshadTriangle(4,6);
         if (ploshad1 > ploshad2){
             System.out.println("Perviy treygolnik bolshe");

         }else if (ploshad1 < ploshad2){
             System.out.println("Vtoroy treygolnik bolshe");
         } else {
             System.out.println("Treygolniki ravni");
         }

    }
}

