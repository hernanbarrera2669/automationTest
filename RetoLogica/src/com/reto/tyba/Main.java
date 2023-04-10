package com.reto.tyba;

import com.reto.tyba.constantes.Mensajes;
import com.reto.tyba.constantes.TipoDocumento;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leerDatosConsola = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leerDatosConsola.nextLine();
        System.out.println(TipoDocumento.LISTADO_DOCUMENTOS);
        String tipoDocumento = leerDatosConsola.next();
        verificarTipoDocumento(tipoDocumento, nombre);
    }

    public static void verificarTipoDocumento(String tipoDocumento, String nombre) {
        switch (tipoDocumento.toUpperCase(Locale.ROOT)) {
            case TipoDocumento.CEDULA_CIUDADANIA:
            case TipoDocumento.CEDULA_EXTRANJERIA: {
                Scanner leerDatosConsola = new Scanner(System.in);
                System.out.println("Ingrese el monto a invertir sin puntos, décimas o signo de pesos: ");
                String monto = leerDatosConsola.nextLine();
                try {
                    verificarMonto(Double.parseDouble(monto), nombre);
                } catch (Exception e) {
                    System.out.println(nombre + " ".concat(Mensajes.MENSAJE_MONTO_NO_VALIDO));
                }
                break;
            }
            case TipoDocumento.PASAPORTE:
            case TipoDocumento.PERMISO_ESPECIAL_PERMANENCIA:
            case TipoDocumento.REGISTRO_CIVIL:
            case TipoDocumento.TARJETA_IDENTIDAD: {
                System.out.println(nombre + " ".concat(Mensajes.MENSAJE_INVERTIR_TIPO_DOCUMENTO));
                break;
            }
            default: {
                System.out.println(nombre + " ".concat(Mensajes.MENSAJE_TIPO_DOCUMENTO_ERRONEO));
            }
        }
    }

    public static void verificarMonto(double monto, String nombre) {
        if (monto < 200000) {
            System.out.println(nombre + " ".concat(Mensajes.MENSAJE_MONTO_MINIMO));
        } else if (monto >= 200000 && monto < 5000000) {
            System.out.println(nombre + " ".concat(Mensajes.MENSAJE_MONTO_2K_MENOR_5M)+ " y".concat(Mensajes.MENSAJE_GANANCIA_CDT));
        } else if (monto >= 5000000 && monto < 25000000) {
            System.out.println(nombre + " ".concat(Mensajes.MENSAJE_MONTO_MAYOR_5M_MENOR_25M)+ " y".concat(Mensajes.MENSAJE_GANANCIA_ACCIONES));
        } else if (monto >= 25000000) {
            System.out.println(nombre + " ".concat(Mensajes.MENSAJE_MONTO_MAYOR_25M)+ " y".concat(Mensajes.MENSAJE_GANANCIA_FONDOS_INVERSION));
        }
    }
}