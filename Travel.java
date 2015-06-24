package com.company;

import java.util.Random;


//    2. Программа в составе своём содержит модуль для рассчёта стоимости путешествия,
// на основе используемого автомобиля и множества других различных данных.
// Что в этом коде вам кажется неправильным, модифицируте его таким образом,
// чтобы в дальнейшем разработчик мог добавлять новую марку автомобиля с минимальными трудозатратами

class Travel {

    private Car car;

    public Travel(Car car) {
        this.car = car;
    }

    public void doTravel() {
        if (car == null) throw new IllegalStateException();
        System.out.println((car.getAmortization() * car.getAmortizationConstant() + car.getRepair()) * someInnerLogic());
    }

    private float someInnerLogic() {
        return new Random().nextFloat() + 1;
    }
}
