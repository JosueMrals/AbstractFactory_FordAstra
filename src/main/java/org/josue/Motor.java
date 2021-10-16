package org.josue;

public abstract class Motor {

    public abstract String presentaMT();

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    private String motor;
}
