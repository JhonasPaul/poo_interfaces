package org.jortiz.poointerfaces.imprenta;


import org.jortiz.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("John", "Doe"), "Ingeniero de sistgemas", "Resumen labora<l ...");
        cv.addExperiencias("Java")
                .addExperiencias("Oracle DBA")
                .addExperiencias("Spring Framework")
                .addExperiencias("Desarrolladores fullstack")
                .addExperiencias("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseño: Elem. Reusbles POO"
                , Genero.PROGRAJMACION);
        libro.addPAgina(new Pagina("Paatron Singleton"))
                .addPAgina(new Pagina("Patron Observador"))
                .addPAgina(new Pagina("Patron Factory"))
                .addPAgina(new Pagina("Patron Composite"))
                .addPAgina(new Pagina("Patron Fascade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"),
                new Persona("Jameas", "Gosling"), "Estudio sobre microservicio");
        Imprimible.imprimir(cv);
        Imprimible.imprimir(informe);
        Imprimible.imprimir(libro);

        Imprimible.imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola, que tal, imprimiendo un objeto generico de una clase anonima ";
            }
        });

        System.out.println(Imprimible.TEXTO_DEFETO);
    }
}