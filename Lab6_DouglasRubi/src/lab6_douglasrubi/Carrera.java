/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_douglasrubi;
import java.util.ArrayList;


public class Carrera {
    String Nombre;
    String Facultad;
    double Mensualidad;
    String Jefe_Carrera;
    
    public Carrera() {
    }

    public Carrera(String Nombre, String Facultad, double Mensualidad, String Jefe_Carrera) {
        this.Nombre = Nombre;
        this.Facultad = Facultad;
        this.Mensualidad = Mensualidad;
        this.Jefe_Carrera = Jefe_Carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public double getMensualidad() {
        return Mensualidad;
    }

    public void setMensualidad(double Mensualidad) {
        this.Mensualidad = Mensualidad;
    }

    public String getJefe_Carrera() {
        return Jefe_Carrera;
    }

    public void setJefe_Carrera(String Jefe_Carrera) {
        this.Jefe_Carrera = Jefe_Carrera;
    }

    @Override
    public String toString() {
        return "" + Nombre + "-" + Facultad + "-" + Jefe_Carrera;
    }
    
}
