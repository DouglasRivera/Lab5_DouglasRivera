/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_douglasrubi;


public class Estudiantes extends Persona {
    

    int NumeroCuenta;
    String Carrera;

    public Estudiantes() {
    }

    public Estudiantes(String Nombre, String Apellido, int Edad, String Genero,int NumeroCuenta, String Carrera) {
        super(Nombre, Apellido, Edad, Genero);
        this.NumeroCuenta = NumeroCuenta;
        this.Carrera = Carrera;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
}
