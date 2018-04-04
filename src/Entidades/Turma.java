package Entidades;

import java.util.ArrayList;

/**
 *Classe Turma
 *Author Augusto <Luispiske1@gmail.com>
 *Data  24/05/2017
 *Hora 23:07:51
 *Pacote projetofaculdade
 */
public class Turma {
    private ArrayList< Aluno > listaaluno = new ArrayList< Aluno >();
    private String codigo;
    private Professor professor;

    public ArrayList< Aluno > getListaaluno() {
        return listaaluno;
    }

    public void setListaaluno(ArrayList< Aluno > listaaluno) {
        this.listaaluno = listaaluno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    

}
