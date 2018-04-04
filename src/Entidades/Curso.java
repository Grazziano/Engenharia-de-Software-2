package Entidades;

import java.util.ArrayList;

/**
 *Classe Curso
 *Author Augusto <Luispiske1@gmail.com>
 *Data  24/05/2017
 *Hora 22:58:05
 *Pacote projetofaculdade
 */
public class Curso {
    private ArrayList< Semestre > listasemestre = new ArrayList< Semestre >();
    private String nome;
    private String semestres;

    @Override
    public String toString() {
        return "Curso " + "nome: " + nome + "\nsemestres: " + semestres;
    }

    public Curso(String nome, String semestres) {
        this.nome = nome;
        this.semestres = semestres;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSemestres() {
        return semestres;
    }

    public void setSemestres(String semestres) {
        this.semestres = semestres;
    }

}
