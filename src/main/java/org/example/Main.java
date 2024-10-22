package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    Ejercicio4();
                    break;
                case 5:
                    Ejercicio5();
                    break;
                case 6:
                    Ejercicio6();
                    break;
                case 7:
                    Ejercicio7();
                    break;
                case 8:
                    Ejercicio8();
                    break;
                case 9:
                    System.out.println("Hasta la vista ....");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 9);
    }

    public static void Ejercicio1() {
        int vida = 100;
        String personaje = "Naruto";
        System.out.println("El personaje " + personaje + " tiene " + vida + " puntos de vida.");
    }

    public static void Ejercicio2() {
        int energia = 80;
        String estado = energia > 50 ? "Personaje fuerte" : "Personaje débil";
        System.out.println(estado);
    }

    public static void Ejercicio3() {
        String[] cofres = {"Espada", "Escudo", "Pocion"};
        for (String cofre : cofres) {
            System.out.println("Has encontrado: " + cofre);
        }
    }

    public static void Ejercicio4() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Salta la iteración cuando i es 3
            }
            System.out.println("Numero: " + i);
        }
    }

    public static void Ejercicio5() {
        Personaje goku = new Personaje("Goku", 100, 50);
        goku.mostrarInfo();
    }

    public static void Ejercicio6() {
        String personaje = null;
        if (personaje != null) {
            System.out.println("El personaje es " + personaje);
        } else {
            System.out.println("No hay personaje.");
        }
    }

    public static void Ejercicio7() {
        System.out.println(multiplicar(5));

        Operacion operacion = (a, b) -> a + b;
        System.out.println(operacion.sumar(3, 4));
    }

    public static void Ejercicio8() {
        Personaje goku = new Personaje("Goku", 100, 20);
        Personaje vegeta = new Personaje("Vegeta", 80, 25);

        while (goku.vida > 0 && vegeta.vida > 0) {
            goku.vida -= vegeta.ataque;
            vegeta.vida -= goku.ataque;
            System.out.println("Vida de Goku: " + goku.vida);
            System.out.println("Vida de Vegeta: " + vegeta.vida);
        }

        if (goku.vida <= 0) {
            System.out.println("Vegeta ha ganado el combate.");
        } else {
            System.out.println("Goku ha ganado el combate.");
        }
    }

    public static int multiplicar(int num) {
        return num * 2;
    }

    interface Operacion {
        int sumar(int a, int b);
    }

    static class Personaje {
        String nombre;
        int vida;
        int ataque;

        public Personaje(String nombre, int vida, int ataque) {
            this.nombre = nombre;
            this.vida = vida;
            this.ataque = ataque;
        }

        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre + ", Vida: " + vida + ", Ataque: " + ataque);
        }
    }
}



