
public class Maestro extends Personas  implements java.io.Serializable {
boolean titulo;


    
    public Maestro(String num_cuenta, String nom, String direc, int tel, boolean sexo,boolean titulo) {
        super(num_cuenta, nom, direc, tel, sexo);
        this.titulo=titulo;
    }
    
    public boolean getTitulo(){
        return this.titulo;
    }
     
    public void  setNombre(String nombre){
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
       String titul=(getTitulo()==true)?"Grado":"Posgrado";
       return super.getAtributos()+
               "\ntitulo del maestro:"+titul;
    }   
}
