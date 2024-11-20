package Ejercicio_1_Herencia_y_atributos_privados;

public class Main {
    public static void main(String[] args) {

        //Crear objetos con datos quemados
        PERRO perro1 = new PERRO("Max", 7);
        GATO gato1 = new GATO("Snow", 5);

        //Imprimir
        System.out.println("Nombre perro: " + perro1.getNombre());
        System.out.println("Edad perro: " + perro1.getEdad());
        perro1.hacerSonido();

        System.out.println(" ");

        System.out.println("Nombre gato: " + gato1.getNombre());
        System.out.println("Edad gato: " + gato1.getEdad());
        gato1.hacerSonido();
    }

}
