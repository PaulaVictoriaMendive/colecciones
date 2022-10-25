package entidad;

import java.util.Comparator;

public class atributos {
 private String Paises;

    public atributos() {
    }

    public atributos(String Paises) {
        this.Paises = Paises;
    }

    public String getPaises() {
        return Paises;
    }

    public void setPaises(String Paises) {
        this.Paises = Paises;
    }

    @Override
    public String toString() {
        return "{" + "Paises=" + Paises + '}';
    }
 public int hashCode() {
       
        return  this.getPaises().hashCode();
    }
public boolean equals(Object  obj) {//Lo creo para definir que parametro utiliza para no repetir datos,en este casso PAIS
        
        
        if (obj == null) 
            return false;
        
        
         atributos other = (atributos) obj;
        if (this.getPaises().equals(other.getPaises())) 
            return true;
        
        return false;
}

 public static Comparator<atributos> Comparapais= new Comparator<atributos>(){
        @Override
        public int compare(atributos objeto1,atributos objeto2){
        return objeto1.getPaises().compareTo(objeto2.getPaises());
               
        } 
        
    };
}

