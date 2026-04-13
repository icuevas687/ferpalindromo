package org.example.estructuras;

public class Pila extends Lista {

    public Pila() {
        super("pila");
    }

    public Pila(String nombre) {
        super(nombre);
    }

    public void push(Object dato) {
        insertarAlFrente(dato);
    }

    public Object pop() {
        return removerDelFrente();
    }
}