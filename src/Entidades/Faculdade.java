package Entidades;

import java.util.ArrayList;

/**
 * Classe Faculdade Author Augusto <Luispiske1@gmail.com>
 * Data 24/05/2017 Hora 22:54:10 Pacote projetofaculdade
 */
public class Faculdade {

    ArrayList< Curso> listacursograduacao = new ArrayList< >();
    ArrayList< Curso> listacursolivre = new ArrayList< >();
    ArrayList< Curso> listacursotecnico = new ArrayList< >();
    ArrayList< Aluno> listaaluno = new ArrayList< >();

    @Override
    public String toString() {
        return  nome + "\nendereco: " + endereco + "\ncnpj: " + cnpj + "\ntelefone: " + telefone;
    }

    public Faculdade(String nome, String endereco, String cnpj, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }
    String nome;
    String endereco;
    String cnpj;
    String telefone;

    void cadastraAluno(String nome, String cpf, String telefone,String curso) {
        Aluno aluno = new Aluno(nome, cpf, telefone,curso);
        
        listaaluno.add(aluno);
    }

       ArrayList<Aluno> listarAlunos() {
        return listaaluno;
    }

    void cadastrarCurso(String nome, String semestres,int tipo){
        Curso curso = new Curso(nome, semestres);
            if (tipo == 1) {
            listacursograduacao.add(curso);    
        }else if(tipo == 2){
            listacursolivre.add(curso);
        }else if(tipo == 3){
            listacursotecnico.add(curso);
        }
      
   
    }
    ArrayList<Curso> listarCursosGraduacao() {
        return listacursograduacao;
    }
    ArrayList<Curso> listarCursosLivre() {
        return listacursolivre;
    }
    ArrayList<Curso> listarCursosTecnico() {
        return listacursotecnico;
    }
    
    
}
