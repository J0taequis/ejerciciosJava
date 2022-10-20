package principal;

import java.util.ArrayList;

public class Flota {

    private String nombre;
    private String arrendatario;
    private ArrayList<Vehiculo> vehiculos;

    Flota(String nombre, String arrendatario, ArrayList<Vehiculo> vehiculos){
        this.nombre = nombre;
        this.arrendatario = arrendatario;
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public String getArrendatario() {
        return arrendatario;
    }
}
