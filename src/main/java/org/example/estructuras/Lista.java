package org.example.estructuras;

public class Lista {

    private Nodo ini, fin;
    private String nombre;

    public Lista(String nombre) {
        this.nombre = nombre;
        ini = fin = null;
    }

    public Lista() {
        this("miLista");
    }

    public boolean estaVacia() {
        return null == ini;
    }

    public void insertarAlFrente(Object dato) {
        if (estaVacia()) {
            ini = fin = new Nodo(dato);
        } else {
            ini = new Nodo(dato, ini);
        }
    }

    public void insertarAlFinal(Object dato) {
        if (estaVacia()) {
            ini = fin = new Nodo(dato);
        } else {
            fin = fin.siguiente = new Nodo(dato);
        }
    }

    public Object removerDelFrente() {
        if (estaVacia()) {
            throw new RuntimeException("Lista vacia");
        }

        Object dato = ini.dato;

        if (ini == fin) {
            ini = fin = null;
        } else {
            ini = ini.siguiente;
        }

        return dato;
    }
}