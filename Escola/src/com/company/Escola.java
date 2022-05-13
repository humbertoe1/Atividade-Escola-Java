package com.company;

import java.util.HashSet;

public class Escola {
    private String nome;

    public HashSet<Aluno> alunos;
    public HashSet<Professor> professores;
    public HashSet<Funcionario> funcionarios;
    public HashSet<Turma> turmas;
    protected static String[] disciplinas = new String[] {"Matematica", "Ciencias", "Inglês", "Português", "Artes"};

    public Escola(String nome){
        this.nome = nome;
        this.alunos = new HashSet<>();
        this.professores = new HashSet<>();
        this.funcionarios = new HashSet<>();
        this.turmas = new HashSet<>();
    }
    public String getNome(){
        return this.nome;
    }
    //métodos relacionados a aluno:
    public void listarAlunos(){
        for (Aluno aluno: this.alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("RG: " + aluno.getRg());
            System.out.println("Turma: " + aluno.getTurma().getLetraDaTurma());
            System.out.println("Idade: " +aluno.getIdade());

        }
    }
    public Aluno acharAluno(String cpf){
        for (Aluno aluno: this.alunos) {
            if(cpf.equals(aluno.cpf))
                return aluno;
        }
        System.out.println("Aluno não encontrado!!");
        return null;
    }
    public void matricularAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public void removerAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }

    public void atualizarAluno(String cpf, Aluno alunoAtualizado){
        for (Aluno aluno: this.alunos) {
            if(cpf.equals(aluno.cpf));
            aluno = alunoAtualizado;
        }
    }

    //MÉTODOS RELACIONADOS A PROFESSOR:
    public void atualizarProfessor(String cpf, Professor professorAtualizado){
        for (Professor professor: this.professores) {
            if(cpf.equals(professor.getCpf())){
                professor = professorAtualizado;
            }
        }
    }
    public void listarProfessores(){
        for (Professor professor: this.professores) {
            System.out.println("Professor: " + professor.getNome());
            System.out.println("CPF: " + professor.getCpf());
            System.out.println("RG: " + professor.getRg());
            //Depois pensar em como listar turmas do prof
            System.out.println("Disciplina ensinada: " + professor.getDisciplina());
            System.out.println("Remuneração Atual: R$ " + professor.getSalario());

        }
    }
    public Professor acharProfessor(String cpf){
        for (Professor professor: this.professores) {
            if(cpf.equals(professor.cpf)){
                return professor;
            }
        }
        System.out.println("Professor não encontrado!!");
        return null;
    }
    public void adicionarProfessor(Professor professor){
        this.professores.add(professor);
    }

    public void removerProfessor(Professor professor){
        this.professores.remove(professor);
    }

    //MÉTODOS RELACIONADOS A FUNCIONARIOS:
    public void listarFuncionarios(){
        for (Funcionario funcionario: this.funcionarios) {
            System.out.println("Funcionario: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("RG: " + funcionario.getRg());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Remuneração Atual: R$ " + funcionario.getSalario());
        }
    }
    public Funcionario acharFuncionario(String cpf){
        for (Funcionario funcionario: this.funcionarios) {
            if(cpf.equals(funcionario.cpf)){
                return funcionario;
            }
        }
        System.out.println("Funcionario não encontrado!");
        return  null;
    }
    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }
    public void atualizarFuncionario(String cpf, Funcionario funcionarioAtualizado){
        for (Funcionario funcionario: this.funcionarios) {
            if(cpf.equals(funcionario.getCpf())){
                funcionario = funcionarioAtualizado;
            }
        }
    }


    //métodos relacionados a turmas.
    public void adicionarTurma(Turma turma) {this.turmas.add(turma);}
    public void removerTurma(Turma turma) {this.turmas.remove(turma);}
    public void listarTurmas(){
        for (Turma turma: this.turmas) {
            System.out.println("TURMA: " + turma.getLetraDaTurma());
        }
    }
    public Turma escolherTurma(char letraDaTurma){
        for (Turma turma: this.turmas) {
            if(letraDaTurma == turma.getLetraDaTurma()){
                return turma;
            }
        }
        return null;
    }






}
