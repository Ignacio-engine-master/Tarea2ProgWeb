package Tarea2.src;

public class App{
    public static void main(String[] args) {
        
    Estacionamiento.inicializar(2, 60, 180);
    Persona juan = new Persona("Juan");
    
    Auto autoJuan =  new Auto(Auto.TOYOTA, juan, "BCF-235");

    Estacionamiento.entra(autoJuan);

    // se inicializa la cuenta corriente a Juan y se le agrega $60
    Persona ana = new Persona("Ana");
    Auto autoAna = new Auto(Auto.SUBARU, ana, "BRF-535");
    Estacionamiento.entra(autoAna);
    Estacionamiento.sale(autoJuan);
    Estacionamiento.nuevoDia();
    // cierra el estacionamiento y abre el dia siguiente
    Estacionamiento.entra(autoJuan);
    Persona felipe = new Persona("Felipe");
    Auto autoFelipe = new Auto(Auto.CHEVROLET, felipe, "BFD-124");
    Estacionamiento.entra(autoFelipe);
    // notar que no entra el auto, asi que no tiene ningun efecto
    Estacionamiento.calcular();

}

}