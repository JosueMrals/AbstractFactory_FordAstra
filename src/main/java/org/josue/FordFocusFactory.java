package org.josue;

public class FordFocusFactory implements CocheFactory{

    @Override
    public Motor crearMotor() {
        return new FordMotor();
    }

    @Override
    public Carroceria crearCarroceria() {
        return new FordCarroceria();
    }
}
