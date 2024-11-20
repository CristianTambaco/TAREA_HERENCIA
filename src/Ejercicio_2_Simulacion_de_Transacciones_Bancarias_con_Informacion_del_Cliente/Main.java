package Ejercicio_2_Simulacion_de_Transacciones_Bancarias_con_Informacion_del_Cliente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Crear objetos de la clase Clientes
        Cliente cliente1 = new Cliente("Alexander Cepeda", "345464531");
        Cliente cliente2 = new Cliente("Richard Rodrigo", "666655554");

        // Crear objetos de la clase CuentasBancarias
        CuentaBancaria cuenta1 = new CuentaCorriente("CC001", cliente1);
        CuentaBancaria cuenta2 = new CuentaAhorro("CA001", cliente2);

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ver información del cliente y saldo");
            System.out.println("2. Transferir entre cuentas");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {

                //Ver información
                System.out.println("\nInformación cuenta 1:");
                cuenta1.mostrarInformacion();
                System.out.println("\nInformación cuenta 2:");
                cuenta2.mostrarInformacion();
            } else if (opcion == 2) {

                //Transferencia entre cuentas
                System.out.print("Ingrese el monto a transferir de cuenta 1 a cuenta 2: ");
                double montoTransferir = sc.nextDouble();

                if (montoTransferir <= cuenta1.getSaldo()) {
                    cuenta1.retirar(montoTransferir);
                    cuenta2.depositar(montoTransferir);
                    System.out.println("Transferencia exitosa.");
                } else {
                    System.out.println("Saldo insuficiente para la transferencia.");
                }
            } else if (opcion == 3) {
                //Retiro dinero
                System.out.print("Ingrese el monto a retirar de cuenta 1: ");
                double montoRetiro = sc.nextDouble();
                cuenta1.retirar(montoRetiro);
            } else if (opcion == 4) {
                //Deposito dinero
                System.out.print("Ingrese el monto a depositar en cuenta 2: ");
                double montoDepositar = sc.nextDouble();
                cuenta2.depositar(montoDepositar);
                System.out.println("Depósito exitoso.");
            } else if (opcion == 5) {
                System.out.println("*** Cerrando sesion ***");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        
        //Cerrar Scanner
        sc.close();
    }
}
