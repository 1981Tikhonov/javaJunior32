package lesson10;

public interface IBlackJack {

    /**
     * определяем какие методы нужны
     * пришел игрок и присоединился новый игрок
     *
     *
     *
     */

    void addPlayerToGame (Player player); //  пришел игрок и присоедигнился, чтот делает этот метод

    void dealTwoCardsToAllPlayer();    // метод который раздает по 2 карты сходу всем игрокам

    void dealRestCardsToAllPlayer();  // здесь раздали все оставштеся после того как раздали по 2

    void PrintWinner();  // метод печатает победителя







}
