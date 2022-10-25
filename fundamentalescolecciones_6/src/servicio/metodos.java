package servicio;

import entidad.atributos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class metodos {

    Scanner leer = new Scanner(System.in);
    HashMap<String, Double> apptienda = new HashMap();

    public void CreaElemento() {
        String Producto;
        Double Precio;
        System.out.println("ingrese un producto");
        Producto = leer.next();
        System.out.println("ingrese su precio");
        Precio = leer.nextDouble();
        atributos productos = new atributos();
        productos.setProducto(Producto);
        productos.setPrecio(Precio);
        apptienda.put(Producto, Precio);
    }

    public void MuestraProducto() {
        for (Map.Entry<String, Double> entry : apptienda.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("los productos son:" + key + "y precios son: " + value);
        }
    }

    public void ModificaPrecio() {
        String PrecioModificado;
        Double nuevoPrecio;
        System.out.println("a que producto desea modificarle el precio");
        PrecioModificado = leer.next();
        for (Map.Entry<String, Double> entry : apptienda.entrySet()) {
            String Producto = entry.getKey();
            // Double value = entry.getValue();
            if (PrecioModificado.equalsIgnoreCase(Producto)) {
                System.out.println("ingrese un nuevo precio");
                nuevoPrecio = leer.nextDouble();
                apptienda.replace(Producto, nuevoPrecio);
            }
        }
    }

    public void EliminaProducto() {
        String productoEliminado;
        System.out.println("que producto desea eliminar?");
        productoEliminado = leer.next();
        for (Map.Entry<String, Double> entry : apptienda.entrySet()) {
            String Producto = entry.getKey();
            //Double value = entry.getValue();
            if (productoEliminado.equalsIgnoreCase(Producto)) {
                apptienda.remove(Producto);
            }
        }
    }
    }
