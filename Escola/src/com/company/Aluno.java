package com.company;

public class Aluno extends Pessoa{
    protected int idade;
    protected Turma turma;
    protected double[][] mediaPorDisciplina = new double[6][1];
    protected double[][] notasPorDisciplina = new double[6][3];

    public Aluno(String nome, String cpf, String rg, Turma turma, int idade){
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
    }

    public void setTurma(Turma turma){
        this.turma = turma;
    }

    public void adicionarNota(int materia, int numeroDaProva, double nota){
        mediaPorDisciplina[materia][numeroDaProva] = nota;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public Turma getTurma(){
        return this.turma;
    }

    public double[][] getNotas(){
        return notasPorDisciplina;
    }
    public double[][] getMedias(){
        return mediaPorDisciplina;
    }

}
