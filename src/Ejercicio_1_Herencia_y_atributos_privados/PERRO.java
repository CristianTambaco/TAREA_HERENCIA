package Ejercicio_1_Herencia_y_atributos_privados;

public class PERRO extends ANIMAL {

    //Atributos

    //Constructor
    public PERRO(String nombre, int edad) {

        super(nombre, edad);
    }


    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau, guau!");
    }
}