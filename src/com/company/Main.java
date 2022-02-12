package com.company;

import com.company.Ejercicios.Ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.Ejercicios();
        int opcion = 0;
        boolean salir = false;
        Ejercicios ejercicios = new Ejercicios();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el Número del Ejercicio(1-18): ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ejercicios.Ejercicio1(2, 1);
                    break;
                case 2:
                    ejercicios.Ejercicio2();
                    break;
                case 3:
                    ejercicios.Ejercicio3();
                    break;
                case 4:
                    ejercicios.Ejercicio4();
                    break;
                case 5:
                    ejercicios.Ejercicio5();
                    break;
                case 6:
                    ejercicios.Ejercicio6();
                    break;
                case 7:
                    ejercicios.Ejercicio7();
                    break;
                case 8:
                    ejercicios.Ejercicio8();
                    break;
                case 9:
                    ejercicios.Ejercicio9();
                    break;
                case 10:
                    ejercicios.Ejercicio10();
                    break;
                case 11:
                    ejercicios.Ejercicio11();
                    break;
                case 12:
                    ejercicios.Ejercicio12();
                    break;
                case 13:
                    ejercicios.Ejercicio13();
                    break;
                case 14:
                    ejercicios.Ejercicio14();
                    break;
                case 15:
                    ejercicios.Ejercicio15();
                    break;
                case 16:
                    ejercicios.Ejercicio16();
                    break;
                case 17:
                    ejercicios.Ejercicio17();
                    break;
                case 18:
                    ejercicios.Ejercicio18();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    break;
            }
        } while (!salir);

    }
}