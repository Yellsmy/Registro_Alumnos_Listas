
package manejadordatos;


public class Lista {
    protected Nodo inicio, fin;
    public Lista(){
        inicio = null;
        fin = null;       
    }
    
    public void agregar(Persona dato){
        inicio = new Nodo(dato, inicio);  //El puntero apuntara al nuevo elemento que se agrega y agregará un nuevo espacio vacío/null
        if(fin==null){
            fin = inicio; //El puntero se posicionará en el último dato ingresado
        }       
    }
    
    public void imprimirDato(){
        Nodo temp = inicio;
        if(!vacia()){
            while(temp!= null){
                System.out.println(temp.dato.impresionDatos());
                temp = temp.siguiente;
            }
        }
        else{
            System.out.println("No hay datos para mostrar");
        }
    }
    
    public void buscar(int carne){
        boolean acceso = false;
        Nodo temp = inicio;
        if(!vacia()){
            while(temp!= null){
                if(carne == temp.dato.getCarne()){
                    System.out.println("Los datos econtrados son los siguientes: " + "\n"+temp.dato.impresionDatos());
                    acceso = true;
                    break;
                }
                temp = temp.siguiente;
            }
            if (!acceso){
                System.out.println("Lo sentimos, el dato que deseas encontrar no existe en nuestra base de datos");
                System.out.println(":'(");
            }
        }else{
            System.out.println("Lo sentimos, la lista está vacia");
        }
    }
    
    public boolean vacia(){
        if(this.inicio == null){
            return true;
        }
        return false;
    }
    
    public void eliminarDato(int carne){
        if(!vacia()){          
            boolean acceso = false;
            Nodo temp = this.inicio.siguiente;    //Puntero temporal que apunte al siguiente nodo de inicio
            Nodo anterior = this.inicio;          //Nuevo puntero que apunte al primer nodo
            
            while(temp!= null){                        //Mientras el puntero en su posición siguiente no sea null entonces que ejecute el código adentro
                if(temp.dato.getCarne() == carne){                  //Cuando encuentre el dato que se desea eliminar: 
                    anterior.siguiente=temp.siguiente;           //que anterior en su posición siguiente sea igual a temporal en su posición siguiente y se enlace con el número siguinte
                    System.out.println("El Alumno eliminado es: " + "\n"+temp.dato.impresionDatos());    //al número que se quiere eliminar
                    acceso = true;                   
                    break;  
                }
                else if (carne == this.inicio.dato.getCarne()){      //Si el dato que se quiere eliminar es el primero de la lista, que el puntero inicio sea el siguiente nodo     
                    System.out.println("El dato Alumno eliminado es: " +"\n"+ inicio.dato.impresionDatos());
                    this.inicio = this.inicio.siguiente;                   
                    acceso = true;
                    break;
                }
                else if(carne == temp.dato.getCarne() && temp == fin){     //Si el dato que se eliminará es el último de la lista entonces que el puntero fin apunte a una posición anterior.
                    System.out.println("El dato eliminado es: " +"\n"+ temp.dato.impresionDatos());
                    fin = anterior;                   
                    acceso = true;
                    break;
                }                
                temp = temp.siguiente;
                anterior = anterior.siguiente;
            }

            if( carne == this.inicio.dato.getCarne() && this.inicio == this.fin){ // Si el dato que se quiere eliminar coincide con el único dato de la lista,
                System.out.println("Se borró");
                System.out.println("El dato eliminado es: " +"\n"+ inicio.dato.impresionDatos());
                this.inicio = this.fin= null;                                //que inicio y fin sea null para eliminar el único dato de la lista
                
                acceso = true;
            }
            if (!acceso){
                System.out.println("Lo sentimos, el dato que deseas eliminar no existe en nuestra base de datos");
                System.out.println(":'(");
            } 
        }
        else{
            System.out.println("Lo sentimos, La lista está vacia");
        }
    }
}
