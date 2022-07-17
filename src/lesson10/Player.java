package lesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();


    @Override
    public void addCardToHand(Card card) {
        hand.add(card);


    }

    @Override
    public boolean needsCard() {
        this.openHand(); // еще не реализован
        System.out.println("Nujna li esho odnd karta?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Da")){
            return true;

        }
        return false;
    }

    @Override
    public void openHand() {
        System.out.println("-------Vashi Karti------" + this.name);
        for (Card c: hand){
            System.out.println(c.getName());

        }


    }

    @Override
    public void setName(String name) {
        this.name = name;


    }

/**
 * гадл сделать тип. встаем на lesson10 правой кнопкой, new, Java klass и выбираем
 * Interface, это тот дже класс, только с буквой I в начале
 *
 */

    /**
     * как сшиваются класс с интерфейсом?
     * implements - мы следуем шаблону
     *
     */

  public int valuesHand(){
      int values = 0;
      for (Card c: hand){
          values = values + c.getValue();

      }
      return values;
 }
}
