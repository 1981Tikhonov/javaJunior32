package lesson6;

public class TourUtils {

    public static int getAveragePriceByCountry(String[][] tours, String countryBy){
        int allPricesByCountry = 0;
        int countTours = 0;

        for(int i = 0; i < tours.length; i++){
            // франция        грузия, армения
            String countriesFromCurrentTour = tours[i][1];
            // убрать запятые между слов
            countriesFromCurrentTour  = countriesFromCurrentTour.replace(",", "");
            // разбили на массив стран
            String[] countries = countriesFromCurrentTour.split(" ");
            // проверили наличие страны в туре
            if(TourUtils.findCountry(countries, countryBy)){
                // считаем кол-во туров с такой страной
                countTours++;
                // наращиваем на переменную стоимости туров
                allPricesByCountry = allPricesByCountry + Integer.parseInt(tours[i][5]);
            }
        }
        return allPricesByCountry / countTours;
    }

    private static boolean findCountry(String[] countries, String countryBy){
        // for each (для каждого)
        for(String c :countries){
            if(countryBy.equals(c)){
               return true;
            }
        }

        return false;
    }

    public static void printToursByCountry(String[][] tours, String country) {
        for(int i = 0; i < tours.length; i++){
            String countries = tours[i][1];
            countries = countries.replace(",", "");
            String[] countrs = countries.split(" ");
            if(TourUtils.findCountry(countrs, country)){
                TourUtils.printTour(tours, i);
            }
        }
    }

    private static void printTour(String[][] tours, int i){
        System.out.printf("Тур: %s, за %s руб, %s, на %s, %s, %s \n",
                tours[i][1], tours[i][5],tours[i][4],tours[i][2],tours[i][6],tours[i][3]);
    }
}
