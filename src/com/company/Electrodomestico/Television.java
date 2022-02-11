package com.company.Electrodomestico;

public class Television extends Electrodomestico{
    private boolean sintonizadorTDT;
    private int resolucion;

    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(int precioBase, int peso) {
        super(precioBase, peso);
        this.sintonizadorTDT = false;
        this.resolucion = 20;
    }

    public Television(int precioBase, String color, char consumo_Energetico, int peso, boolean sintonizadorTDT, int resolucion) {
        super(precioBase, color, consumo_Energetico, peso);
        this.sintonizadorTDT = sintonizadorTDT;
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public int precioFinal(){
        int precioF = super.precioFinal();
        if(this.resolucion > 40 && this.sintonizadorTDT){
            precioF = (precioF*30)/100;
            precioF = precioF + 50;
        }else if(this.resolucion > 40 && !this.sintonizadorTDT)
            precioF = precioF +50;
        return precioF;
    }
}
