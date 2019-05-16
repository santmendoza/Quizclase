
import java.util.ArrayList;

public class Superficies extends Inmueble {

    ArrayList<String> Zonarustica;
    ArrayList<String> urbana;
    ArrayList<String>garagePublico;
    ArrayList<String>garagePrivado; 
    private int preciometro;

    public Superficies(ArrayList<String> Zonarustica, ArrayList<String> urbana, String ubicacion, int metrocuadrado,
            ArrayList<String>garagePrivado,ArrayList<String>garagepublico) {
        super(ubicacion, metrocuadrado);
        this.Zonarustica = Zonarustica;
        this.urbana = urbana;
        this.garagePrivado= garagePrivado;
        this.garagePublico=garagePublico;

    }

    public Superficies(String ubicacion, int metrocuadrado) {
        super(ubicacion, metrocuadrado);
    }

    public ArrayList<String> getZonarustica() {
        return Zonarustica;
    }

    public ArrayList<String> getUrbana() {
        return urbana;
    }

    public int getPreciometro() {
        return preciometro;
    }

  

}
