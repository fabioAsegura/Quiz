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
public class ContextoNavegacionM {
   private int Id_contexto;
   private String Link;
   private int id_UnidadAbstracta;

    public int getId_contexto() {
        return Id_contexto;
    }

    public void setId_contexto(int Id_contexto) {
        this.Id_contexto = Id_contexto;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public int getid_UnidadAbstracta() {
        return id_UnidadAbstracta;
    }

    public void setid_UnidadAbstracta(int id_UnidadAbstracta) {
        this.id_UnidadAbstracta = id_UnidadAbstracta;
    }

    public ContextoNavegacionM(int Id_contexto, String Link, int id_UnidadAbstracta) {
        this.Id_contexto = Id_contexto;
        this.Link = Link;
        this.id_UnidadAbstracta = id_UnidadAbstracta;
    }

   
   
}
