package lesson1;

public class HomeWork1 {

    public static void main(String[] args) {

        // int - целое, double - дробное
        int cash = 1000;
        int pricePizza = 230;
        int priceGum = 26;
        double priceCandy = 2.5;

        // расчёт
        int maxPizza = cash / pricePizza;
        int maxGum = (cash - maxPizza * pricePizza) / priceGum;
        int maxCandy =   (cash - maxPizza * pricePizza) - maxGum * priceGum;
        double change = cash - (maxPizza * pricePizza) - (maxGum * priceGum) - (maxCandy*priceCandy);

        // вывод данных
        System.out.println("Pizza:" + maxPizza);
        System.out.println("Gum:" + maxGum);
        System.out.println("Candy:" + maxCandy);
        System.out.println("change in sh:" +change);
    }


}


