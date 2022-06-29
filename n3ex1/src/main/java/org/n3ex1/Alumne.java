package org.n3ex1;

public class Alumne {

    private final String nom;
    private final int edat;
    private final String curs;
    private final float nota;

    public Alumne(String nom, int edat, String curs, float nota) {
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
        this.nota = nota;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public String getCurs() {
        return curs;
    }

    public float getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", curs='" + curs + '\'' +
                ", nota=" + nota +
                '}';
    }
}
