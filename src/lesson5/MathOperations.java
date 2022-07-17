package lesson5;

public class MathOperations {


    /**
     * Создать меетод, в котором мы передаем ,3 стороны треугольника,
     * а метод будет печатать на консоль, какой это вид треугольника.
     * <p>
     * 1. Первое слово, это модификатор доступа (регулировка обалсти видимости данного метода) -
     * как далекот он виден. 1, pablic - доступ внутри всего проекта,
     * 4. prived - доступ внутри текущего файла,
     * 2. ________ - видимость внутри текущего пакета (пакета) и его наследникам данного дфайла
     * 3.protected -  доступ внутри текущего файла и его наследникам
     * 90 процентов это pablik
     * <p>
     * 2. слово  Static - (или есть дили нет)
     * Если есть метод, то без слова статик.
     * Если без привязки к методу, то слово статик пишем.
     * Если метод сколько тебе лет? Здесь нет привязки к объекту и значит без слова статик.
     * <p>
     * 3. слово, возвращаемый тип (void) - Юлю, сколько тебе лет, ответ число, а если Юль  зайкрой окно, без
     * обратного действия.
     * Тот тип которыйц я ожидаю, я указываю.
     * <p>
     * 4 - название команды метода, Юля сколько тебе лет, это название команды. прин тайп оф треангл
     * printTypeOfTriangle
     * 5- входящие параметры (int a, int b, int c), это то, без чего невозможно выполнить это действие. Эти переменные
     * потом выводтся в методе, который у нас размещается в другом классе.
     *
     * <p>
     * 6 - тело выполнения метода (Юля пригтовь суп, это действия ёё с входящоми параметрами, что ей передадут,
     * из этого и
     * будет делать, может добавить и свое)
     *
     * Вот это готовый метод:
     * if (a + b <= c || b + c <= a || c + a <= b) {
     *             System.out.println("No triangle!!!"); // такого треугольника не существует
     *         }
     *         if (a == b && b == c && c == a) {
     *             System.out.println("Ravnostoronniy");
     *         } else if (a != b && b != c && c != a) {
     *             System.out.println("Raznostoronniy");
     *         } else {
     *             System.out.println("Ravnobedrennyi");
     *         }
     * Его нужно научиться вызывать, какб это сделать?
     * Смотрим на верх, есть слово static или нет, если слово есть, вызывается
     * метод по одному, если не, вызывается по другому.
     * Как вызывать метод со словом static (переводится как обще доступный)?
     * То, как мы назвали файл MatOperations, мы к нему и обращаемся в классе Main2
     *
     * Остановка работы метода, это слово - return (вепнуть, выход из цикла).
     * Если вместо void стоял тип int, то после слова return, нам нужно
     * полодить слово int, а так как у нас стоит void, то после void ничего!
     *
     * Т.к у нас метод public, то мы можем пользоваться в любом уроке и классе нашего проекта
     * Так делают программисты, делают много методов и потом их вызывают.
     * тогда читабельность кода выше и программу можно писать быстрее.
     *
     *
     *
     *
     *
     */

    public static void printTypeOfTriangle (int a, int b, int c) {
        //356   656   333  128 это представление сторон треугольника
        // мы должны предусмотреть, что нет треугольника 333 на 3 и на 3, его просто нет
        // все это нужно предусмотреть
        // || - это оператор или
        // == - это оператор такая же как
        // != - не такая же как

        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("No triangle!!!"); // такого треугольника не существует
            return;
        }

        if (a == b && b == c && c == a) {
            System.out.println("Ravnostoronniy");
        } else if (a != b && b != c && c != a) {
            System.out.println("Raznostoronniy");
        } else {
            System.out.println("Ravnobedrennyi");
        }
    } // здезсь закончился первый методю. Если у нас математика, используем этот класс
     // и расчитыввем другой метод

    /**
     * В метод  мы передаем 3 стороны треугольника
     * и в метод возвращает значение площади треугольника
     */

    public static double ploshadTriangle(int a, int b, int c) {
        double p = 0.5 * (a + b + c);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;

    }
    public static double ploshadTriangle (int osnovanie, int visota){
        double s = 0.5 * osnovanie * visota;
        return s;
    }

  }


