
package EntidadPelicula;

import java.util.Comparator;

public class Pelicula {
 private String Titulo;   
 private String Director;
 private Double Duracion;

    public Pelicula() {
    }

    public Pelicula(String Titulo, String Director, Double Duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion =  Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + Titulo + ", Director=" + Director + ", Duracion=" + Duracion + '}';
    }
  public static Comparator<Pelicula> OrdenaTitulo= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula objeto1, Pelicula objeto2){
        return objeto1.getTitulo().compareTo(objeto2.getTitulo());
               
        } 
        public void ordenaTitulo(){
             
        }
      
    };
 public static Comparator<Pelicula> ComparaPeliculas= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula objeto1, Pelicula objeto2){
        return objeto1.getDuracion().compareTo(objeto2.getDuracion());
               
        } 
        
    };
    //de menor a mayor
     public static Comparator<Pelicula> ComparaPeli= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula objeto1, Pelicula objeto2){
        return objeto2.getDuracion().compareTo(objeto1.getDuracion());
               
        } 
        
    };
     public static Comparator<Pelicula> Comparadirector= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula objeto1, Pelicula objeto2){
        return objeto1.getDirector().compareTo(objeto2.getDirector());
               
        } 
        
    };
}
