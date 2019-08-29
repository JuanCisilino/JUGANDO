package com.company;

public class CuentaConvertibilidad extends Cuenta {

    public CuentaConvertibilidad(Cliente titular){
        super(titular);
    }

    private Double saldoDolares = getSaldo();

    public void depositardolares(Double platita) {
        saldoDolares = saldoDolares + platita;
        System.out.println("\nSe han depositado usd$"+platita+". Su saldo actual es de usd$"+ saldoDolares);
    }

    public void extraer(Double platita) {
        if (platita <= saldoDolares) {
            saldoDolares = saldoDolares - platita;
            System.out.println("\nSe han extraido usd$" + platita + ". Su saldo actual es de usd$" + saldoDolares);
        } else {
            System.out.println("\n¡SALDO INSUFICIENTE!");
        }
    }

    public Double getSaldoDolares() {
        System.out.println("\nSu saldo es de usd$");
        return saldoDolares;
    }

}
