package com.company.Ejercicios;

import com.company.Electrodomestico.Electrodomestico;
import com.company.Electrodomestico.Lavadora;
import com.company.Electrodomestico.Television;
import com.company.Menu;
import com.company.Persona.Persona;
import com.company.Serie.Serie;
import com.company.Serie.Videojuego;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicios {

    public void Ejercicio1(int numero1, int numero2) {
        if (numero1 == numero2) {
            System.out.println("Los Números son IGUALES!!");
        } else {
            System.out.println("El número " + Math.max(numero1, numero2) + " es mayor que el número " + Math.min(numero1, numero2));
        }
    }

    public void Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el Número 2: ");
        int num2 = sc.nextInt();
        Ejercicio1(num1, num2);
    }

    public void Ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        double radio = sc.nextDouble();
        double calcularElArea = Math.PI * (Math.pow(radio, 2));
        System.out.println("El área del Círculo es: " + calcularElArea);
    }

    public void Ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del Producto: ");
        double precio = sc.nextDouble();
        double precioFinal = (precio * 0.21);
        precioFinal = precioFinal + precio;
        System.out.println("El precio Final con IVA es: " + precioFinal);
    }

    public static void Ejercicio5() {
        int i = 1;
        while (i < 101) {
            if (i % 2 == 0) {
                System.out.println(i + " - Es Par!");
            } else {
                System.out.println(i + " - Es Impar!");
            }
            i++;
        }
    }

    public void Ejercicio6() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Es Par!");
            } else {
                System.out.println(i + " - Es Impar!");
            }
        }
    }

    public void Ejercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Número: ");
        int numero = sc.nextInt();
        if (numero == 0) {
            System.out.println(numero + " Es IGUAL que 0");
        } else if (numero > 0) {
            System.out.println(numero + " Es MAYOR que 0");
        } else {
            System.out.println("Por Favor ingrese un Número (Mayor) o (Igual) a 0");
            Ejercicio7();
        }
    }

    public void Ejercicio8() {
        Menu menu = new Menu();
        menu.Ejercicio8();
        boolean salir = false;
        int dia = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un dia de la Semanda(número): ");
            dia = sc.nextInt();
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
                case 0:
                    salir = true;
                    break;
                default:
                    break;
            }
        } while (!salir);
    }

    public void Ejercicio9() {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String remplazoFrase = frase.replace("a", "e");
        System.out.println("FRASE ANTERIOR REMPLAZADA: " + remplazoFrase);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese otra frase para unir a la anterior: ");
        String frase2 = sc.nextLine();
        System.out.println(remplazoFrase + " " + frase2);
    }

    public void Ejercicio10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        String fraseSinEspacios = frase.replace(" ", "");
        System.out.println(fraseSinEspacios);
    }

    public void Ejercicio11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        int contadorVocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i') || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
                contadorVocales++;
            }
        }
        System.out.println("EL largo de la FRASE(con espacios) es: " + frase.length() + " y el numero VOCALES que contiene son: " + contadorVocales);
    }

    public void Ejercicio12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        System.out.println("Ingrese otra palabra: ");
        String palabra2 = sc.nextLine();
        if (palabra.equals(palabra2)) {
            System.out.println("Son Iguales");
        } else
            System.out.println("Son Distintas");
    }

    public void Ejercicio13() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("(AAAA/MM/DD) (HH:MM:SS) -> " + dtf.format(LocalDateTime.now()));
    }

    public void Ejercicio14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Número: ");
        int numero = sc.nextInt();
        while (numero < 1001) {
            System.out.println(numero);
            numero = numero += 2;
        }
    }

    public void Ejercicio15() {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        menu.Ejercicio15();
        do {
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

        } while (!salir);
    }

    public void Ejercicio16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre de la Persona: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese sexo de la Persona(H o M): ");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingrese edad de la Persona: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese peso de la Persona: ");
        int peso = sc.nextInt();
        System.out.println("Ingrese altura(en metros) de la Persona: Ejemplo (1,79): ");
        double altura = sc.nextDouble();


        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Maria");
        persona3.setEdad(12);
        persona3.setSexo('M');
        persona3.setPeso(70);
        persona3.setAltura(1.83);

        System.out.printf(persona.getNombre() + " ");
        persona.calcularIMC();
        System.out.printf(persona2.getNombre() + " ");
        persona2.calcularIMC();
        System.out.printf(persona3.getNombre() + " ");
        persona3.calcularIMC();

        System.out.printf(persona.getNombre() + " ");
        persona.esMayorDeEdad();
        System.out.printf(persona2.getNombre() + " ");
        persona2.esMayorDeEdad();
        System.out.printf(persona3.getNombre() + " ");
        persona3.esMayorDeEdad();

        System.out.println(persona.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }

    public void Ejercicio17() {
        Electrodomestico[] electrodomestico = new Electrodomestico[10];
        electrodomestico[0] = new Electrodomestico(200, "", 'A', 200);
        electrodomestico[1] = new Television(400, "negro", 'B', 278, false, 60);
        electrodomestico[2] = new Television(800, "negro", 'B', 175, true, 50);
        electrodomestico[3] = new Television(800, "rojo", 'B', 160, false, 60);
        electrodomestico[4] = new Television(800, "morado", 'B', 163, false, 70);
        electrodomestico[5] = new Television(800, "negro", 'B', 300, true, 20);
        electrodomestico[6] = new Lavadora(200, "negro", 'A', 360, 200);
        electrodomestico[7] = new Lavadora(400, "roja", 'Z', 200, 130);
        electrodomestico[8] = new Lavadora(600, "gris", 'C', 250, 70);
        electrodomestico[9] = new Lavadora(700, "blanco", 'E', 300, 30);

        int precioTelevisionFinal = 0;
        int precioLavadoraFinal = 0;
        int resultadoFinal = 0;

        for (Electrodomestico el : electrodomestico) {
            if (el instanceof Television) {
                precioTelevisionFinal += el.precioFinal();
            } else if (el instanceof Lavadora) {
                precioLavadoraFinal += el.precioFinal();
            }
            resultadoFinal += el.precioFinal();

        }
        System.out.println("Resultado Television: " + precioTelevisionFinal);
        System.out.println("Resultado Lavadoras Final: " + precioLavadoraFinal);
        System.out.println("Resultado Final: " + resultadoFinal);

    }

    public void Ejercicio18() {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];
        series[0] = new Serie();
        series[1] = new Serie();
        series[2] = new Serie();
        series[3] = new Serie("La piloto",5,"Novela", "Netflix");
        series[4] = new Serie("Jugar con fuego", "Fire");
        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego();
        videojuegos[2] = new Videojuego("DMC5", 600, "RPG", "Devil May Cry");
        videojuegos[3] = new Videojuego("CSGO", 1200, "shooter", "valve");
        videojuegos[4] = new Videojuego("LOL", 200, "MOBA", "RiotGames");

        series[3].entregar();
        series[4].entregar();
        videojuegos[2].entregar();
        videojuegos[3].entregar();

        int contadorSeries = 0;
        for (Serie s : series) {
            if (s.isEntregado()) {
                System.out.println(s.getTitulo());
                contadorSeries++;
            }
        }
        System.out.println("Series Totales: " + contadorSeries);

        int contadorJuegos = 0;
        for (Videojuego vj : videojuegos) {
            if (vj.isEntregado()) {
                System.out.println(vj.getTitulo());
                contadorJuegos++;
            }
        }
        System.out.println("Videos Juegos Totales: " + contadorJuegos);

        Serie serie = new Serie();
        serie.setNumero_de_temporadas(0);

        for (int i = 0; i < series.length ; i++) {
            if(serie.compareTo(series[i])) {
                serie = series[i];
            }
        }
        System.out.println("La Serie con el numero de temporadas mas grande es: "+serie.getTitulo());

        Videojuego videojuego = new Videojuego();
        videojuego.setHorasEstimadas(0);

        for(int i=0; i < videojuegos.length; i++) {
            if (videojuego.compareTo(videojuegos[i])) {
                videojuego = videojuegos[i];
            }
        }
        System.out.println("La Video Juego con mas nuemro de horas es: "+videojuego.getTitulo());
    }
}
