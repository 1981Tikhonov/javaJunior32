//package Tours;
//
//public class Tour {
//
//    private int id;
//    private String[] countries = new String[15]; // сколько в турк максимально количество стран, в одном туре кол может макисму 15, автобусный
//    private int days;
//    private String typeOfTransport;
//    private int stars;
//    private int price;
//    private String Service;
//
//    /**
//     * отлносительно тура все сделали правильно
//     * то что не сложное, нужно указывать и пишем конструктор
//     */
//
//    public Tour() {
//
//    }
//
//    public Tour(int id, int days, String typeOfTransport, int stars, int price, String service) {
//        this.id = id;
//        this.days = days;
//        this.typeOfTransport = typeOfTransport;
//        this.stars = stars;
//        this.price = price;
//        this.Service = Service;
//
//    }
//
//    public void addCountry(String country){
//        // цель - добавить массив со странами в первую свободную ячейку данную строку
//        // {"Итплия", null, null,null,null,null,null,null,null,null,null,null,null,null,null,} -до 15, т.к. в массиве 15.
//
//        for(int i=0; i < countries.length; i++){
//            if(countries.length[i]){
//                countries[i] = country;
//                break;
//
//
//            }
//
//        }
//
//    }
//
//
//    // На все поля сделать методы сдеолать методы set и методы get (возвращение значение поля) - ДЗ
//
//
//
//
//
//}
