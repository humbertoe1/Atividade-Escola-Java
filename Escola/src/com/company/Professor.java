package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;

public class Professor extends Funcionario {
    protected HashSet<Turma> turmas;
    protected String disciplina;

    public Professor(){}

    public Professor(String nome, String cpf, String rg, String cargo, BigDecimal salario, String disciplina){
        super(nome, cpf, rg, cargo, salario);
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return this.disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public void adicionarTurma(Turma turma){
        this.turmas.add(turma);
    }
    public void mudarDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
}
