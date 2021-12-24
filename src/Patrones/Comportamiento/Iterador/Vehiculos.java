package Patrones.Comportamiento.Iterador;

import java.util.ArrayList;

public class Vehiculos implements Iterador {
    private ArrayList<Vehiculo> vehiculolist=new ArrayList();
    private int indice=0;
    public void crear (Vehiculo vehiculo){
        vehiculolist.add(vehiculo);
    }
    @Override
    public Vehiculo siguiente() {
        Vehiculo vehiculo=vehiculolist.get(indice);
        indice++;
        return vehiculo;
    }

    @Override
    public boolean item() {
        return indice< vehiculolist.size();
    }

    @Override
    public void inicio() {
        indice=0;
    }
}
