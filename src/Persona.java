package Tarea2.src;
public class Persona {

    private String nombre;
    private int cuenta;

    // contructor
    public Persona(String nombre) {
        this.nombre = nombre;
        this.cuenta = 0;
    }

    //getters and setters

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getCuenta() {
        return cuenta;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        return "Nombre: " + nombre;
    }
    
}
