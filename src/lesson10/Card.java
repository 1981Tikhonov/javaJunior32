package lesson10;

public class Card {
    /**
     * Методов очень много. Вытинуть рандомно карту, он будет принадлежать колоде
     * то победитель - это блэкджек
     * дать карту - жто относится к плееру
     * разбиваем методы по типам. Начинаем, с того чтобы меьтоды раскидать по файликам, что это за файлик.
     * Интерфейс - это набросок, он внутр  класса, черткж, по которому мы пойдем. Это типа проект, набо методов которые
     * должны ьбыть в классе
     *
     *
     */
     // что нам нужно относительно одной карты, какие поля

    private String name; // валет трефа
    private int value; // весит 10 (очки)

    public Card() {
    }

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // с этим классом все, идем в колоду


}



