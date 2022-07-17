package lesson9.Zoo;

public class Tiger extends Animal {
    // определяем, что нам нужны методы

    public void run (){
        System.out.println("Tiger run");

    }

    public void jump (){
        System.out.println("Tiger jump");
    }


    // переопределение метода - когда есть в родительском классе есть метод, который не нравится как работает,
    // то мы можем в дочернем классе сделать таой же метод!!! только с другим телом
    public void voice (int count){ // сигнатура метода
        System.out.println("Tiger voce rrrrr");
    }





}
