package org.example.estructuras;

class ExceptionListaVacia extends RuntimeException {

    public ExceptionListaVacia() {
        this("lista");
    }

    public ExceptionListaVacia(String nombre) {
        super(nombre + " esta vacia!");
    }
}