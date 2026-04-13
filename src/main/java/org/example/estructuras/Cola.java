package org.example.estructuras;

class Nodo {
    public Object dato;
    public Nodo siguiente;

    public Nodo(Object dato, Nodo siguiente) {
        setDato(dato);
        setSiguiente(siguiente);
    }

    public Nodo(Object dato) {
        setDato(dato);
        setSiguiente(null);
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}