package Servicio;

import entidad.atributos;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class metodos {
       Scanner leer=new Scanner(System.in);
       HashSet<atributos> paises = new HashSet();
       ArrayList<atributos>pais=new ArrayList(paises);
public void CreaPais(){
    String lecturapais;
    String opciones;
    do {        
    System.out.println("ingrese un pais a eleccion");
    lecturapais=leer.next();
    System.out.println("desea agregar mas paises? s=si,n=no");
    opciones=leer.next();
    
    paises.add(new atributos(lecturapais));
     } while (!opciones.equalsIgnoreCase("n"));
    }
  public void MuestraPais(){
      for (atributos paise : paises) {
          System.out.println(paise);
          
      }
    }
  public void ordenaPais(){
      pais.sort(atributos.Comparapais);
      
}
  public void PidoyElimino(){
      String Lugares;
      System.out.println("ingrese un pais de la lista que qiera eliminar");
      Lugares=leer.next();
      Iterator<atributos> it=paises.iterator();
      while (it.hasNext()) {
            if (it.next().getPaises().equals(Lugares)) { // Si se cumple la condicion de encontrar "Ese pais elegido,lo elimina)
                it.remove();
            }

        }
        System.out.println("El pais no se encontro");

    }
}

   
      