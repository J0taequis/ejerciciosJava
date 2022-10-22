package principal;

public class ArticuloElectrico extends Articulo implements Electrico{

    private String voltaje;
    private float capacidadBateria;

    ArticuloElectrico(String codigo, float precio, String descripcion,char tipo,String voltaje,float capacidadBateria) {
        super(codigo, precio, descripcion,tipo);
        this.voltaje = voltaje;
        this.capacidadBateria = capacidadBateria;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public float getCapacidadBateria() {
        return capacidadBateria;
    }

    public String infoElectrico(){
        if(this.capacidadBateria != 0){
            return "Mi tipo de voltaje es: "+ this.voltaje + "La capacidad de mi bateria es: "+ capacidadBateria;
        }else{
            return "Mi tipo de voltaje es: "+ this.voltaje;
        }
    }



}
