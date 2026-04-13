package org.example.controlador;

import org.example.modelo.PalindromoModelo;
import org.example.vista.PalindromoVista;

public class PalindromoControlador {

    private PalindromoModelo modelo;
    private PalindromoVista vista;

    public PalindromoControlador(PalindromoModelo modelo, PalindromoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        String fraseOriginal = vista.pedirFrase();
        String fraseLimpia = modelo.limpiarTexto(fraseOriginal);
        boolean resultado = modelo.esPalindromo(fraseLimpia);

        vista.mostrarTextoLimpio(fraseLimpia);
        vista.mostrarResultado(resultado);
    }
}