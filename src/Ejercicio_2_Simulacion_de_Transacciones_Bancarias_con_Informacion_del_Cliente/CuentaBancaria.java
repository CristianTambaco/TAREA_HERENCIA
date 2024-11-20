package Ejercicio_2_Simulacion_de_Transacciones_Bancarias_con_Informacion_del_Cliente;


public class CuentaBancaria {
    //Atributos
    private double saldo;
    private String numeroCuenta;
    private Cliente cliente;

    //Constructor
    public CuentaBancaria(String numeroCuenta, Cliente cliente, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    //Metodos getter
    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    //Metodos personalizados
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarInformacion() {
        cliente.mostrarInformacion();  // Mostrar la información del cliente
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
}
