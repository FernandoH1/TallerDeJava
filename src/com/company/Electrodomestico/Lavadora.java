package com.company.Electrodomestico;

public class Lavadora extends Electrodomestico{
    private final int carga;

    public Lavadora(int precioBase, String color, char consumo_Energetico, int peso, int carga) {
        super(precioBase, color, consumo_Energetico, peso);
        this.carga = carga;
    }

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public int getCarga() {
        return carga;
    }

    public int precioFinal(){
        int precioF = super.precioFinal();
        if(this.carga > 30){
        precioF = precioF + 50;
        }
        return precioF;
    }

}
