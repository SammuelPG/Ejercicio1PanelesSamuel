/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Curso {

    ArrayList<Asignatura> asignatura;
    private int codigo;
    private String denominacion;

    public Curso(ArrayList<Asignatura> asignatura, int codigo, String denominacion) {
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public Curso(int codigo) {
        this.codigo = codigo;
    }

    public Curso(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public void setAsignatura(ArrayList<Asignatura> asignatura) {
        this.asignatura = asignatura;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public ArrayList<Asignatura> getAsignatura() {
        return asignatura;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return denominacion;
    }

}
