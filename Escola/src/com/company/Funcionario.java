package com.company;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {
    protected String cargo;
    protected BigDecimal salario;

    public Funcionario(){

    }

    public Funcionario(String nome, String cpf, String rg, String cargo, BigDecimal salario){
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }

    public BigDecimal getSalario(){
        return this.salario;
    }
    public String getCargo(){
        return this.cargo;
    }

}
