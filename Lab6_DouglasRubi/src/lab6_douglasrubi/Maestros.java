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
public class Maestros extends Persona {

    int ListaClases;

    public Maestros() {
    }

    public Maestros(int ListaClases) {
        this.ListaClases = ListaClases;
    }

    public int getListaClases() {
        return ListaClases;
    }

    public void setListaClases(int ListaClases) {
        this.ListaClases = ListaClases;
    }
    
}