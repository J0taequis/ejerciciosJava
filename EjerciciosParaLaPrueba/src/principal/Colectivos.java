package principal;

public class Colectivos extends Vehiculo{

    private int asientos;

    Colectivos(String patente, int anhoFabricacion, String marca, String modelo,int asientos) {
        super(patente, anhoFabricacion, marca, modelo);
        this.asientos = asientos;
    }


    @Override
    public int arrendar() {
        int tarifaBase = super.arrendar();
        int costoArriendo = tarifaBase + (3000 * this.asientos);

        return costoArriendo;
    }

    public int getAsientos() {
        return asientos;
    }

}
