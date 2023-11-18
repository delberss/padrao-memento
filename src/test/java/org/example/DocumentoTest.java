package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {
    @Test
    void deveArmazenarEstados() {
        Documento documento = new Documento();
        documento.setEstado(DocumentoEstadoRascunho.getInstance());
        documento.setEstado(DocumentoEstadoRevisado.getInstance());
        assertEquals(2, documento.getNumeroDeEstadosSalvos());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Documento documento = new Documento();
        documento.setEstado(DocumentoEstadoRascunho.getInstance());
        documento.setEstado(DocumentoEstadoRevisado.getInstance());
        documento.restauraEstado(0);
        assertEquals(DocumentoEstadoRascunho.getInstance(), documento.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Documento documento = new Documento();
        documento.setEstado(DocumentoEstadoRascunho.getInstance());
        documento.setEstado(DocumentoEstadoRevisado.getInstance());
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        documento.restauraEstado(1);
        assertEquals(DocumentoEstadoRevisado.getInstance(), documento.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Documento documento = new Documento();
            documento.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}