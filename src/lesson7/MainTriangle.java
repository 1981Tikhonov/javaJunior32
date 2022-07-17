package lesson7;

public class MainTriangle {


    public static void main(String[] args) {
        Triangle triangle = new Triangle();
       // вызов метода:
        // в метод передаются 2 параметра, явные (передаются в метод в виде входящих парметров )и
        // не явные (это тот объекту которого вызван данный метод). он внутри метода доступен this.a
        // у какого треуголь ник вызыван this. тот сейчас и активен

        triangle.setA(7);
        triangle.setB(5);
        triangle.setC(10);

        Triangle triangle2 = new Triangle(5,5,6);
        triangle2.setA(5);
        triangle2.setB(5);
        triangle2.setC(6);

        System.out.println(triangle.perimetr());
        System.out.println(triangle2.perimetr());




    }
}
