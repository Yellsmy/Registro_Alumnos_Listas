
package manejadordatos;

public class Persona {
    private String nombres,apellidos,email;
    private int carne;
        
    public Persona(String Nombres, String Apellidos, int Carne, String Email){
        this.nombres = Nombres;
        this.apellidos = Apellidos;
        this.carne = Carne;
        this.email = Email;     
    }
    
    public void setNombre(String nombres){
        this.nombres = nombres;
    }
    
    public String getNombres(){
        return nombres;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setCarne(int carne){
        this.carne = carne;
    }
    
    public int getCarne(){
        return carne;
    }
    
    public void setEmail(String email){
        this.email= email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String impresionDatos(){
        return "Nombres:"+getNombres()+"\nApellidos: "+ getApellidos()+"\nCarné: "+ getCarne()+ "\nE-mail: "+ getEmail();
    }
}
