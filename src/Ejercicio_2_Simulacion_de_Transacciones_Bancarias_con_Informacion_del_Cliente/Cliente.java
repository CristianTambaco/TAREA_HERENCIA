package Ejercicio_2_Simulacion_de_Transacciones_Bancarias_con_Informacion_del_Cliente;


public class Cliente {
    //Atributos
    private String nombre;
    private String identificacion;

    // Constructor
    public Cliente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    //Metodos getter
    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    //Metodos personalizaods
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
    }
}
