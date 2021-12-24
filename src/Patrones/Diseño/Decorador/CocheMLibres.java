package Patrones.Diseño.Decorador;

public class CocheMLibres extends OpcionalesCoche{
    public CocheMLibres(Coche coche){
        super(coche);
    }

    @Override
    public void crear() {
        super.crear();
        System.out.println("** Incluir opcional manos libres");
    }
}
