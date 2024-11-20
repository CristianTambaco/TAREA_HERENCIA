package Ejercicio_2_Simulacion_de_Transacciones_Bancarias_con_Informacion_del_Cliente;

//Subclase
public class CuentaCorriente extends CuentaBancaria {

    //Atributos
    private double COMISION_RETIRO = 0.02;

    //Constructor
    public CuentaCorriente(String numeroCuenta, Cliente cliente) {
        super(numeroCuenta, cliente, 1000);
    }

    @Override
    public void retirar(double monto) {
        double monto_Con_Comision = monto + (monto * COMISION_RETIRO);
        if (monto_Con_Comision <= getSaldo()) {
            super.retirar(monto_Con_Comision);

            System.out.println("Retiro exitoso. Monto retirado: $" + monto + ", comisión: $" + (monto * COMISION_RETIRO));
        } else {
            System.out.println("Saldo insuficiente para cubrir el retiro con la comisión.");
        }
    }
}
