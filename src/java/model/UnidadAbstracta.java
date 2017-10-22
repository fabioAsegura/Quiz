/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class UnidadAbstracta {
    private int Id_UnidadAbstracta;
    private int Id_tabla;

    public UnidadAbstracta(int Id_UnidadAbstracta, int Id_tabla) {
        this.Id_UnidadAbstracta = Id_UnidadAbstracta;
        this.Id_tabla = Id_tabla;
    }

    public int getId_UnidadAbstracta() {
        return Id_UnidadAbstracta;
    }

    public void setId_UnidadAbstracta(int Id_UnidadAbstracta) {
        this.Id_UnidadAbstracta = Id_UnidadAbstracta;
    }

    public int getId_tabla() {
        return Id_tabla;
    }

    public void setId_tabla(int Id_tabla) {
        this.Id_tabla = Id_tabla;
    }
    
}
