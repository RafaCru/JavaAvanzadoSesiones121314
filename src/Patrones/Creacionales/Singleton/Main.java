package Patrones.Creacionales.Singleton;



public class Main {
    public static void main(String [] args){
    ControlVehiculo coche = ControlVehiculo.getInstance();
    ControlVehiculo coche2 = ControlVehiculo.getInstance();
        System.out.println(coche);
        System.out.println(coche2);
    }
}
