/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ULLOA
 */
public class Seccion extends Clase implements java.io.Serializable{
    String aula;
    String hora;
  
    public Seccion(String codigo,String nombre,double precio,String aula,String hora) {
        super(codigo,nombre,precio);
         this.aula=aula;
        this.hora=hora;

    }
    
    public String getAula(){
        return this.aula;
    }
    public String getHora(){
        return this.hora;
    }
    public void setANombre(String nombre){
        this.nombre=nombre;
       } 
    public void setAula(String aula){
        this.aula=aula;
        
   
    } 
     public void setHora(String hora){
        this.hora=hora;
    }
     
   
    @Override

    public String getAtributos(){
        return super.getAtributos()+
                "\naula:" +getAula()+
                "\nhora:"+getHora();
    }
            
    
}
