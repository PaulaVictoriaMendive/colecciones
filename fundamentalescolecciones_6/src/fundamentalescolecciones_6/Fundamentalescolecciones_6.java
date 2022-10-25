package fundamentalescolecciones_6;

import java.util.Scanner;
import servicio.metodos;

public class Fundamentalescolecciones_6 {
public static void main(String[] args) {
       metodos tienda=new metodos();
       
       Scanner leer= new Scanner(System.in);
       System.out.println("A continuacion se desplegara un menu para la eleccion de su accion:");
        String opcion = "";
        do {
            System.out.println("");
            System.out.println("Si desea Agregar un producto presione la letra A \n"
                    + "Si desea Ver los productos introducidos hasta el momento presione la letra V \n"
                    + "Si desea Modificar el precio de algun producto particular presione la letra M \n"
                    + "Si desea Eliminar algun producto en particular presione la letra E \n"
                    + "Si desea Salir del menu presione S.");
            opcion = leer.next().toUpperCase();
            System.out.println("");
            switch (opcion) {
                case "A":
                    tienda.CreaElemento();
                    break;
                case "V":
                    tienda.MuestraProducto();
                    break;
                case "M":
                    tienda.ModificaPrecio();
                    break;
                case "E":
                    tienda.EliminaProducto();
                    break;
            }
        } while (!opcion.equals("S"));
    }
    
}
