package principal;

public class Vehiculo {

    private String patente;
    private int anhoFabricacion;
    private String marca;
    private String modelo;

    Vehiculo(String patente,int anhoFabricacion,String marca, String modelo){

        this.patente = patente;
        this.anhoFabricacion = anhoFabricacion;
        this.marca = marca;
        this.modelo = modelo;

    }


    public int arrendar(){
        int anhoactual = 2022;
        int costodiario = 0;

        if(this.anhoFabricacion == anhoactual){
            costodiario = 10000;
        }else{
            costodiario = 10000 + ( 500 * (anhoactual-this.anhoFabricacion));
        }

        return costodiario;
    }


    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnhoFabricacion() {
        return anhoFabricacion;
    }

    public String getModelo() {
        return modelo;
    }
}
