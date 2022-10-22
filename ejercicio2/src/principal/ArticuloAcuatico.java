package principal;

public class ArticuloAcuatico extends Articulo implements Acuatico{

    private float profundidadMaxima;

    ArticuloAcuatico(String codigo, float precio, String descripcion,char tipo, float profundidadMaxima) {
        super(codigo, precio, descripcion, tipo);
        this.profundidadMaxima = profundidadMaxima;
    }

    public float getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public String infoProfundidad(){
        return "mi profundidad maxima es: "+ this.profundidadMaxima;
    }
}
