package org.example;

import org.example.controlador.PalindromoControlador;
import org.example.modelo.PalindromoModelo;
import org.example.vista.PalindromoVista;

public class Main {

    public static void main(String[] args) {
        PalindromoModelo modelo = new PalindromoModelo();
        PalindromoVista vista = new PalindromoVista();
        PalindromoControlador controlador = new PalindromoControlador(modelo, vista);

        controlador.ejecutar();
    }
}