package principal;

import java.util.ArrayList;

public class Carrito implements IEstadistico{

    private Cliente cliente;
    private ArrayList<Articulo>misArticulos = new ArrayList<>();

    public Carrito(Cliente cliente){
        this.cliente = cliente;
    }

    public void insertarProducto(Articulo articulo){
        misArticulos.add(articulo);
    }

    public void quitarProducto(Articulo articulo){
        misArticulos.remove(articulo);
    }

    public float costoProductos(){
        float costo = 0;
        for (Articulo p: this.misArticulos) {
            costo += p.getPrecio();
        }

        return costo;
    }

    public ArrayList listaAcuaticos(){
        ArrayList<Articulo> mostrar = new ArrayList<>();
        for (Articulo p: this.misArticulos) {
            if(p.getTipo() == 'a' || p.getTipo() == 'b'){
                mostrar.add(p);
            }
        }
        return mostrar;
    }

    public ArrayList listaElectricos(){
        ArrayList<Articulo> mostrar = new ArrayList<>();
        for (Articulo p: this.misArticulos) {
            if(p.getTipo() == 'e' || p.getTipo() == 'b'){
                mostrar.add(p);
            }
        }
        return mostrar;
    }

    public float minimo(){
        float min = Float.MAX_VALUE;

        for (Articulo p : this.misArticulos) {
            if(min > p.getPrecio()){
                min = p.getPrecio();
            }
        }

        return min;
    }

    public float maximo(){
        float max = 0;

        for (Articulo p : this.misArticulos) {
            if(max < p.getPrecio()){
                max = p.getPrecio();
            }
        }
        return max;
    }

    public float promedio(){
        float promedio = 0;
        for (Articulo p : this.misArticulos) {
            promedio += p.getPrecio();
        }

        return promedio / this.misArticulos.size();
    }



    public ArrayList<Articulo> getMisArticulos() {
        return misArticulos;
    }


}
