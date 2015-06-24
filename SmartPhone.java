package com.company;

import java.util.Date;
import java.util.Random;


//    3. Представим, что в некоем абстрактном складском приложении смартфоны представлены классом SmartPhone.
// Содержит ли класс  SmartPhone какие либо ошибки?

class SmartPhone {
    private String model;
    private Date date;
    private String revision;

    public SmartPhone(String model, Date date, String revision) {
        this.model = model;
        this.date = date;
        this.revision = revision;
    }

//    public int hashCode() { return new Random().nextInt(); }

    public int hashCode() {
        return model.hashCode() + date.hashCode() + revision.hashCode();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmartPhone that = (SmartPhone) o;

        if (!date.equals(that.date)) return false;
        if (!model.equals(that.model)) return false;
        if (!revision.equals(that.revision)) return false;

        return true;
    }
    /**
     * setters, getters and
     * some important methods
     *
     *
     */

}
