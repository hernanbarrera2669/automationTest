package com.reto.tyba.constantes;

public class TipoDocumento {
    public static final String CEDULA_CIUDADANIA = "CC";
    public static final String CEDULA_EXTRANJERIA = "CE";
    public static final String PASAPORTE = "PA";
    public static final String PERMISO_ESPECIAL_PERMANENCIA = "PE";
    public static final String REGISTRO_CIVIL = "RC";
    public static final String TARJETA_IDENTIDAD = "TI";
    public static final String LISTADO_DOCUMENTOS =
            "Ingrese su tipo de documento de acuerdo a la lista:\n" +
                    "CC = Cédula de ciudadanía\n" +
                    "CE = Cédula de extranjería\n" +
                    "PA = Pasaporte\n" +
                    "PE = Permiso especial de permanencia\n" +
                    "RC = Registro civil\n" +
                    "TI = Tarjeta de identidad";

    private TipoDocumento(){
    }
}
