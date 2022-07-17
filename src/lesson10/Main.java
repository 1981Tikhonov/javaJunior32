package lesson10;

public class Main {

    public static void main(String[] args) {

   // собрали каркас, сшили при помощи implements 3 класса и 3 каркаса с I
   // приходит крупье и создаем игру  BlackJack

        BlackJack blackJack = new BlackJack(); // создали объект игры BlackJack
        Dealer dealer = new Dealer();  // появляется крупье



        Player player1 = new Player();
        Player player2 = new Player();
        player1.setName("Vasia");
        player2.setName("Petia");

        // сели за стол 3 игрока,

       blackJack.addPlayerToGame(player1);
       blackJack.addPlayerToGame(player2);
       blackJack.addPlayerToGame(dealer);


       blackJack.dealTwoCardsToAllPlayer(); // раздали по 2 карты
       blackJack.dealRestCardsToAllPlayer(); // дораздаем еще дополнительные карты кому нужно
       blackJack.PrintWinner();

       // все готово теперь будем реалихзовывать внутрянку каждого класса









    }
}
