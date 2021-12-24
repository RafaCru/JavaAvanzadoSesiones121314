package Patrones.Diseño.Decorador;

public class CocheBase implements Coche {

    @Override
    public void crear() {
        System.out.println("CocheBase Básico " + "\nOpcionales:");
        abs();
        eps();
        airbag();
    }
    private void abs(){
        System.out.println("** Incluir opcional ABS");
    }
    private void eps(){
        System.out.println("** Incluir opcional Eps");
    } private void airbag(){
        System.out.println("** Incluir opcional airbag traseros");
    }
}
