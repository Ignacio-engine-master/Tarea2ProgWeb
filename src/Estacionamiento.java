package Tarea2.src;
import java.util.ArrayList;

class Estacionamiento{
    private static int lugares;
    private static int costoIngreso;
    private static int costoNoche;

    private static ArrayList<Persona> lugaresOcupados = new ArrayList<Persona>();

    public static void inicializar(int lugares, int costoIngreso, int costoNoche){
        Estacionamiento.lugares = lugares;
        Estacionamiento.costoIngreso = costoIngreso;
        Estacionamiento.costoNoche = costoNoche;
        Estacionamiento.lugaresOcupados = new ArrayList<Persona>();
    }

    public static void entra(Auto auto){
        if(Estacionamiento.lugares>0 && Estacionamiento.lugares < 8){
            Estacionamiento.lugares--;
            lugaresOcupados.add(auto.getPersona());
            auto.getPersona().setCuenta(auto.getPersona().getCuenta() + costoIngreso);
            System.out.println("Bienvenido " + auto.getPersona().getNombre() + " a nuestro estacionamiento. Su cuenta es: " + auto.getPersona().getCuenta());
        }else{
            System.out.println("Esta lleno lo sentimos" + auto.getPersona().getNombre());
        }

    }

    public static void sale(Auto auto) {
        Estacionamiento.lugares++;
        lugaresOcupados.remove(auto.getPersona());
        System.out.println("Sale " + auto.getMatricula());
        
    }

    public static void nuevoDia() {
    }

    public static void calcular() {
    }
}
