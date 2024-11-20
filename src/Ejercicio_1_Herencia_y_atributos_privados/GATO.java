package Ejercicio_1_Herencia_y_atributos_privados;

public class GATO extends ANIMAL {

    //Atributos

    //Constructor
    public GATO(String nombre, int edad) {

        super(nombre, edad);
    }


    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau!");
    }
}