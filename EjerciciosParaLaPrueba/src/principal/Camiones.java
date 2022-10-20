package principal;

public class Camiones extends Vehiculo{

    private int tonelaje;

    Camiones(String patente, int anhoFabricacion, String marca, String modelo,int tonelaje) {
        super(patente, anhoFabricacion, marca, modelo);
        this.tonelaje = tonelaje;
    }


    @Override
    public int arrendar() {

        int tarifaBase = super.arrendar();
        int costoArriendo = tarifaBase + (5000 * tonelaje);


        return costoArriendo;
    }


    public int getTonelaje() {
        return tonelaje;
    }
}
