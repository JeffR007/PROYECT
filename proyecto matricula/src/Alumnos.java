/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ULLOA
 */
public class Alumnos extends Personas implements java.io.Serializable{
    boolean Alumnos_elite;
    
   
            
   
    public Alumnos(String num_cuenta, String nom, String direc, int tel, boolean sexo ,boolean Alumnos_elite) {
        super(num_cuenta, nom, direc, tel, sexo);
        this.Alumnos_elite=Alumnos_elite;
    }
    
            
            
    public boolean getAlumnos_elite(){
        return this.Alumnos_elite;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    } 
     public void setDireccion(String direccion){
        this.direccion=direccion;
    }
      public void setTelefono(int telefono){
        this.telefono=telefono;
         }
    @Override
    
    public String getAtributos(){
         String Alum_elite=(getAlumnos_elite()==true)?"Elite":"normales";
    

        return super.getAtributos()+
                
                "\nAlumno:" + Alum_elite;
    }

    void remove(Alumnos alumnos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
  
     }
     
      
       
       
       
       
       
        // TODO code application logic here
    
    
       
        // TODO code application logic here
    

    