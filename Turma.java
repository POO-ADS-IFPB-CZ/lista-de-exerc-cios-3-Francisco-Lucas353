package Questão1;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public ArrayList<Aluno> listarAprovados() {
        ArrayList<Aluno> aprovados = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.estaAprovado()) {
                aprovados.add(aluno);
            }
        }
        return aprovados;
    }

    public ArrayList<Aluno> listarReprovados() {
        ArrayList<Aluno> reprovados = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (!aluno.estaAprovado()) {
                reprovados.add(aluno);
            }
        }
        return reprovados;
    }
}

