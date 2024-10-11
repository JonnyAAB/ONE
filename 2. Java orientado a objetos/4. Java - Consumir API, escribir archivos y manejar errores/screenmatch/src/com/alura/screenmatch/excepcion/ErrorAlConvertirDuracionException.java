package com.alura.screenmatch.excepcion;

public class ErrorAlConvertirDuracionException extends RuntimeException {
    private String mensaje;

    public ErrorAlConvertirDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
