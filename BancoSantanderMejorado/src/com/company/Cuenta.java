package com.company;

public class Cuenta {
    private Integer nroCuenta;
    private Double saldo;
    private Cliente titular;

    public Cuenta(Cliente titular) {
        this.titular = titular;
        saldo = 0.0;
        //System.out.println("CREASTE UNA NUEVA CUENTA");
    }

    public void depositar(Double platita){
        saldo = saldo + platita;
        System.out.println("Se han depositado $"+platita+". Su saldo actual es de $"+saldo);
    }

    public void extraer(Double platita){
        if(platita <= saldo){
            saldo = saldo - platita;
            System.out.println("Se han extraido $"+platita+". Su saldo actual es de $"+saldo);
        } else {
            System.out.println("¡SALDO INSUFICIENTE!");
        }
    }


    public void depositarCheque(Double platita) {
        saldo = saldo + platita;
        System.out.println("Se ha depositado su cheque por $ " + platita + ". Su saldo actual de su Cuenta Corriente es de $ " + saldo);
    }

    public void depositardolares(Double platita) {
        saldo = saldo + platita;
        System.out.println("\nSe han depositado usd$"+platita+". Su saldo actual de su Cuenta Corriente es de usd$"+ saldo);
    }


    public Double getSaldo() {
        return saldo;
    }

    public Double getSaldoCuentaCorriente() {
        return null;
    }

    public Double getSaldoCajadeAhorro() {
        return null;
    }

    public Double getSaldoDolares() {
        return null;
    }

}
