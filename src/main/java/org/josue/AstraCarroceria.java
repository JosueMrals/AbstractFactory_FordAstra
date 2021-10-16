package org.josue;

public class AstraCarroceria extends Carroceria{
    @Override
    public String presentaCR() {
        System.out.println("\n\tCarroceria \n\tDescripcion:");

        String CarroceriaAstra = "\t- Tipo de Carroceria: Turismo" +
                "\n\t\t- Longitud: 4,37m" +
                "\n\t\t- Volumen Maletero Principal: 370 l" +
                "\n\t\t- Caja de Cambios: Manual/Automatica(para mujeres XD)";
        return CarroceriaAstra;
    }
}