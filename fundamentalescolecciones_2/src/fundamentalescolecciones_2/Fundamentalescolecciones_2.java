package fundamentalescolecciones_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fundamentalescolecciones_2 {
public static void main(String[] args) {
      ArrayList<String> razaPerro = new ArrayList();
Scanner leer=new Scanner(System.in);
  String raza;
  String RazaABuscarEliminar;
    do {
            System.out.println("Ingresa una Raza de Perro 0 = Salir");
            raza = leer.nextLine();
            if (!raza.equals("0")) {
                razaPerro.add(raza);
            }
        } while (!raza.equals("0"));
       System.out.println("Las razas cargadas son: ");
        for (String aux : razaPerro) {
            System.out.println(aux);  
}
System.out.println("Ingrese la raza a Buscar y Eliminar..");
        RazaABuscarEliminar = leer.nextLine();
        System.out.println("Busqueda y Eliminacion por Iterato ");
        
        boolean estaba = false;
        Iterator<String> iterador = razaPerro.iterator();
        while (iterador.hasNext()) {
            String next = iterador.next();
            if (next.equals(RazaABuscarEliminar)) {
                iterador.remove();
                estaba = true;
            }
        }
        if (estaba) {
            System.out.println("La raza que ingresó estaba y se eliminó....");
        }else{
            System.out.println("La raza que ingresó NO estaba....");
        }
        System.out.println("Se mostrará el ArrayList...");
        for (String aux : razaPerro) {
            System.out.println(aux);
        }  
    }     
    }