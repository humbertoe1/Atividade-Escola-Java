package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Professor extends Funcionario {
    protected ArrayList<Turma> turmas;
    protected Disciplina disciplina;

    public Professor(){}

    public Professor(String nome, String cpf, String rg, String cargo, BigDecimal salario, ArrayList<Turma> turmas, Disciplina disciplina){
        super(nome, cpf, rg, cargo, salario);
        this.turmas = turmas;
        this.disciplina = disciplina;
    }

    public void adicionarTurma(Turma turma){
        this.turmas.add(turma);
    }
    public void mudarDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
}
