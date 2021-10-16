package org.josue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args ) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String Vehiculo;
        CocheFactory CF;
        Motor MT;
        Carroceria CR;

        System.out.println("\n¿Que coche desea ver? Opciones: \n\t1. Ford \n\t2. Astra \n: ");
        Vehiculo = entrada.readLine().toLowerCase();

        if (Vehiculo.equals("1") || Vehiculo.equals("Ford")) {
            System.out.println("\n------------ FORD FOCUS -------------");
            CF = new FordFocusFactory();

            MT = CF.crearMotor();
            System.out.println(MT.presentaMT());
            CR = CF.crearCarroceria();
            System.out.println(CR.presentaCR());

            System.out.println("\n------------------------------------");
        }
        else if (Vehiculo.equals("2") || Vehiculo.equals("Astra")) {
            System.out.println("\n------------ ASTRA OPEL -------------");
            CF = new AstraOpelFactory();

            MT = CF.crearMotor();
            System.out.println(MT.presentaMT());
            CR = CF.crearCarroceria();
            System.out.println(CR.presentaCR());

            System.out.println("\n------------------------------------");
        }
        else {
            System.out.println("Seleccion no valida, ejecute el programa nuevamente. \n\tFin del Programa.");
            System.exit(0);
        }

    }
}
