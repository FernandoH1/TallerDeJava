package com.company.Electrodomestico;

public class Electrodomestico {
    private final int precioBase;
    private final String color;
    private final char consumo_Energetico;
    private final int peso;


    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "blanco";
        this.consumo_Energetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.color = "blanco";
        this.consumo_Energetico = 'F';
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, char consumo_Energetico, int peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumo_Energetico = comprobarConsumoEnergetico(consumo_Energetico);
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_Energetico() {
        return consumo_Energetico;
    }

    public int getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        if( letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            return letra;
        }
        return 'F';
    }

    private String comprobarColor(String color) {
        if( color == "blanco" || color == "negro" || color == "rojo" || color == "azul" ||  color == "gris") {
            return color;
        }
        return "blanco";
    }

    public int precioFinal() {
        int precioF = this.precioBase;
        char letra = Character.toUpperCase(this.consumo_Energetico);
        switch (letra) {
            case 'A':
                precioF = precioF+100;
                break;
            case 'B':
                precioF = precioF+80;
                break;
            case 'C':
                precioF = precioF+60;
                break;
            case 'D':
                precioF = precioF+50;
                break;
            case 'E':
                precioF = precioF+30;
                break;
            case 'F':
                precioF = precioF+10;
                break;
            default:
        }
        if(this.peso >= 0 && this.peso <= 19){
            precioF= precioF+10;
        }else if(this.peso >= 20 && this.peso <= 49){
            precioF= precioF+50;
        }else if(this.peso >= 50 && this.peso <= 79){
            precioF= precioF+80;
        }else if(this.peso > 80){
            precioF= precioF+100;
        }
        return precioF;
    }


}
