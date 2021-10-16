package org.josue;

public class FordCarroceria extends Carroceria{
    @Override
    public String presentaCR() {
        System.out.println("\n\tCarroceria \n\tDescripcion:");
        String CarroceriaFocus = "\t\t- Tipo de Carroceria: Compacto" +
                "\n\t\t- Puertas: 5" +
                "\n\t\t- Plazas/Espacios: 5" +
                "\n\t\t-Volumen Maletero Principal: 341 l";
        return CarroceriaFocus;
    }
}
