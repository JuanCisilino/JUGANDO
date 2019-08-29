package com.company;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(Cliente titular) {
        super(titular);

    }

    private Double saldoCuentaCorriente = getSaldo();

    public void depositar(Double platita) {
        saldoCuentaCorriente = saldoCuentaCorriente + platita;
        System.out.println("\nSe han depositado $"+platita+". Su saldo actual de su Cuenta Corriente es de $"+ saldoCuentaCorriente);
    }

    public void extraer(Double platita) {
        if (platita <= saldoCuentaCorriente) {
            saldoCuentaCorriente = saldoCuentaCorriente - platita;
            System.out.println("\nSe han extraido $" + platita + ". Su saldo actual de su Cuenta Corriente es de $" + saldoCuentaCorriente);
        } else {
            System.out.println("\n¡SALDO INSUFICIENTE!");
        }
    }

    public void depositarCheque(Double platita) {
        saldoCuentaCorriente = saldoCuentaCorriente + platita;
        System.out.println("\nSe ha depositado su cheque por $ " + platita + ". Su saldo actual de su Cuenta Corriente es de $ " + saldoCuentaCorriente);
    }

    public Double getSaldoCuentaCorriente() {
        System.out.println("\nSu saldo de Cuenta Corriente es de $");
        return saldoCuentaCorriente;
    }


}
