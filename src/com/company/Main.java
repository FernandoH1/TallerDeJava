package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Ejercicio15();
    }

    public static void Ejercicio1(int numero1,int numero2){
        if(numero1 == numero2){
            System.out.println("Los Números son IGUALES!!");
        }else{
            System.out.println("El número "+Math.max(numero1,numero2)+" es mayor que el número "+Math.min(numero1,numero2));
        }
    }

    public static void Ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el Número 2: ");
        int num2 = sc.nextInt();
        Ejercicio1(num1,num2);
    }

    public static void Ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        double radio = sc.nextDouble();
        double calcularElArea = Math.PI*(Math.pow(radio,2));
        System.out.println("El área del Círculo es: "+calcularElArea);
    }

    public static void Ejercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del Producto: ");
        double precio = sc.nextDouble();
        double precioFinal = (precio*0.21);
        precioFinal = precioFinal+precio;
        System.out.println("El precio Final con IVA es: "+precioFinal);
    }

    public static void Ejercicio5(){
        int i=1;
        while(i<101){
            if(i%2 == 0){
                System.out.println(i+" - Es Par!");
            }else{
                System.out.println(i+" - Es Impar!");
            }
            i++;
        }
    }

    public static void Ejercicio6(){
        for (int i = 1; i < 101; i++) {
            if( i % 2 == 0){
                System.out.println(i+" - Es Par!");
            }else{
                System.out.println(i+" - Es Impar!");
            }
        }
    }

    public static void Ejercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Número: ");
        int numero = sc.nextInt();
            if (numero == 0) {
                System.out.println(numero + " Es IGUAL que 0");
            } else if(numero > 0){
                System.out.println(numero + " Es MAYOR que 0");
            }else{
                System.out.println("Por Favor ingrese un Número (Mayor) o (Igual) a 0");
                Ejercicio7();
            }
    }

    public static void Ejercicio8(){
        menuEjercicio8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un dia de la Semanda(número): ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Es un Día Laboral");
                break;
            case 2:
                System.out.println("Es un Día Laboral");
                break;
            case 3:
                System.out.println("Es un Día Laboral");
                break;
            case 4:
                System.out.println("Es un Día Laboral");
                break;
            case 5:
                System.out.println("Es un Día Laboral");
                break;
            case 6:
                System.out.println("Es un Día NO Laboral");
                break;
            case 7:
                System.out.println("Es un Día NO Laboral");
                break;
            default:
                break;
        }
    }

    public static void menuEjercicio8(){
        System.out.println("//---------------- Menú ----------------//\n" +
        "| 1 - Lunes                              |\n" +
        "| 2 - Martes                             |\n" +
        "| 3 - Miércoles                          |\n" +
        "| 4 - Jueves                             |\n" +
        "| 5 - Viernes                            |\n" +
        "| 6 - Sábado                             |\n" +
        "| 7 - Domingo                            |\n" +
        "//---------------------------------------//");
    }



    public static void Ejercicio9(){
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String remplazoFrase = frase.replace("a","e");
        System.out.println("FRASE ANTERIOR REMPLAZADA: "+remplazoFrase);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese otra frase para unir a la anterior: ");
        String frase2 = sc.nextLine();
        System.out.println(remplazoFrase+" "+frase2);
    }

    public static void Ejercicio10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        String fraseSinEspacios = frase.replace(" ","");
        System.out.println(fraseSinEspacios);
    }
     public static void Ejercicio11(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese una frase: ");
         String frase = sc.nextLine();
         int contadorVocales = 0;
         for (int i = 0; i < frase.length() ; i++) {
             if ((frase.charAt(i)=='a') || (frase.charAt(i)=='e') || (frase.charAt(i)=='i') || (frase.charAt(i)=='o') || (frase.charAt(i)=='u')){
                 contadorVocales++;
             }
         }
         System.out.println("EL largo de la FRASE(con espacios) es: "+frase.length()+" y el numero VOCALES que contiene son: "+contadorVocales);
     }

     public static void Ejercicio12(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese una palabra: ");
         String palabra = sc.nextLine();
         System.out.println("Ingrese otra palabra: ");
         String palabra2 = sc.nextLine();
         if(palabra.equals(palabra2)){
             System.out.println("Son Iguales");
         }else
             System.out.println("Son Distintas");
     }

     public static void Ejercicio13(){
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
         System.out.println("(AAAA/MM/DD) (HH:MM:SS) -> "+dtf.format(LocalDateTime.now()));
     }

    public static void Ejercicio14(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Número: ");
        int numero = sc.nextInt();
        while(numero < 1001){
            System.out.println(numero);
            numero = numero+=2;
        }
    }

    public static void Ejercicio15(){
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        menuEjercicio15();
        do{
            System.out.println("Ingrese un Número: ");
            int numero = sc.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("Este es el caso 1");
                    break;
                case 2:
                    System.out.println("Este es el caso 2");
                    break;
                case 3:
                    System.out.println("Este es el caso 3");
                    break;
                case 4:
                    System.out.println("Este es el caso 4");
                    break;
                case 5:
                    System.out.println("Este es el caso 5");
                    break;
                case 6:
                    System.out.println("Este es el caso 6");
                    break;
                case 7:
                    System.out.println("Este es el caso 7");
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    break;
            }

        }while(!salir);
    }

    public static void menuEjercicio15(){
        System.out.println("//-------------GESTION CINEMATOGRÁFICA ------------//\n" +
                "| 1-NUEVO ACTOR                                    |\n" +
                "| 2-BUSCAR ACTOR                                   |\n" +
                "| 3-ELIMINAR ACTOR                                 |\n" +
                "| 4-MODIFICAR ACTOR                                |\n" +
                "| 5-VER TODOS LOS ACTORES                          |\n" +
                "| 6- VER PELICULAS DE LOS ACTORES                  |\n" +
                "| 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES  |\n" +
                "| 8-SALIR                                          |\n" +
                "//------------------------------------------------//");
    }
}
