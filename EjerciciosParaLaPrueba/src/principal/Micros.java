package principal;

public class Micros extends Vehiculo{

    private int asientos;
    private int maxPasajerosDePie;

    Micros(String patente, int anhoFabricacion, String marca, String modelo, int asientos, int maxPasajerosDePie) {
        super(patente, anhoFabricacion, marca, modelo);
        this.asientos = asientos;
        this.maxPasajerosDePie = maxPasajerosDePie;
    }


    @Override
    public int arrendar() {

        int tarifaBase = super.arrendar();
        int costoArriendo = tarifaBase + (250 * this.asientos) + (200 * maxPasajerosDePie);

        return costoArriendo;
    }

    public int getAsientos() {
        return asientos;
    }

    public int getMaxPasajerosDePie() {
        return maxPasajerosDePie;
    }
}
