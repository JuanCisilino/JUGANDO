package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //Cliente otroCliente = new Cliente();
        Cliente unCliente = new Cliente("Pat","Ugarte",12344,3356432,"23-23234232-2");
        Cuenta miCuenta = new CajaDeAhorro(unCliente);
        Cuenta cuenta2 = new CuentaCorriente(unCliente);
        Cuenta cuenta3 = new CuentaConvertibilidad(unCliente);

        System.out.println(miCuenta.getSaldoCajadeAhorro());

        miCuenta.depositar(2000.0);

        System.out.println(miCuenta.getSaldoCajadeAhorro());

        miCuenta.extraer(2500.0);
        miCuenta.extraer(1000.0);

        System.out.println(cuenta2.getSaldoCuentaCorriente());

        cuenta2.depositarCheque(5200.00);

        System.out.println(cuenta2.getSaldoCuentaCorriente());

        System.out.println(cuenta3.getSaldoDolares());

        cuenta3.depositardolares(50.0);

        System.out.println(cuenta3.getSaldoDolares());

    }
}
