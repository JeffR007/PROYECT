/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ULLOA
 */
public class Personas implements java.io.Serializable {
   String num_cuenta; 
   String nombre;
   String direccion;
   int telefono;
   boolean sexo;
   
   public Personas(String num_cuenta,String nom,String direc,int tel,boolean sexo){
       this.num_cuenta=num_cuenta;
       this.nombre=nom;
        this.direccion=direc;
        this.telefono=tel;
        this.sexo=sexo;
}
    public String getNum_cuenta(){
        return this.num_cuenta;   
    }
    public String getNombre(){
        return this.nombre;   
    }
    public String getDireccion(){
        return this.direccion;   
    }
    public int getTelefono(){
        return this.telefono;    
    }
    
    public boolean getSexo(){
        return this.sexo;      
    }
    public String getAtributos(){
        String sex= (getSexo()==true)?"Mujer":"Hombre";
        return 
                "\n num_cuenta:"+getNum_cuenta()+
                "\nnombre   :"  + 
                getNombre()+
                "\ndireccion:" + getDireccion()+
                "\ntelefono:"   + getTelefono()+
                "\nsexo:"         + sex;
                      
}
}




