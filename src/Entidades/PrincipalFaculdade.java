package Entidades;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

/**
 * Classe PrincipalFaculdade Author Augusto <Luispiske1@gmail.com>
 * Data 24/05/2017 Hora 23:17:04 Pacote projetofaculdade
 */
public class PrincipalFaculdade {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        Faculdade n = new Faculdade("Faculdade de Tecnologia Senac Pelotas", "Rua: R Goncalves Chaves, 602, Centro, Pelotas, RS, CEP: 96015-560, Brasil", "03.422.707/0069-72", "(51) 3284-1967 / (51) 3284-1964");
        n.cadastrarCurso("Analise e Desenvolvimento de Sistemas", "6 Semestres", 1);
        n.cadastrarCurso("Redes de Computador", "6 Semestres", 1);
        
        n.cadastrarCurso("Desenho Arquitetônico", "1 Semestre", 2);
        n.cadastrarCurso("Sustentabilidade", "1 Semestre", 2);
        
        n.cadastrarCurso("Técnico em Comércio Exterior", "3 Semestres", 3);
        n.cadastrarCurso("Técnico de Guia de Turismo", "3 Semestres", 3);

        System.out.println("Seja Bem Vindo \n" + n.toString());
        System.out.println("Voce ja é aluno (S/N)");
        String ck = entrada.nextLine();
        if (ck.equalsIgnoreCase("N")) {

            System.out.println("Entao voce terá que se cadastrar: ");

            System.out.println("Nome: ");
            String nome = entrada.nextLine();
            System.out.println("Cpf: ");
            String cpf = entrada.nextLine();
            System.out.println("Telefone: ");
            String telefone = entrada.nextLine();
            System.out.println("Curso: ");
            String curso = entrada.nextLine();
           
            n.cadastraAluno(nome, cpf, telefone,curso);
        } else if (!ck.equalsIgnoreCase("S")) {
            System.out.println("Açao invalida!!");
            System.exit(0);
        }

        while (true) {
            System.out.println("Selecione uma das opçoes ou 4 para sair");
            System.out.println("Opçao escolher curso: ");
            System.out.println("Opçao 1 Graduação ");
            System.out.println("Opçao 2 Cursos Livres ");
            System.out.println("Opçao 3 Cursos Técnicos ");
            System.out.println("Opçao 4 Sair.");
            int X = entrada.nextInt();
            if (X == 0) {
                break;
            }
            switch (X) {
                case 1:
                    int y = 1;
                    System.out.println("Escolha um curso");
                    for (Curso elemento : n.listarCursosGraduacao()) {
                        System.out.println(y + " " + elemento.getNome());
                        y++;
                    }
                    int a = entrada.nextInt();
                    System.out.println(n.listarCursosGraduacao().get(a-1));
                    break;
                case 2:
                     int x = 1;
                    System.out.println("Escolha um curso");
                    for (Curso elemento : n.listarCursosLivre()) {
                        System.out.println(x + " " + elemento.getNome());
                        x++;
                    }
                    int b = entrada.nextInt();
                    System.out.println(n.listarCursosLivre().get(b-1));
                    break;
                case 3:
                     int z = 1;
                    System.out.println("Escolha um curso");
                    for (Curso elemento : n.listarCursosTecnico()) {
                        System.out.println(z + " " + elemento.getNome());
                        z++;
                    }
                    int c = entrada.nextInt();
                    System.out.println(n.listarCursosTecnico().get(c-1));
                    
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ação inválida!");

            }
        }

    }

}
