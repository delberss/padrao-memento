package org.example;

public class DocumentoEstadoArquivado implements DocumentoEstado {

    private DocumentoEstadoArquivado() {}
    private static DocumentoEstadoArquivado instance = new DocumentoEstadoArquivado();
    public static DocumentoEstadoArquivado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Arquivado";
    }
}