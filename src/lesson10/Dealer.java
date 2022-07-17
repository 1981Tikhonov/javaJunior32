package lesson10;

public class Dealer extends Player{ // extends - этим диллер унаследовал методы Player


    @Override
    public boolean needsCard() {
        if (valuesHand() <17){
            return true;

        }
        return false;

    }
}
