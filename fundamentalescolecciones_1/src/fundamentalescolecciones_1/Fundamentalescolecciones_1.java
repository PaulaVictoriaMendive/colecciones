package fundamentalescolecciones_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Fundamentalescolecciones_1 {
public static void main(String[] args) {
ArrayList<String> razaPerro = new ArrayList();
Scanner leer=new Scanner(System.in);
  String raza;
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
} 
}
