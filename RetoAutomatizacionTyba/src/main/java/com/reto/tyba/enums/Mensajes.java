package com.reto.tyba.enums;

public enum Mensajes {
    MENSAJE_AUTENTICACION_FALLIDA("Epic sadface: Sorry, this user has been locked out."),
    USUARIO_BLOQUEADO("El usuario no se encuentra activo"),
    LISTADO_PRODUCTOS("Products"),
    USUARIO_DISPONIBLE("El usuario se encuentra activo");

    private final String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}