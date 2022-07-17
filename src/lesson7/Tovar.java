package lesson7;


// мы создали новый тип. Мы созали класс, что бы он стал типом.
public class Tovar {

    // Переменная (поля класса)
    // которые описывают состояни е объекта
    // Здесь могут быть переменные которын отностся только к одному Tovar
    // и котоорые описывает состояние данног ьобъекта. Учитываем все, что важно и толко.
    // перехолдим в Main


    private int id;
    private int fullPrice;
    private int salePrice;
    private String mane;

    public void setId (int idTosave){ // мы сохранили новое имя на id
    id = idTosave;
    }

    public void setFullPrice(int newfullPrice){
        fullPrice = newfullPrice;
    }



}
