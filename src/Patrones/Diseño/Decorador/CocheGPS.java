package Patrones.Diseño.Decorador;

public class CocheGPS extends OpcionalesCoche{
    public CocheGPS(Coche coche){
        super(coche);
    }

    @Override
    public void crear() {
        super.crear();
        System.out.println("** Incluir opcional navegador GPS");
        System.out.println("** Incluir opcional localizador GPS");
    }
}
