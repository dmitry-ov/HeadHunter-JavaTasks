package com.company;

/*
    //    1. Почему данный код в результате напечатает -6, не меняя значений a и b измените код так,
    // чтобы он выводил арифмитечски верное значение суммы a и b

    public static void main(String[] args) {
        int a = 0x7ffffffc;
        int b = 0x7ffffffe;

        int c = a + b;
        System.out.println(c);
    }

*/

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        /*  Задача 1  */
        //    1. Почему данный код в результате напечатает -6, не меняя значений a и b измените код так,
        // чтобы он выводил арифмитечски верное значение суммы a и b
        //public static void main(String[] args) {
        //    int a = 0x7ffffffc;
        //    int b = 0x7ffffffe;
        //
        //    int c = a + b;
        //    System.out.println(c);
        //}

        int a = 0x7ffffffc;
        long b = 0x7ffffffe;

        /*
         Числа a и b заданы в виде шестнадцатеричных значений.
         int c = a + b; // Не явное преобразование в int.

         Шестнадцатиричное представление результата вычисления a + b обозначает отрицательное число для типа int
         0x7ffffffc + 0x7ffffffe = 0xfffffffa

         В типе int положительные числа от 0x0 до 0x7FFFFFFF, выше 0x80000000 отрицательные

         Что бы результат вычисления был верным, нужно тип одной из переменных и тип результата задать long,
         у диапазон больше long значений.

         При сложении переменной int и long, результат будет типа long
        */

        long c = a + b;
        System.out.println(c);


        /*  Задача 2  */
        //2. Программа в составе своём содержит модуль для рассчёта стоимости путешествия,
        //на основе используемого автомобиля и множества других различных данных.
        //Что в этом коде вам кажется неправильным, модифицируте его таким образом,
        //чтобы в дальнейшем разработчик мог добавлять новую марку автомобиля с минимальными трудозатратами


        Car ford = new Car(5, 5, 100);
        Car opel = new Car(5, 3, 200);

        Travel travelToday = new Travel(ford);
        travelToday.doTravel();

        Travel travelNextYear = new Travel(opel);
        travelNextYear.doTravel();

        // Мне кажется не правильным:
        // - наличие в программе 2-х классов (Ford и Opel) с похожим содержимым,
        // - классы (Ford и Opel) содержали параметры для расчета стоимости путешествия
        // - наличие в классе travel отдельных функций расчета для экземпляров классов Opel и Ford,
        // при этом код функций отличаются только еще одним параметром.


        /*  Задача 3  */
        //    3. Представим, что в некоем абстрактном складском приложении смартфоны представлены классом SmartPhone.
        // Содержит ли класс SmartPhone какие либо ошибки?


        // Содержит следующие ошибки:
        // - Функция hashCode зависит от случайного параметра, а должна зависеть только от внутреннего
        // содержимого класса. Для 2-х одинаковых объектов будут разные значения hashCode - это не допустимо.
        // Если 2 объекта идентичны их значения hashCode должны быть равны.
        // - В конструкторе SmartPhone при присвоении значений аттрибутам не указана ссылка на текущий экземпляр
        // вместо "model = model;", нужно "this.model = model;"

        // - Корректным был бы такой вариант реалзиации hashCode:

        //    public int hashCode() {
        //        return model.hashCode() + date.hashCode() + revision.hashCode();
        //    }

        Date date = new Date();
        SmartPhone wp = new SmartPhone("Htc", date, "Mozart");
        System.out.println(wp.hashCode());

        SmartPhone android = new SmartPhone("Samsung", date, "Galaxy VII");
        System.out.println(android.hashCode());

        SmartPhone nexus = new SmartPhone("Samsung", date, "Galaxy VII");
        System.out.println(nexus.hashCode());

        if (nexus.equals(android))
            System.out.println("nexus is android");

        if (!wp.equals(nexus))
            System.out.println("Windows phone is not android");
    }
}