import java.util.Calendar;
 public class Matricula {
     String cod_matricula;
     String fecha;
     Alumnos a;
     Maestro m;
     Clase c1;
     Clase c2;
    int cantidad;
     double precio;
     
    public static final double IMPUESTO=0.15;     
      

    public Matricula(String cod_matricula,Alumnos a,Maestro m,
            Clase c1,int cantidad, double precio){
      
        this.cod_matricula=cod_matricula;
         this.a=a;
         this.m=m;
         this.c1=c1;
         this.cantidad=cantidad;
         this.precio= precio;
         
    }
          public double totalpagar(){
          return  getPrecio() *getCantidad();
       
          }
        public static String fecha(){
             int dia,mes,año;
             dia=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
             mes=Calendar.getInstance().get(Calendar.MONTH)+1;
             año=Calendar.getInstance().get(Calendar.YEAR);
             
             return dia + "/" + mes + "/" + año;
         
         }
    
          public String getCod_matricula(){
             return this.cod_matricula;
         }
          
          public String getFecha(){
              return this.fecha;
          }
             
             
     
        public Alumnos getAlumnos(){
            return this.a;
        } 
        public Maestro getMaestro(){
            return this.m;
        }
         public Clase getClase(){
             return this.c1; 
         }
         public Clase getClase2(){
             return this.c2;
         }
         public int getCantidad(){
             return this.cantidad;
         }
         
         public double getPrecio(){
             return this.precio;
         }
         
         public Matricula(String cod_matricula, Alumnos a, Maestro m,
                 Clase c1,Clase c2,int cantidad, double precio ){
         this.cod_matricula=cod_matricula;
         
         this.a=a;
         this.m=m;
         this.c1=c1;
         this.c2=c2;
         this.cantidad=cantidad;
         this.precio=precio;
             
             
             
         }
        

         public String getAtributos(){
             return 
                    
                     "\nCodigo:" + getCod_matricula() +
                     "\nfecha:"+ fecha()+
                     "\nAlumno :"+getAlumnos().getAtributos()+
                     "\nMaestro:"+getMaestro().getAtributos()+
                     "\nclase:" +getClase().getAtributos()+
                     "\nNo. Clases:"+getCantidad() + 
                     "\nPrecio: " + getPrecio() +
                     "\nTotal a pagar: " + totalpagar();   
                        
          }                     
                             
      
 
       
           }
                 
     
     
       
                  
        
     
      


