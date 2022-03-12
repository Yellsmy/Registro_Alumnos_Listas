
package manejadordatos;

import java.util.Scanner;
public class ManejadorDatos {
Scanner op = new Scanner(System.in);
    Lista lista = new Lista();
    
    public void menu(){
        boolean salir = false;
        int opcion;
        
        while(!salir){
           System.out.println("------BIENVENIDO AL REGISTRO DE ALUMNOS-----"); 
           System.out.println("1. Agregar Alumno al inicio");
           System.out.println("2. Eliminar Alumno");
           System.out.println("3. Buscar Alumno");
           System.out.println("4. Mostrar Alumnos registrados");
           System.out.println("5. Salir");
           System.out.println("Selecciona la opción");
           opcion = op.nextInt();
           op.nextLine();
           switch(opcion){
            case 1:
                agregar();
                break;
            case 2:
                System.out.println("Ingrese Dato a Eliminar: ");
                lista.eliminarDato(op.nextInt());
                break;
            case 3:
                System.out.println("Ingrese un número a buscar: ");
                lista.buscar(op.nextInt());              
                break;
            case 4:
                lista.imprimirDato();
                break;
            case 5:
                salir = true;
                System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO ");
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    
    public void agregar(){
        String Nombres,Apellidos,Email;
        int Carne;
        System.out.println("Ingrese sus nombres: ");
        Nombres = op.nextLine();
        System.out.println("Ingrese sus apellidos: ");
        Apellidos = op.nextLine();
        System.out.println("Ingrese su Número de Carné: ");
        Carne = op.nextInt();
        op.nextLine();
        System.out.println("Ingrese su E-mail: ");
        Email = op.nextLine();
        lista.agregar(new Persona(Nombres,Apellidos,Carne,Email));
        //lista.agregar;
    }
    
    public void agregarFinal(){
        int numero;
        System.out.println("Ingrese número: ");
        numero = op.nextInt();
    }
       
    public static void main(String[] args) {
        // TODO code application logic here
        ManejadorDatos objeto = new ManejadorDatos();
        objeto.menu();
    }
    
}
