/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import encriptar.Encriptar;
import java.util.ArrayList;
import modelo.Alumno;
import modelo.Asignatura;
import modelo.Curso;
import modelo.Usuario;

/**
 *
 * @author dam
 */
public class Empresa {

    ArrayList<Usuario> usuarios;
    ArrayList<Asignatura> asignaturas;
    ArrayList<Curso> cursos;
    ArrayList<Alumno> alumnos;

    public Empresa() {
        usuarios = new ArrayList<>();
        asignaturas = new ArrayList<>();
        cursos = new ArrayList<>();
        alumnos = new ArrayList<>();
    }

    public void anadirUsuarios(Usuario u) {
        usuarios.add(u);
    }

    public void anadirAsignaturas(Asignatura a) {
        asignaturas.add(a);
    }

    public void anadirCursos(Curso c) {
        cursos.add(c);
    }

    public boolean buscarUsuario(String login, String contra) {
        int pos;
        boolean resultado = false;
        pos = usuarios.indexOf(new Usuario(login));
        if (pos != -1) {
            resultado = usuarios.get(pos).getContra().equals(Encriptar.getMD5(contra));
        }
        return resultado;
    }

    public boolean exixsteCurso(int codigo) {
        return cursos.contains(new Curso(codigo));
    }

    public int existeAlumno(String dni) {
        int posicion = alumnos.indexOf(new Alumno(dni));
        return posicion;
    }

    public boolean existeAlumno2(String dni) {
        return alumnos.contains(new Alumno(dni));
    }

    public void anadirAlumno(String dni, String nombre, Curso curso) {
        alumnos.add(new Alumno(dni, nombre, curso));
    }

    public void anadirCurso(ArrayList<Asignatura> asignatura, int codigo, String denominacion) {
        cursos.add(new Curso(asignatura, codigo, denominacion));
    }

    public boolean buscarCurso(int codigoCurso) {
        return cursos.contains(new Curso(codigoCurso));
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public Alumno getUnAlumno(int pos) {
        return alumnos.get(pos);
    }

    public Alumno existeUnAlumno(String dni) {
        Alumno a = null;
        int pos;
       //pos = alumnos.indexOf(new Alumno(dni));
        pos= existeAlumno(dni);
        if (pos != -1) {
            a = alumnos.get(pos);
        }
        return a;
    }

}
