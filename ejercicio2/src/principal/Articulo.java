package principal;

public class Articulo {

    private String codigo;
    private float precio;
    private String descripcion;

    private char tipo; // e,a,b (ambos)

    Articulo(String codigo, float precio, String descripcion,char tipo){
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public char getTipo() {
        return tipo;
    }
}
