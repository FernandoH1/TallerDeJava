package com.company.Persona;

public class Persona {
    private String nombre = null;
    private int edad = 0;
    private char sexo = ' ';
    private int peso = 0;
    private double altura = 0;
    private int dni = 0;

    public Persona() {
        this.dni = generarDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.dni = generarDNI();
    }

    public int calcularIMC() {
        int peso = this.peso;
        double altura = this.altura;
        double imc = peso/Math.pow(altura,2);
        if (imc < 20) {
            System.out.println("Su peso esta por debajo de lo normal");
            return -1;
        } else if (imc < 26 && imc > 19) {
            System.out.println("Su peso es Normal");
            return 0;
        } else if (imc > 25) {
            System.out.println("Esta por encima de su peso normal(Sobrepeso)");
            return 1;
        }
        return -2;
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            System.out.println("Es Mayor");
            return true;
        } else {
            System.out.println("Es Menor");
            return false;
        }
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm') {
            return 'M';
        } else if (sexo == 'H' || sexo == 'h') {
            return 'H';
        } else {
            return 'H';
        }
    }

    public String toString() {
        return "Nombre: " + this.getNombre() + " - Edad: " + String.valueOf(this.edad) + " - Sexo: " + this.sexo + " - Peso: " + String.valueOf(this.peso) + "kg - Altura: " + String.valueOf(this.altura) + "m";
    }

    private int generarDNI() {
        double dni = 10000000 + Math.random() * 90000000;
        return (int) dni;
    }


}
