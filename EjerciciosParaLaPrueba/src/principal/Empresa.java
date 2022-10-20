package principal;

import java.util.ArrayList;

public class Empresa {
    private int maxVehiculos;

    Empresa(int maxVehiculos){
        this.maxVehiculos = maxVehiculos;
    }



    int costoArriendoTotal(int dias, Flota f){

        int costoTotal = 0;

        if(f.getVehiculos().size() < maxVehiculos){
            for (Vehiculo v: f.getVehiculos()) {
                costoTotal += v.arrendar();
            }
        }else {
            throw new RuntimeException("superada la maxima cantidad de vehiculos por flota");
        }

        return costoTotal;
    }



}
