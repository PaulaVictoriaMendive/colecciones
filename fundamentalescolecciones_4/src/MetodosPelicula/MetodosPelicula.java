
package MetodosPelicula;

import EntidadPelicula.Pelicula;
import java.util.ArrayList;
//import java.util.Comparator;
import java.util.Scanner;

public class MetodosPelicula {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peli= new ArrayList(); 
    Pelicula t = new Pelicula();
   String opciones;
    public void CreaPeli(){
        do{
        System.out.println("ingrese, por favor, el titulo de la pelicula"); 
         t.setTitulo(leer.next());
        System.out.println("ingrese, por favor, el director de la pelicula");
        t.setDirector(leer.next());
        System.out.println("ingrese,en horas, la duracion de la pelicula");
        t.setDuracion(leer.nextDouble());
        System.out.println("desea agregar mas peliculas?s=si, n=no");
        opciones=leer.next();
        peli.add(t);
    }while(opciones.equalsIgnoreCase("s"));
            
        }
    public void MostrarPeli(){
        for (Pelicula pelicula : peli) {
            System.out.println("a continuacion le mostraremos las peliculas"+pelicula);
    }
    }
   
        
    public void MostrarMayor1hs(){
     if(t.getDuracion()>1){
         for (Pelicula pelicula : peli) {
             System.out.println("las peliculas mayores a 1 hs son"+pelicula);
             
         }
      }   
    }
    public void ordenaMayorMenor(){
        peli.sort(Pelicula.ComparaPeliculas);
    }
    public void ordenaMenorMayor(){
        peli.sort(Pelicula.ComparaPeli);  
    }
    public void OrdenarTitulo(){
         peli.sort(Pelicula.OrdenaTitulo);
     }
     public void Ordenardirector(){
         peli.sort(Pelicula.Comparadirector);
    }
}
