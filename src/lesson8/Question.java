package lesson8;

public class Question {

    private String question;
    /**
     * каждый вопрос содержал по 5 -10 макс.  вариантов
     */

    private Option[] options = new Option[10];

    // пришли из Mein и в этот массив нужно добавить все эти  option
    /**
     * Option option1_1 = new Option("4",1);
     *         Option option1_2 = new Option("5",1);
     *         Option option1_3 = new Option("4 7 9",1);
     *         Option option1_4 = new Option("5 8 10",1);
     *         Option option1_5 = new Option("None of the above",1);
     *
     */


    /**
     * Генерируем конструктор пустой и с одним параметром question
     */

    public Question() {
    }

    public Question(String question) {
        this.question = question;
    }

    // и также генерируем get и set на все поля


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }


    //  добавляем массив

    public void addOption(Option option){
        // вот этот вариант, который нам перейдет из этой строки public void addOption(Option option){
        // этот option нужно положить на первую свободную ячейку этого массива
        // для того чтобы пройтись по всему массиву, нужно пройтись по всему массиву
        // делаем цикл for

        for (int i =0; i < options.length; i++){
            if(options[i] == null){
                options[i] = option;
                break;

            }

        }

    }

    // пепрегруженный метод сделаем
    //одинаковый метод внутри метода эти три точки ... говорят, что мы положем туда много
    // option
    public void addOption(Option...options){
        // options - будем пользоваться как массив входящих вариантов (это уже есть на входе)
        // this.options - а это массив входящих вариантов которые нужно добавить


        for (int i =0; i < options.length; i++){
            // this - вопрос которому мы хотим добавить варианты ответов
            // предположим нам дали это три раза и это пройдет раз два три
            // и тот option который нам дали, нужно положить внутрь this.options
            //у нас есть метод уже
            /**
             * for (int i =0; i < options.length; i++){
             *             if(options[i] == null){
             *                 options[i] = option;
             *                 break;
             * мы можем вызвать уго внутри этого метода
             *
             *
             *
             */
             this.addOption(options[i]);
             // получается под вот этим куском еще вот этот кусок кода
//            for (int i =0; i < options.length; i++){
//                if(options[i] == null){
//                    options[i] = option;
//                    break;

            // и теперь внутри Main добавляем


        }

    }

}

