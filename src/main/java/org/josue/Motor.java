package org.josue;

public abstract class Motor {
    public abstract String presentaMT();

    private String motor;

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

}
