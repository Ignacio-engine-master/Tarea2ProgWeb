package Tarea2.src;
public class Auto {
    
    public static final String ACURA = "Acura";
    public static final String NISSAN = "Nissan";
    public static final String SUBARU = "Subaru";
    public static final String TOYOTA = "Toyota";
    public static final String CHEVROLET = "Chevrolet";

    private String marca;
    private Persona persona;
    private String matricula;
 
    //constructor 
    public Auto(String marca, Persona persona, String matricula) {
        this.marca = marca;
        this.persona = persona;
        this.matricula = matricula;
    }

    // getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPropietario(Persona persona) {
        this.persona = persona;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}