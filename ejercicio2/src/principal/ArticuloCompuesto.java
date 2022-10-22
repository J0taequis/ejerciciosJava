package principal;

import java.util.ArrayList;

public class ArticuloCompuesto extends Articulo{

    private ArrayList<Articulo> articulos;

    ArticuloCompuesto(String codigo, float precio, String descripcion,char tipo ,ArrayList<Articulo> articulos) {
        super(codigo, precio, descripcion,tipo);
        this.articulos = articulos;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
}
