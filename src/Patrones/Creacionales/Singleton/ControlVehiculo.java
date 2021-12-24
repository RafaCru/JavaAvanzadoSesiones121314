package Patrones.Creacionales.Singleton;

public class ControlVehiculo {
    private static ControlVehiculo controlVehiculo;
    boolean vehiculoenmovimiento=false;
private ControlVehiculo(){

}
public static ControlVehiculo getInstance(){
    if (controlVehiculo==null){
        controlVehiculo= new ControlVehiculo();
    }
    return controlVehiculo;
}
    public void enmarcha(){
        vehiculoenmovimiento=true;
    }
}
