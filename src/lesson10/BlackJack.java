//package lesson10;
//
//import java.util.ArrayList;
//
//public class BlackJack implements IBlackJack {  // BlackJack сшили вместе с IBlackJack
//
//    // определяем, что должно быть внутри BlackJack, это 52 карты колода
//    private Koloda koloda = new Koloda();
//    private ArrayList<Player> players = new ArrayList<>();
//
//
//    @Override
//    public void addPlayerToGame(Player player) {
//        if (players.size() < 9) {
//            players.add(player);
//            } else {
//            System.out.println("Net svobodnich mest, prostite");
//        }
//
//    }
//
//    @Override
//    public void dealTwoCardsToAllPlayer() {
//        for (Player p: players){
//            p.addCardToHand(koloda.getRandomCard());
//            p.addCardToHand(koloda.getRandomCard());
//
//        }
//
//    }
//
//    @Override
//    public void dealRestCardsToAllPlayer() {
//        for (Player p: players){
//            while (p.needsCard()){
//                p.addCardToHand(koloda.getRandomCard());
//
//
//            }
//
//
//        }
//
//
//    }
//
//    @Override
//    public void PrintWinner() {
//
//    }
//}
