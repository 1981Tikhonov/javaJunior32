package lesson7;

public class Triangle {

    private int a;
    private int b;
    private int c;

    /**
     * формула создания контстркутора
     * 1 - модификатор конструктора0, он должен бдыть public
     * 2 - название класса, если название класса Triangle. Это и есть  название контсрк=уктора
     * 3 - входящие параметры
     */

    public Triangle() {

    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    // сделаеи методы set. которые устанавливают 3 метода

    public void setA(int a) {
        // 7 пришла как переменная а
        // и а как мозговой центр. Программа запуталась.
        // надо было сохраниеть как this.a

        this.a = a;
    }

    public void setB(int b) {
        this.b = b;

    }

    public void setC(int c) {
        this.c = c;
    }

    public int perimetr() { // про себя она знает и параметры вносить в () гне нужно
        //return  this.a + this.b+ this.c // можно по другому
        return a + b + c;
    }


}


