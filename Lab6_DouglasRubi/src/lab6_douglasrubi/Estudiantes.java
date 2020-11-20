/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_douglasrubi;


public class Estudiantes {
    
    String Nombre;
    String Apellido;
    int NumeroCuenta;
    int Edad;
    String Genero;
    String Carrera;

    public Estudiantes() {
    }

    public Estudiantes(String Nombre, String Apellido, int NumeroCuenta, int Edad, String Genero, String Carrera) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NumeroCuenta = NumeroCuenta;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Carrera = Carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
}
