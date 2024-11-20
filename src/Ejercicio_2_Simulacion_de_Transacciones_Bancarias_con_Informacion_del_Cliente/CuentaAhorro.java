package Ejercicio_2_Simulacion_de_Transacciones_Bancarias_con_Informacion_del_Cliente;

//Subclase
public class CuentaAhorro extends CuentaBancaria {

    //Atributos
    private double SALDO_MINIMO = 100;

    //Constructor
    public CuentaAhorro(String numeroCuenta, Cliente cliente) {
        super(numeroCuenta, cliente, 500);
    }

    @Override
    public void retirar(double monto) {
        if (getSaldo() - monto >= SALDO_MINIMO) {
            super.retirar(monto);
            System.out.println("Retiro exitoso. Monto retirado: $" + monto);
        } else {
            System.out.println("No se puede realizar el retiro. El saldo debe ser mayor o igual a $100.");
        }
    }
}
