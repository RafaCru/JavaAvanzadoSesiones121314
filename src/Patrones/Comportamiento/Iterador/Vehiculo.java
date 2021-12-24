package Patrones.Comportamiento.Iterador;

public class Vehiculo {
    String marca;
    String modelo;
    int potenciaCV;
    int velmax;
    String seguridad;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int potenciaCV, int velmax, String seguridad) {
        this.marca = marca;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.velmax = velmax;
        this.seguridad = seguridad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getVelmax() {
        return velmax;
    }

    public void setVelmax(int velmax) {
        this.velmax = velmax;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    @Override
    public String toString() {
        return "Vehiculo2{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potenciaCV=" + potenciaCV +
                ", velmax=" + velmax +
                ", seguridad='" + seguridad + '\'' +
                '}';
    }
}
