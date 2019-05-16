
import java.util.ArrayList;



public class Construcciones extends Inmueble{

    private int precio;
    private int numbHabitaciones;
    private int piso;
    private int preciometrocuadrado;

    public Construcciones(String ubicacion, int metrocuadrado) {
        super(ubicacion, metrocuadrado);
    }

    public Construcciones(int precio, int numbHabitaciones, int piso, String ubicacion, int metrocuadrado) {
        super(ubicacion, metrocuadrado);
        this.precio = precio;
        this.numbHabitaciones = numbHabitaciones;
        this.piso = piso;
    }

    public Construcciones(int preciometrocuadrado, String ubicacion, int metrocuadrado) {
        super(ubicacion, metrocuadrado);
        this.preciometrocuadrado = preciometrocuadrado;
    }

    public int getPrecio() {
        return precio;
    }

    public int getNumbHabitaciones() {
        return numbHabitaciones;
    }

    public int getPiso() {
        return piso;
    }

    public int getPreciometrocuadrado() {
        return preciometrocuadrado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getMetrocuadrado() {
        return metrocuadrado;
    }

 
    
    
    
    
    
}
