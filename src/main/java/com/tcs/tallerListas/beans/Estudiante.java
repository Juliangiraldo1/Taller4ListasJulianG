package com.tcs.tallerListas.beans;

public class Estudiante {

    public Estudiante( String documento,String nombre, String edad, String grado, String repite) {
        this.nombre = nombre;
        this.documento = documento;
        this.grado = grado;
        this.edad = edad;
        this.repite = repite;
    }

    public Estudiante(String nombre, String grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    String nombre, documento, grado, edad, repite;

    public String getRepite() {
        return repite;
    }

    public void setRepite(String repite) {
        this.repite = repite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
