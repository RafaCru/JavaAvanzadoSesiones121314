package Patrones.Comportamiento.Iterador;

/**
 * Patron PatronesComportamiento.Iterador
 * Presentamos dos Clases Abstrctas
 * PatronesComportamiento.Iterador que incluye 3 metodos: inicio, item, siguiente
 * Catalogo clase abstracta que incluye los metodos: crean, inicializan y devuelven una instancia de PatronesComportamiento.Iterador
 *
 *
 *
 * */
public class Main {

    public static void main(String[] args) {
        Vehiculos vehiculos =new Vehiculos();
        vehiculos.crear(new Vehiculo("Seat", "Toledo", 90, 160, "Airbag, ABS, EPS, Detección de sueño  " ));
        vehiculos.crear(new Vehiculo("Ford", "Capa", 90, 170, "Airbag, ABS" ));
        vehiculos.crear(new Vehiculo("Toyota", "Coro", 130, 180, "Airbag, ABS, EPS, Detección de sueño  " ));
        vehiculos.crear(new Vehiculo("Wolsvagen", "Plo", 160, 200, "Airbag, ABS, EPS, Detección de sueño  " ));
        vehiculos.crear(new Vehiculo("Fiat", "Tipo", 75, 150, "Airbag, ABS, EPS, Detección de sueño  " ));
        while (vehiculos.item()){
            Vehiculo vehiculo= vehiculos.siguiente();
            System.out.println(vehiculo);
        }
        vehiculos.crear(new Vehiculo("Seat", "Ibiza", 90, 160, "Airbag, ABS, EPS, Detección de sueño  " ));
        vehiculos.crear(new Vehiculo("Hunday", "Capa", 90, 170, "Airbag, ABS" ));
        vehiculos.crear(new Vehiculo("Kia", "Ceed's", 130, 180, "Airbag, ABS, EPS, Detección de sueño  " ));
        vehiculos.crear(new Vehiculo("Audi", "Quatro", 160, 200, "Airbag, ABS, EPS, Detección de sueño  " ));
        vehiculos.crear(new Vehiculo("Fiat", "Seiscientos", 75, 150, "Airbag, ABS, EPS, Detección de sueño  " ));
        /*si introduciomos un reinicia se pondra a cero en lugar de continuar en la ultima posicion*/
//              vehiculos.inicio();
        System.out.println();
        System.out.println();
       ;
        while (vehiculos.item()){
            Vehiculo vehiculo= vehiculos.siguiente();
            System.out.println(vehiculo);
        }
    }
}
