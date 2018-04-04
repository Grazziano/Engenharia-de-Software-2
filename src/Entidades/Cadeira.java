package Entidades;

import java.util.ArrayList;

/**
 *Classe Cadeira
 *Author Augusto <Luispiske1@gmail.com>
 *Data  24/05/2017
 *Hora 23:07:05
 *Pacote projetofaculdade
 */
public class Cadeira {
    ArrayList< Turma > listaturma = new ArrayList< Turma >();
    private String nome;
    private String codigo;
    private String turno;
    double preco;

    public ArrayList<Turma> getListaturma() {
        return listaturma;
    }

    public void setListaturma(ArrayList<Turma> listaturma) {
        this.listaturma = listaturma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    

}
