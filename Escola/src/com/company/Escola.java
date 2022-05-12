package com.company;

import java.util.HashSet;

public class Escola {
    private String nome = "Escola Romana";

    private HashSet<Aluno> alunos;
    private HashSet<Professor> professores;
    private HashSet<Funcionario> funcionarios;

    //métodos relacionados a aluno:
    public void matricularAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public void removerAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }

    //MÉTODOS RELACIONADOS A PROFESSOR:
    public void adicionarProfessor(Professor professor){
        this.professores.add(professor);
    }

    public void removerProfessor(Professor professor){
        this.professores.remove(professor);
    }

    //MÉTODOS RELACIONADOS A FUNCIONARIOS:
    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario){
        this.removerFuncionario(funcionario);
    }



}
