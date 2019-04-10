/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sotosanchez
 */
@Entity
@Table(name = "tblpersona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findBySecpersona", query = "SELECT p FROM Persona p WHERE p.secpersona = :secpersona"),
    @NamedQuery(name = "Persona.findByIdentificacion", query = "SELECT p FROM Persona p WHERE p.identificacion = :identificacion"),
    @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre")})
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "secpersona")
    private Integer secpersona;
    @Column(name = "identificacion")
    private String identificacion;
    @Column(name = "nombre")
    private String nombre;

    public Persona() {
    }

    public Persona(Integer secpersona) {
        this.secpersona = secpersona;
    }

    public Integer getSecpersona() {
        return secpersona;
    }

    public void setSecpersona(Integer secpersona) {
        this.secpersona = secpersona;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secpersona != null ? secpersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.secpersona == null && other.secpersona != null) || (this.secpersona != null && !this.secpersona.equals(other.secpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Persona[ secpersona=" + secpersona + " ]";
    }
    
}
