package principal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // articulos

        ArticuloElectrico soyelectrico = new ArticuloElectrico("asdas",100,"soy electrico",'e',"directo",5);
        ArticuloAcuatico soyacuatico = new ArticuloAcuatico("asdfrji",200,"soy acuatico",'a',100);
        ArticuloElectricoAcuatico soyambos = new ArticuloElectricoAcuatico("afsdoa",300,"soy ambos",'b',"alterno",200,7);

        // articulo compuesto

        ArrayList<Articulo>compuesto = new ArrayList<>();
        compuesto.add(soyacuatico);
        compuesto.add(soyelectrico);
        compuesto.add(soyambos);

        ArticuloCompuesto soycompuesto = new ArticuloCompuesto("jrse",3000,"soy compuesto",'a',compuesto);

        //cliente

        Cliente sion = new Cliente("sion",1);


        // carrito

        Carrito carrito = new Carrito(sion);

        // añadir al carrito

        carrito.insertarProducto(soyacuatico);
        carrito.insertarProducto(soyelectrico);
        carrito.insertarProducto(soyambos);
        carrito.insertarProducto(soycompuesto);

        // imprimimos por pantalla

        System.out.println("costo total del carrito : " +carrito.costoProductos());

        System.out.println("el que tiene precio minimo del carrito: "+ carrito.minimo()); // usando interfaz
        System.out.println("el que tiene precio maximo del carrito: "+ carrito.maximo());
        System.out.println("promedio del carrito: "+ carrito.promedio());

        ArrayList<Articulo> acuaticos = carrito.listaAcuaticos();
        for (Articulo p: acuaticos) {
            System.out.println("mi codigo es: "+ p.getCodigo());
        }
        ArrayList<Articulo> electricos = carrito.listaElectricos();

        for (Articulo p : electricos) {
            System.out.println("mi codigo es: "+ p.getCodigo() );
        }














    }
}
