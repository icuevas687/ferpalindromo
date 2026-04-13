package org.example.vista;

import java.util.Scanner;

public class PalindromoVista {

    private Scanner scanner;

    public PalindromoVista() {
        scanner = new Scanner(System.in);
    }

    public String pedirFrase() {
        System.out.println("Por favor ingresa tu frase:");
        return scanner.nextLine();
    }

    public void mostrarTextoLimpio(String textoLimpio) {
        System.out.println("Texto limpio: " + textoLimpio);
    }

    public void mostrarResultado(boolean esPalindromo) {
        if (esPalindromo) {
            System.out.println("La frase que ingresaste es un Palindromo !.");
        } else {
            System.out.println("La frace que ingresaste no es un Palindromo, lo siento :(.");
        }
    }
}