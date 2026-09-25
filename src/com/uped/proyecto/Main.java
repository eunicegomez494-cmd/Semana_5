package com.uped.proyecto;

import com.uped.proyecto.modelo.Docente;
import com.uped.proyecto.modelo.Estudiante;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DOCENTE ---");
        Docente docente = new Docente("María Hernández", "05987654-3", "Ingeniería de Software", 8);
        System.out.println(docente);
        docente.impartirClase("Programación III");

        System.out.println("\n--- PRUEBA ESTUDIANTE ---");
        Estudiante e = new Estudiante("Carlos Ramírez", "06123456-7", "UPED-2026-045", "Ing. en Sistemas");
        System.out.println(e);
        e.matricular("Programación III");
    }
}