/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ULLOA
 */
public class Clase implements java.io.Serializable{
    String codigo;
    String nombre;
    double precio;
   
  
    
    
    public Clase( String codigo,String nombre,double precio){
        
       this.codigo=codigo;
        this.nombre=nombre;
        this.precio= precio;
       
    }

   
    

    
    public String getCodigo(){
        return this.codigo;   
    }
    public String getNombre(){
        return this.nombre;    
    }
  
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }

    
  
    
    public String getAtributos(){
       
        return 
                "\nCodigo clase:"  + getCodigo()+
                "\nNombre clase:" + getNombre()+
                 
               
                "\nprecio clases:"+getPrecio();
               
               
                
                
               
}
}