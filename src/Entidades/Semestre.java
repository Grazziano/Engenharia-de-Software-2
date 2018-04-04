package Entidades;

import java.util.ArrayList;

/**
 *Classe Semestre
 *Author Augusto <Luispiske1@gmail.com>
 *Data  24/05/2017
 *Hora 23:05:07
 *Pacote projetofaculdade
 */
public class Semestre {
    int numero;
    ArrayList< Cadeira > listacadeira = new ArrayList< Cadeira >();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Cadeira> getListacadeira() {
        return listacadeira;
    }

    public void setListacadeira(ArrayList<Cadeira> listacadeira) {
        this.listacadeira = listacadeira;
    }
}
