package org.josue;

public class AstraOpelFactory implements CocheFactory{

    @Override
    public Motor crearMotor() {
        return new AstraMotor();
    }

    @Override
    public Carroceria crearCarroceria() {
        return new AstraCarroceria();
    }
}
