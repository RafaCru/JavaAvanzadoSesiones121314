package Patrones.Diseño.Decorador;

public class Main {
    public static void main (String[] args){
//    CocheBase cocheBase=new CocheBase();
//    cocheBase.crear();
    CocheMLibres cocheMLibres=new CocheMLibres(new CocheBase());
//    cocheMLibres.crear();
    CocheGPS cocheGPS=new CocheGPS(cocheMLibres);
    cocheGPS.crear();
    }
}
