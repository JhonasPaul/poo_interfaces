package org.jortiz.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible {
    private Persona autor;
    private Persona revisor;


    public Informe( Persona autor, Persona revisor, String contenido) {
        super(contenido);
        this.revisor = revisor;
        this.autor = autor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + autor
                + " Revisado por: " + revisor
                + "\n" + this.contenido;
    }
}
