package com.company;

public class CajaDeAhorro extends Cuenta {

    public CajaDeAhorro(Cliente titular) {
        super(titular);
    }

    private Double saldoCajadeAhorro = getSaldo();
    private Double interes = saldoCajadeAhorro * 0.12;
    public void depositar(Double platita) {
        saldoCajadeAhorro = saldoCajadeAhorro + platita;
        System.out.println("\nSe han depositado $"+platita+". Su saldo actual de su Caja de Ahorro es de $"+ saldoCajadeAhorro);
    }

    public void extraer(Double platita) {
        if (platita <= saldoCajadeAhorro) {
            saldoCajadeAhorro = saldoCajadeAhorro - platita;
            System.out.println("\nSe han extraido $" + platita + ". Su saldo actual de su Caja de Ahorro es de $" + saldoCajadeAhorro);
        } else {
            System.out.println("\n¡SALDO INSUFICIENTE!");
        }
    }

    public Double getSaldoCajadeAhorro() {
        System.out.println("\nSu saldo de Caja de Ahorro es de $");
        return saldoCajadeAhorro;
    }
}
