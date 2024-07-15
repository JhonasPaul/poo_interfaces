package org.jortiz.poointerfaces.imprenta.modelo;

public interface Imprimible {
    final static String TEXTO_DEFETO = "Imprimiendo valor por defecto";

    // opcional implementar este metodo
    default String imprimir(){
        return TEXTO_DEFETO;
    };

     static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
