

import java.util.ArrayList;
import java.util.List;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SistemaMatricula {
    
public String numero_matricula;
public String nombre;
public String correoElectronico;

public List<Alumnos> alumnos;
public List<Maestro>maestro;
public List<Seccion>seccion;
public List<Clase>clase;
public List<Matricula>matricula;
        
public int totalAlumnos;
public Alumnos[]Alumnos;

public int totalMaestros;
public Maestro[]Maestros;

public int totalClase;
public Clase[]Clase;

public int totalMatricula;
public Matricula[]Matricula;

public int totalSecciones;
public Seccion[]Seccion;

public int totalPersonas;
public Personas[]Personas;

public SistemaMatricula(String numero_matricula,String nombre,String correoElectronico){
   
    this.numero_matricula=numero_matricula;
    this.nombre=nombre;
    this.correoElectronico=correoElectronico;
    this.totalAlumnos=0;
    this.Alumnos=new Alumnos[50];
    this.totalMaestros=0;
    this.Maestros=new Maestro[50];
    this.totalClase=0;
    this.Clase = new Clase[50];
    this.totalMatricula=0;
    this.Matricula=new Matricula[50];
    this.totalPersonas=0;
    this.Personas=new Personas[50];
    this.totalSecciones=0;
    this.Seccion=new Seccion[50];
    
    this.alumnos=new ArrayList<Alumnos>();
    this.maestro=new ArrayList<Maestro>();
    this.seccion=new ArrayList<Seccion>();
    this.clase=new ArrayList<Clase>();
    this.matricula=new ArrayList<Matricula>();
    
}

public String getNumero_matricula(){
    return this.numero_matricula;
    

}
public String getNombre(){
    return this.nombre;
}
public String getCorreoElectronico(){
    return this.correoElectronico;
}

public String getAtributos(){
    return 
     "\nnumero de matricula: " + getNumero_matricula()+
     "\nnombre del sistema: " + getNombre() +
      "\ncorreoElectronico" + getCorreoElectronico();     
            
}
        
Scanner Alum=new Scanner(System.in);
public void agregarAlumnos(){
    String num_cuenta; 
    String nombre;
    String direccion;
    int telefono;
    int sexo;
    int Alumnos_elite;
            
   
    System.out.println("\ningrese el numero de cuenta del alumno: ");
    num_cuenta=Alum.next();
    
    System.out.println("\nIngrese el nombre del alumno: ");
    nombre=Alum.next();
    
    System.out.println("\nIngrese la direccion del alumno: ");
    direccion=Alum.next();
    
    System.out.println("\nIngrese el telefono del alumno");
    telefono = Alum.nextInt();
    
    System.out.println("\nElija el sexo: \n 1 Masculino  \n 2 Femenino ");
    sexo = Alum.nextInt();
    boolean se=(sexo==1)?false:true;
    
    System.out.println("\nElija el tipomde alumnos: \n 1:. Elite  \n  2:. Normal");
    Alumnos_elite=Alum.nextInt();
    boolean elite=(Alumnos_elite==1)?true:false;
    
    Alumnos a = new Alumnos(num_cuenta,nombre,direccion,telefono,se,elite);
    registrarAlumnos(a);
    ficheroAlumnos();
  
}
//arreglos redimencionales 

public void registrarAlumnos(Alumnos alumnos){
    this.alumnos.add(alumnos);
}

public void registrarAlumno(Alumnos a){
     System.out.println("");
    this.Alumnos[this.totalAlumnos]=a;
    this.totalAlumnos++;
}


public void imprimirAlumnos(){
    System.out.println("datos del alumno");
    for(int i=0; i< this.totalAlumnos;i++)
    System.out.println(Alumnos[i].getAtributos());
    ficheroAlumnos();
}



public Alumnos buscarAlumnos(String num_cuenta){
    for(Alumnos a:alumnos){
        if(a.getNum_cuenta().equals(num_cuenta)){
            return a;
        }
    }
    return null;
}
public  void  eliminarAlumnos(){
   Alumnos a;
   
    String num_cuenta;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("numero de cuenta del alumno que desea eliminar");
    num_cuenta=scan.nextLine();
    
    a=buscarAlumnos(num_cuenta);
    alumnos.remove(a);
    
}
public void modificarAlumnos(){
   Scanner scan =new Scanner (System.in);
   
   System.out.println("ingrese el numero de cuenta del alumno");
   String num_cuenta=scan.next();
   
   Alumnos alum=buscarAlumnos(num_cuenta);
   int me=0;
   System.out.println("elija el dato que desea modificar: \n 1. Modificar Nombre \n 2.Modificar Direccion  \n 3.Modificar Telefono");
   me=scan.nextInt();
   switch(me){
       case 1:{String nombr;
           System.out.println("ingrese el nuevo nombre: ");
               nombr=scan.next();
               alum.setNombre(nombr);
               ficheroAlumnos();
                break;
        }
       case 2:{String dire;
            System.out.println("Ingrese la nueva direccion: ");
            dire=scan.next();
            alum.setDireccion(dire);
            ficheroAlumnos();
                break;
       }
       
       case 3:{int tel;
           System.out.println("ingrese el nuevo telefono: ");
           tel=scan.nextInt();
           alum.setTelefono(tel);
           ficheroAlumnos();
           
       }
       
       
       }
}

Scanner maes = new Scanner (System.in);

public void agregarMaestro(){

   String num_cuenta; 
   String nombre;
   String direccion;
   int telefono;
   int sexo;
   int titulo;

    System.out.println("\ningrese el numero de cuenta del maestro: ");
    num_cuenta=maes.next();
    
    System.out.println("\nIngrese el nombre del maestro: ");
    nombre=maes.next();
    
    System.out.println("\nIngrese la direccion del maestro: ");
    direccion=maes.next();
    
    System.out.println("\nIngrese el telefono del maestro");
    telefono = maes.nextInt();
    
    System.out.println("\nElija el : \n 1 Masculino  \n 2 Femenino ");
    sexo = maes.nextInt();
    boolean s=(sexo==1)?false:true;
    
    System.out.println("\ntitulo del maestro: \n 1 Grado  \n 2 Posgrado");
    titulo=maes.nextInt();
    boolean titul=(titulo==1)?true:false;
    
       
   Maestro m = new Maestro(num_cuenta,nombre,direccion,telefono,s,titul);
   registrarMaestro(m);
   ficheroMaestros();
       
 }   
public void registrarMaestro(Maestro maestro){
   this.maestro.add(maestro);
   
}
public void imprimirMaestros(){
    leerMaestro();
    for(Maestro m:this.maestro){
        System.out.println(maestro.get(totalMaestros).getAtributos());
    }
}
public Maestro buscarMaestros(String num_cuenta){
    for(Maestro m:maestro){
        if(m.getNum_cuenta().equals(num_cuenta)){
            return m;
        }
    }
    return null;
}

public void modificarMaestros(){
   Scanner scan =new Scanner (System.in);
   
   System.out.println("ingrese el numero de cuenta del Maestro");
   String num_cuenta=scan.next();
   
   Maestro maest=buscarMaestros(num_cuenta);
   int me=0;
   System.out.println("elija el dato que desea modificar: \n 1. Modificar Nombre \n 2.Modificar Direccion  \n 3.Modificar Telefono");
   me=scan.nextInt();
   switch(me){
       case 1:{String nombr;
           System.out.println("ingrese el nuevo nombre: ");
               nombr=scan.next();
               maest.setNombre(nombr);
               ficheroMaestros();
                break;
        }
       case 2:{String dire;
            System.out.println("Ingrese la nueva direccion: ");
            dire=scan.next();
            maest.setDireccion(dire);
            ficheroMaestros();
                break;
       }
       
       case 3:{int tel;
           System.out.println("ingrese el nuevo telefono: ");
           tel=scan.nextInt();
           maest.setTelefono(tel);
           ficheroMaestros();
           
       }
       
       
       }
}


Scanner sec  = new Scanner (System.in);

public void agregarSeccion(){
    String codigo;
    String nombre;
    double precio;
    String aula;
    String hora;
    
  

    System.out.println("\ningrese el codigo de la clase: ");
    codigo=sec.next();
    
    System.out.println("\nIngrese el nombre de la clase: ");
    nombre=sec.next();
   
   
    
    System.out.println("\ningrese el precio de las clase: ");
    precio=sec.nextDouble();
    
    System.out.println("\ningrese el aula de la clase:");
    aula=sec.next();
    
    System.out.println("\ningrese la hora de la clase");
    hora=sec.next();
    
    Seccion sec =new Seccion(codigo,nombre,precio,aula,hora);
      registrarSeccion(sec);
      ficheroSeccion();
   
 }   
public void registrarSeccion(Seccion seccion){
    this.seccion.add(seccion);
}
public void imprimirSeccion(){
    leerSeccion();
    for(Seccion s:this.seccion){
        System.out.println(seccion.get(totalSecciones).getAtributos());
    }
}
public Seccion buscarSeccion(String codigo){
    for(Seccion s:seccion){
        if(s.getCodigo().equals(codigo)){
            return s;
        }
    }
    return null;
}
public void modificarSeccion(){
   Scanner scan =new Scanner (System.in);
   
   System.out.println("ingrese el codigo de la clase");
   String codigo=scan.next();
   
   Seccion sec=buscarSeccion(codigo);
   int me=0;
   System.out.println("elija el dato que desea modificar: \n 1. Modificar Nombre \n 2.Modificar Aula  \n 3.Modificar Hora");
   me=scan.nextInt();
   switch(me){
       case 1:{String nombr;
           System.out.println("ingrese el nuevo nombre: ");
               nombr=scan.next();
               sec.setANombre(nombr);
               ficheroSeccion();
                break;
        }
       case 2:{String dire;
            System.out.println("Ingrese la nueva Aula: ");
            dire=scan.next();
            sec.setAula(dire);
            ficheroSeccion();
                break;
       }
       
       case 3:{String hor;
           System.out.println("ingrese la nueva Hora: ");
           hor=scan.next();
           sec.setHora(hor);
           ficheroSeccion();
           
       }
       
       
       }
}



Scanner per = new Scanner (System.in);

public void agregarPersonas(){
 String num_cuenta; 
   String nombre;
   String direccion;
   int telefono;
  int sexo;

    System.out.println("\ningrese el numero de cuenta de la persona: ");
    num_cuenta=per.next();
    
    System.out.println("\nIngrese el nombre de la persona: ");
    nombre=per.next();
   
     System.out.println("\nIngrese la direccion de la persona: ");
    direccion=per.next();
    
    System.out.println("\nIngrese el telefono d ela persona: ");
   telefono=per.nextInt();
    
    System.out.println("\nElija el sexo: \n 1 Masculino  \n 2 Femenino ");
    sexo = per.nextInt();
    boolean see=(sexo==1)?false:true;
    
    
       
 Personas p= new Personas( num_cuenta ,nombre,direccion,telefono,see);
     
 
       
 }   
public void registrarPersonas(Personas p){
    this.Personas[this.totalPersonas]=p;
    this.totalClase++;
}
public void imprimirPersonas(){
    System.out.println("");
    for(int i=0; i< this.totalPersonas;i++)
    System.out.println(Personas[i].getAtributos());
}

public Alumnos getAlumnos(String num_cuenta){
  
   for(int i=0; i<this.totalAlumnos;i++)
       
     if(this.Alumnos[i].getNum_cuenta().equals(num_cuenta))
         return  this.Alumnos[i];
    return null ;
}

public Maestro getMaestro(String num_cuenta){
    for(int i=0; i<this.totalMaestros;i++)
        if(this.Maestros[i].getNum_cuenta().equals(num_cuenta))
            return this.Maestros[i];
               return null;
}
public Clase getClase(String codigo){
    for(int i=0; i<this.totalClase;i++)
        if(this.Clase[i].getCodigo().equals(codigo))
            return this.Clase[i];
    return null;
}

public Seccion getSeccion(String aula){
    for(int i=0; i<this.totalSecciones;i++)
        if(this.Seccion[i].getAula().equals(aula))
            return this.Seccion[i];
    return null;
}

public void Matricula(String cod_matricula,String Fecha,String num_cuenta,String codigo,String aula,int cantidad,double precio){
    Alumnos Alu=getAlumnos(num_cuenta);
    Maestro Maes=getMaestro(num_cuenta);
    Clase clas=getClase(codigo);
    Seccion secc=getSeccion(aula); 
}

//public void AgregarMatricula (String codigo, String num_cuenta)


public void menu(){
    int opcion=0;
    Scanner me=new Scanner(System.in);
     do{
    System.out.println("Elija una opcion: \n 1.Alumnos \n 2.Maestros \n 3.Clase \n 4.Matricula,\n 5. Salir del sistema");
   
    opcion=me.nextInt();
           
    switch(opcion){
         
        case 1:{int opMat=0;
       
      System.out.println("Elija una opcion: \n 1.Agregar Alumnos \n 2. Mostrar Alumnos \n 3.MOdificar Alumnos "
              + "\n 4.Eliminar Alumnos");
            opMat=me.nextInt();
            switch(opMat){
                case 1: agregarAlumnos();
                break;
                
                case 2: imprimirAlumnos();
                break;
                
                case 3:modificarAlumnos();
                break;
                
                case 4:eliminarAlumnos();
                    break;
                
            }
              
        
        }
        case 2:{int opMat=0;
        System.out.println("Elija una opcion: \n 1.Agregar Maestro \n 2.Mostrar Maestros \n 3.Modificar Maestro"
              + "\n 4.Buscar Maestros");
        opMat=me.nextInt();
        
         switch(opMat){
                case 1: agregarMaestro();
                break;
                
                case 2: imprimirMaestros();
                break;
                
                case 3:
                    break;
                    
        }
        }
        
        case 3:{int opMat=0;
         System.out.println("Elija una opcion: \n 1.Agregar Clase \n 2.Mostrar Clase \n 3.modificar Clase"
              + "\n 4.Buscar Clase");
         opMat=me.nextInt();
         
          switch(opMat){
                case 1: agregarSeccion();
                break;
                
                case 2: imprimirSeccion();
                break;
                
                case 3:modificarSeccion();
                    break;
                    
         }
        
        }
         case 4:{int opMat=0;
          System.out.println("Elija una opcion: \n 1.Agregar una Matricula \n 2.Mostrar matricula \n 3.modificar matricula \n 4.Borar matricula"
              + "\n 4.Buscar Clase");
         opMat=me.nextInt();
         
          switch(opMat){
                case 1: 
                break;
                
                case 2: 
                break;
         
         }
    }
          case 5:{int opMat=0;
          System.out.println("Elija una opcion: \n 1. Si desea salir del sistema precione 0");
         opMat=me.nextInt();
         
          switch(opcion=0){
                case 1: 
                break;
                
                
         
         }
    }
}

}while(opcion!=0);

public void ficheroAlumnos(){
   String sistemaMatricula= "Alumnos.dat";
   
   try{
       FileOutputStream ficheroSalida= new FileOutputStream(sistemaMatricula);
       ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
       
      // objetoSalida.writeObject(new Alumnos("1234","maynor","la paz",9876,false,true));
       //objetoSalida.writeObject(new Alumnos("5678","Rush","Miami",3,true,false));
        
               objetoSalida.writeObject(alumnos);
            
        
       objetoSalida.close();
   }
   catch(FileNotFoundException e){
       System.out.println("El fichero no existe");
          
   }catch(IOException e){
       
        System.out.println(e.getMessage());
   }catch (Exception e){
       
        System.out.println(e.getMessage());
   };
   
   
   
   
   }

   public void leerAlumnos(){
       try{
    FileInputStream ficheroEntrada= new FileInputStream("Alumnos.dat");
    ObjectInputStream objetoEntrada =new ObjectInputStream(ficheroEntrada);
    
  alumnos =(ArrayList<Alumnos>)objetoEntrada.readObject();
          
    //Alumnos a2=(Alumnos)objetoEntrada.readObject();
    
    objetoEntrada.close();
    
    //System.out.println(a1.getAtributos());
   // System.out.println(a2.getAtributos());
    
   
}catch(FileNotFoundException e){
    System.out.println("El archivo no existe");
}catch(IOException e){
    System.out.println(e.getMessage());
}catch(Exception e){
    System.out.println(e.getMessage());
};
   
   
}
   public void ficheroMaestros(){
       String sistemaMatricula="Maestros.dat";
       
       try{
           FileOutputStream ficheroSalida = new FileOutputStream(sistemaMatricula);
           ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
           
          // objetoSalida.writeObject(new Maestro("123","juan","comayagua",99876,true,false) 
           objetoSalida.writeObject(maestro);
          
           objetoSalida.close();
       }
       catch(FileNotFoundException e){
       System.out.println("El fichero no existe");
          
   }catch(IOException e){
       
        System.out.println(e.getMessage());
   }catch (Exception e){
       
        System.out.println(e.getMessage());
   }
   }
    public void leerMaestro(){
       try{
    FileInputStream ficheroEntrada= new FileInputStream("Maestros.dat");
    ObjectInputStream objetoEntrada =new ObjectInputStream(ficheroEntrada);
    
    maestro=(ArrayList<Maestro>)objetoEntrada.readObject();
    
    objetoEntrada.close();
    
    //System.out.println(m1.getAtributos());
   
    
   
}catch(FileNotFoundException e){
    System.out.println("El archivo no existe");
}catch(IOException e){
    System.out.println(e.getMessage());
}catch(Exception e){
    System.out.println(e.getMessage());
};
   
   
}
    public void ficheroSeccion(){
       String sistemaMatricula="Seccion.dat";
       
       try{
           FileOutputStream ficheroSalida = new FileOutputStream(sistemaMatricula);
           ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
           
           //objetoSalida.writeObject(new Seccion("123","juan",500,"A3","5:00 a 7:00"));
           
     
               objetoSalida.writeObject(seccion);
               
           
           
           objetoSalida.close();
       }
       catch(FileNotFoundException e){
       System.out.println("El fichero no existe");
          
   }catch(IOException e){
       
        System.out.println(e.getMessage());
   }catch (Exception e){
       
        System.out.println(e.getMessage());
   }
   }
    public void leerSeccion(){
       try{
    FileInputStream ficheroEntrada= new FileInputStream("Seccion.dat");
    ObjectInputStream objetoEntrada =new ObjectInputStream(ficheroEntrada);
    
   //Seccion s1= (Seccion)objetoEntrada.readObject();
   seccion=(ArrayList<Seccion>)objetoEntrada.readObject();
    
    objetoEntrada.close();
    
    //System.out.println(s1.getAtributos());
   
    
   
}catch(FileNotFoundException e){
    System.out.println("El archivo no existe");
}catch(IOException e){
    System.out.println(e.getMessage());
}catch(Exception e){
    System.out.println(e.getMessage());
};
   
   
}
   
   
   
    }



