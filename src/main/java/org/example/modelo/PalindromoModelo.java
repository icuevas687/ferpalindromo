package org.example.modelo;

import org.example.estructuras.Pila;

public class PalindromoModelo {

    public String limpiarTexto(String texto) {
        String textoLimpio = texto.toLowerCase();
        textoLimpio = textoLimpio.replace(" ", "");
        textoLimpio = textoLimpio.replace(".", "");
        textoLimpio = textoLimpio.replace(",", "");
        textoLimpio = textoLimpio.replace(";", "");
        return textoLimpio;
    }

    public boolean esPalindromo(String texto) {
        Pila pila = new Pila();

        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }

        for (int i = 0; i < texto.length(); i++) {
            char caracter = (char) pila.pop();

            if (texto.charAt(i) != caracter) {
                return false;
            }
        }

        return true;
    }
}