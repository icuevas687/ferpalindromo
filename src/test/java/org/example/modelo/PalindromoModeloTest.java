package org.example.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromoModeloTest {

    private PalindromoModelo modelo;

    @BeforeEach
    public void setUp() {
        modelo = new PalindromoModelo();
    }

    @Test
    public void testPalindromoSimple() {
        assertTrue(modelo.esPalindromo("oso"));
    }

    @Test
    public void testNoPalindromo() {
        assertFalse(modelo.esPalindromo("hola"));
    }

    @Test
    public void testConEspacios() {
        String limpio = modelo.limpiarTexto("anita lava la tina");
        assertTrue(modelo.esPalindromo(limpio));
    }

    @Test
    public void testConPuntuacion() {
        String limpio = modelo.limpiarTexto("Anita, lava la tina.");
        assertTrue(modelo.esPalindromo(limpio));
    }

    @Test
    public void testMayusculas() {
        String limpio = modelo.limpiarTexto("Reconocer");
        assertTrue(modelo.esPalindromo(limpio));
    }
}