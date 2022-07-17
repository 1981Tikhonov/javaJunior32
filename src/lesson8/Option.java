package lesson8;

public class Option {

    private String option;
    private boolean isCorrect = false;
    private double point = 0;


    // начинаем всегда с пустого, это правило
    // правой кнопкой мыши Generate потом Constructor и далее
    // синюю lesson8 .....


    public Option() {
    }

    //  Generate Constructor, было бы удобно сейчас option  и point
    // остальное добросим


    public Option(String option, double point) {
        this.option = option;
        this.point = point;
    }

    // теперь get и set, они тоже генерируются, выбираем все поля,
    // не знаем когда придется менять, делаем на все.



    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

//  это класс Option, готов и переходим в question


}



