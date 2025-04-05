package pojos;

public class Mes {
    private int numero;
    private String nombre;
    private int cantidadDias;

    public Mes(int numero, String nombre, int cantidadDias) {
        this.setNumero(numero);
        this.setNombre(nombre);
        this.setCantidadDias(cantidadDias);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
}
