
package manejadordatos;


public class Nodo {
    public Persona dato;
    public Nodo siguiente; 
    
    public Nodo(Persona dato){
        this.dato= dato;
    }
    
    public Nodo(Persona dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
     
}
