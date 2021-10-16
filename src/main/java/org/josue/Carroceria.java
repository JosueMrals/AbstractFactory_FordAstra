package org.josue;

public abstract class Carroceria {

    public abstract String presetaCR();

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    private String carroceria;

}
