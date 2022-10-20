package principal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws RuntimeException{

        ArrayList<Vehiculo> miFlota = new ArrayList<>();

        //Vehiculos
        miFlota.add(new Colectivos("qwhrj",2000,"subaru","3ds",10));
        miFlota.add(new Micros("asjkfa",2000,"honda","4ds",20,10));
        miFlota.add(new Camiones("asjd",2000,"hyunday","5ds",30));
        //Flota

        Flota laflota = new Flota("calistenicos","sion",miFlota);

        //Empresa

        Empresa miempresa = new Empresa(4);

        for (Vehiculo v: laflota.getVehiculos()) {
            System.out.println("####### costo #######");
            System.out.println("soy el vehiculo patente: "+ v.getPatente());
            System.out.println("y el costo del arriendo es: "+ v.arrendar());
        }
        System.out.println("");
        System.out.println("####################");

        System.out.println(miempresa.costoArriendoTotal(10,laflota));

    }
}
