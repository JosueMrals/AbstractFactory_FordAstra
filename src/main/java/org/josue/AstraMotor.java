package org.josue;

public class AstraMotor extends Motor{

    @Override
    public String presentaMT() {
        System.out.println("\tMotor \n \tDescripcion:");

        String AstraMotor = "\t\t- Precio: $15,997 - $23,883" +
                "\n\t\t- Comercializacion: 09/2015 - 10/2019" +
                "\n\t\t- Potencia Maxima: De 95 a 200 CV" +
                "\n\t\t- Traccion: Delantera" +
                "\n\t\t- Combustible: Gasolina, Diesel";

        return AstraMotor;

    }
}
