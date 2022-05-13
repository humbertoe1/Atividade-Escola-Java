package com.company;

public class Aluno extends Pessoa{
    protected int idade;
    protected Turma turma;
    protected double[][] mediaPorDisciplina = new double[Escola.disciplinas.length][1];
    protected double[][] notasPorDisciplina = new double[Escola.disciplinas.length][3];


    public Aluno(String nome, String cpf, String rg, Turma turma, int idade){
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setTurma(Turma turma){
        this.turma = turma;
    }

    public void adicionarNota(int numeroDaDisciplina, int numeroDaProva, double nota){
        this.notasPorDisciplina[numeroDaDisciplina][numeroDaProva] = nota;
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
    public double getMediasPorDisciplina(int numeroDaDisciplia){
        return mediaPorDisciplina[numeroDaDisciplia][1];
    }
    public void calcularMedias(){
        for(int i = 0; i < this.mediaPorDisciplina.length; i++){
            for(int j = 0; j < this.notasPorDisciplina[i].length; j++){
                this.mediaPorDisciplina[i][1] = this.mediaPorDisciplina[i][1] + this.notasPorDisciplina[i][j];
            }
            this.mediaPorDisciplina[i][1] = this.mediaPorDisciplina[i][1]/3.0;
        }
    }

}
