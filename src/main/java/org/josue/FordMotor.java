package org.josue;

public class FordMotor extends Motor{
    @Override
    public String presentaMT() {
        System.out.println("\tMotor \n\tDescripcion:");
        String MotorFocus = "\t\t- Potencia: 95 - 280 CV" +
                "\n\t\t- Consumo: 3,5 - 7,9 L/100Km" +
                "\n\t\t- Precio: $16,556" ;
        return MotorFocus;
    }
}
