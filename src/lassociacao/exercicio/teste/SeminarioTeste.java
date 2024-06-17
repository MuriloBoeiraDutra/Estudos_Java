package lassociacao.exercicio.teste;

import lassociacao.exercicio.dominio.Aluno;
import lassociacao.exercicio.dominio.Local;
import lassociacao.exercicio.dominio.Professor;
import lassociacao.exercicio.dominio.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {

        Local local_seminario_um = new Local("Casa do Pietro");

        Aluno aluno1 = new Aluno("José", 20);
        Aluno aluno2 = new Aluno("Paralol", 20);
        Aluno aluno3 = new Aluno("Pietro", 20);
        Aluno[] alunos = {aluno1, aluno2, aluno3};

        Professor professor1 = new Professor("Murilo", "Tal");

        Seminario seminario1 = new Seminario("#Como realizar tal ato", alunos, local_seminario_um);
        Seminario seminario2 = new Seminario("Como fazer tiktok");

        Seminario[] seminarios = {seminario1, seminario2};

        professor1.setSeminarios(new Seminario[] {seminarios[0]});

        seminario1.imprime();
    }
}
