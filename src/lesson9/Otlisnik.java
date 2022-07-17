package lesson9;

public class Otlisnik extends Student {   // наследование у родителя, родитель Student
    // extends  - переводится как "является ли", если отвечает то наследовать можно, иначече говнокод.
    // хвойное является дерево, дерево является деревом, деревол является растением.


    @Override  // аннатацию не удаляем, потомучто может быть код, в этом случае она пуста
    public void printPerimetrTriangle(int a, int b, int c) {
//        super.printPerimetrTriangle(a, b, c); всегда в методе это удаляем
        if (a > b + c || b > a + c || c > b + c) {
            System.out.println("Это не треугольник");


        }

    }
}
