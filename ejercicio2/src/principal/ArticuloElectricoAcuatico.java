package principal;

public class ArticuloElectricoAcuatico extends Articulo implements Acuatico,Electrico{

    private String voltaje;
    private float capacidadBateria;
    private float profundidadMaxima;


    ArticuloElectricoAcuatico(String codigo, float precio, String descripcion,char tipo, String voltaje, float profundidadMaxima, float capacidadBateria) {
        super(codigo, precio, descripcion,tipo);
        this.voltaje = voltaje;
        this.profundidadMaxima = profundidadMaxima;
        this.capacidadBateria = capacidadBateria;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public float getCapacidadBateria() {
        return capacidadBateria;
    }

    public float getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public String infoProfundidad(){
        return "mi profundidad maxima es: "+ this.profundidadMaxima;
    }

    public String infoElectrico(){
        if(this.capacidadBateria != 0){
            return "Mi tipo de voltaje es: "+ this.voltaje + "La capacidad de mi bateria es: "+ capacidadBateria;
        }else{
            return "Mi tipo de voltaje es: "+ this.voltaje;
        }
    }




}
