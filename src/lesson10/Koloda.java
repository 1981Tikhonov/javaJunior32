//package lesson10;
//
//import java.util.ArrayList;
//
//public class Koloda implements IKoloda{
//
//    // массив карт
//    // всего 10 коллекций мы разберем безразмерный массив ArrayList
//
//    ArrayList<Card> cards = new ArrayList<>(); // безразмерный массив карт
//
//    public Koloda(){
//        this.preparedCards(); // вызов этой колоды 52 карты
//
//    }
//
//
//    // сделаем метод 52 карты в колоде и наполним этот массив
//    public void preparedCards(){
//        // нам нужно создать 52 карты и положить его в массив
//        cards.add(new Card("Two trefa",2));
//        cards.add(new Card("Two cherva",2));
//        cards.add(new Card("Two pica",2));
//        cards.add(new Card("Two bubna",2));
//
//        cards.add(new Card("Three trefa",3));
//        cards.add(new Card("Three cherva",3));
//        cards.add(new Card("Three pica",3));
//        cards.add(new Card("Three bubna",3));
//
//        cards.add(new Card("Four trefa",4));
//        cards.add(new Card("Four cherva",4));
//        cards.add(new Card("Four pica",4));
//        cards.add(new Card("Four bubna",4));
//
//        cards.add(new Card("Five trefa",5));
//        cards.add(new Card("Five cherva",5));
//        cards.add(new Card("Five pica",5));
//        cards.add(new Card("Five bubna",5));
//
//        cards.add(new Card("Six trefa",6));
//        cards.add(new Card("Six cherva",6));
//        cards.add(new Card("Six pica",6));
//        cards.add(new Card("Six bubna",6));
//
//        cards.add(new Card("Seven trefa",7));
//        cards.add(new Card("Seven cherva",7));
//        cards.add(new Card("Seven pica",7));
//        cards.add(new Card("Seven bubna",7));
//
//        cards.add(new Card("Eight trefa",8));
//        cards.add(new Card("Eight cherva",8));
//        cards.add(new Card("Eight pica",8));
//        cards.add(new Card("Eight bubna",8));
//
//        cards.add(new Card("Nine trefa",9));
//        cards.add(new Card("Nine cherva",9));
//        cards.add(new Card("Nine pica",9));
//        cards.add(new Card("Nine bubna",9));
//
//        cards.add(new Card("Ten trefa",10));
//        cards.add(new Card("Ten cherva",10));
//        cards.add(new Card("Ten pica",10));
//        cards.add(new Card("Ten bubna",10));
//
//        cards.add(new Card("Valet trefa",10));
//        cards.add(new Card("Valet cherva",10));
//        cards.add(new Card("Valet pica",10));
//        cards.add(new Card("Valet bubna",10));
//
//        cards.add(new Card("Dama trefa",10));
//        cards.add(new Card("Dama cherva",10));
//        cards.add(new Card("Dama pica",10));
//        cards.add(new Card("Dama bubna",10));
//
//        cards.add(new Card("Korol trefa",10));
//        cards.add(new Card("Korol cherva",10));
//        cards.add(new Card("Korol pica",10));
//        cards.add(new Card("Korol bubna",10));
//
//        cards.add(new Card("Tuz trefa",11));
//        cards.add(new Card("Tuz cherva",11));
//        cards.add(new Card("Tuz pica",11));
//        cards.add(new Card("Tuz bubna",11));
//
//
//    }
//
////
////    @Override
////    public Card getRandomCard() {
////        // ДЗ сделать так что бы колода уменьшалась и удалялись карты которые мы вытянули
////        int index = ThreadLocalRandom.current().nextInt(0, cards.size());
////        return  cards.get (index);
//
//
//
//    }
//}
