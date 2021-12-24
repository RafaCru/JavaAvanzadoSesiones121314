package Patrones.Diseño.Decorador;

public class OpcionalesCoche implements Coche{
    private Coche coche;

    public OpcionalesCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void crear() {
        this.coche.crear();
    }
}
