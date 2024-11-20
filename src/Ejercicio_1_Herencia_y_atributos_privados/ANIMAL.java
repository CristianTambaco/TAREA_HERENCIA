package Ejercicio_1_Herencia_y_atributos_privados;


public class ANIMAL {
    //Atributos
    private String nombre;
    private int edad;

    //Constructor
    public ANIMAL(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    //Metodos getter
    public String getNombre() {

        return nombre;
    }

    public int getEdad() {

        return edad;
    }



    //Metodos setter
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }



    //Metodos personalizados
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }


}

