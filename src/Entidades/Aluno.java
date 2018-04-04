package Entidades;

import java.time.LocalDate;

/**
 *Classe Aluno
 *Author Augusto <Luispiske1@gmail.com>
 *Data  24/05/2017
 *Hora 23:10:46
 *Pacote projetofaculdade
 */
public class Aluno {
    private String nome;
    private String cpf;
    private String telefone;
    //private String matricula;
    //private LocalDate dataDeNascimento;
    private String curso;

    public Aluno(String nome, String cpf, String telefone, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.curso = curso;
    }


    

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    

}
