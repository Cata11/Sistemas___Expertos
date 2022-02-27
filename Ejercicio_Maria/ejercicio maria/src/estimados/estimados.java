/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estimados;

/**
 *
 * @author moreno
 */
public class estimados {
    public String nombre,genero,gusto;

    public estimados(String nombre, String genero, String gusto) {
        this.nombre = nombre;
        this.genero = genero;
        this.gusto = gusto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGusto() {
        return gusto;
    }

    public void setGusto(String gusto) {
        this.gusto = gusto;
    }
    
}
