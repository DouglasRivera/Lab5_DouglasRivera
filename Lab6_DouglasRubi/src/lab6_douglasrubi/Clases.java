/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_douglasrubi;

/**
 *
 * @author famii
 */
public class Clases {
    String Nombre;
    String Seccion;
    int Edificio;
    String Salon;
    String AireC;

    public Clases() {
    }

    public Clases(String Nombre, String Seccion, int Edificio, String Salon, String AireC) {
        this.Nombre = Nombre;
        this.Seccion = Seccion;
        this.Edificio = Edificio;
        this.Salon = Salon;
        this.AireC = AireC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public int getEdificio() {
        return Edificio;
    }

    public void setEdificio(int Edificio) {
        this.Edificio = Edificio;
    }

    public String getSalon() {
        return Salon;
    }

    public void setSalon(String Salon) {
        this.Salon = Salon;
    }

    public String getAireC() {
        return AireC;
    }

    public void setAireC(String AireC) {
        this.AireC = AireC;
    }

    @Override
    public String toString() {
        return "" + Nombre + "-" + Edificio ;
    }
    
}
