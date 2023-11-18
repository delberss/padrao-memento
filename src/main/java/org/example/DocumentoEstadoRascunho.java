package org.example;

public class DocumentoEstadoRascunho implements DocumentoEstado {

    private DocumentoEstadoRascunho() {}
    private static DocumentoEstadoRascunho instance = new DocumentoEstadoRascunho();
    public static DocumentoEstadoRascunho getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Rascunho";
    }
}
