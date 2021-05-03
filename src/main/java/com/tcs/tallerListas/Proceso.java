package com.tcs.tallerListas;

import com.tcs.tallerListas.beans.Estudiante;

import java.util.ArrayList;

public class Proceso {

    ArrayList<Estudiante> arrayJardin = new ArrayList<Estudiante>();
    ArrayList<Estudiante> arrayPrimero = new ArrayList<Estudiante>();
    ArrayList<Estudiante> arraySegundo = new ArrayList<Estudiante>();
    ArrayList<Estudiante> arrayTercero = new ArrayList<Estudiante>();
    ArrayList<Estudiante> arrayCuarto = new ArrayList<Estudiante>();
    ArrayList<Estudiante> arrayQuinto = new ArrayList<Estudiante>();


    public int estudiantesEntre6y10(ArrayList<Estudiante> estudianteArray) {
        int numeroEstudiantes = 0;
        for (Estudiante estudiante : estudianteArray) {
            try{
                if (Integer.parseInt(estudiante.getEdad()) >= 6 && Integer.parseInt(estudiante.getEdad()) <= 10) {
                    numeroEstudiantes++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error en conversión"+ e.getMessage());
            }
        }
        return numeroEstudiantes;
    }

    public void anadirPorGrado(ArrayList<Estudiante> estudianteArray) {

        for (Estudiante estudiante : estudianteArray) {
            String grado = estudiante.getGrado();
            switch (grado) {
                case "Jardin":
                    arrayJardin.add( new Estudiante( estudiante.getNombre(), estudiante.getGrado()));
                    break;
                case "Primero":
                    arrayPrimero.add( new Estudiante( estudiante.getNombre(), estudiante.getGrado()));
                    break;
                case "Segundo":
                    arraySegundo.add( new Estudiante( estudiante.getNombre(), estudiante.getGrado()));
                    break;
                case "Tercero":
                    arrayTercero.add( new Estudiante( estudiante.getNombre(), estudiante.getGrado()));
                    break;
                case "Cuarto":
                    arrayCuarto.add( new Estudiante( estudiante.getNombre(), estudiante.getGrado()));
                    break;
                case "Quinto":
                    arrayQuinto.add( new Estudiante( estudiante.getNombre(), estudiante.getGrado()));
                    break;
                default:
                    System.out.println("No se incluye");
            }
        }

        imprimirXGrado(arrayJardin, "Jardin");
        imprimirXGrado(arrayPrimero, "Primero");
        imprimirXGrado(arraySegundo, "Segundo");
        imprimirXGrado(arrayTercero, "Tercero");
        imprimirXGrado(arrayCuarto, "Cuarto");
        imprimirXGrado(arrayQuinto, "Quinto");
    }

    public void imprimirXGrado(ArrayList<Estudiante> arrayGrados, String grado){

        System.out.println("Los estudiantes de "+ grado +" son : ");
        for(Estudiante estudiantesGrado: arrayGrados){
            System.out.println("Nombre: "+ estudiantesGrado.getNombre());
        }
        System.out.println("/////////////////////////// \n");
    }

    public void imprimirDocumentoTI(ArrayList<Estudiante> estudianteArray){
        System.out.println("Los estudiantes que tienen Tarjeta de identidad son: ");
        for(Estudiante estudiantesTI: estudianteArray){
            if(estudiantesTI.getDocumento().substring(0,2).equals("TI")){
                System.out.println("Nombre: "+ estudiantesTI.getNombre() +" Edad: "+estudiantesTI.getEdad()+
                        " Grado: " + estudiantesTI.getGrado());
            }
        }

    }

    public void imprimirRepitentes(ArrayList<Estudiante> estudianteArray){
        System.out.println("Los estudiantes que repiten grado son:");
        for(Estudiante estudiantes: estudianteArray){
            if(Boolean.parseBoolean(estudiantes.getRepite()) == true){
                System.out.println(estudiantes.getNombre());
            }
        }
    }

}

