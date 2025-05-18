package Questão1;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    private int contadorNotas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
        this.contadorNotas = 0;
    }

    public void cadastrarNota(double nota) {
        if (contadorNotas < 4) {
            notas[contadorNotas] = nota;
            contadorNotas++;
        } else {
            System.out.println("Limite de 4 notas atingido para o aluno " + nome);
        }
    }

    public double calcularMedia() {
        if (contadorNotas == 0) return 0.0;
        double soma = 0.0;
        for (int i = 0; i < contadorNotas; i++) {
            soma += notas[i];
        }
        return soma / contadorNotas;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return nome + " (Matrícula: " + matricula + ") - Média: " + String.format("%.2f", calcularMedia());
    }
}
