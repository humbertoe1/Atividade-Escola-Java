package com.company;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String rg;

    public Pessoa(){

    }
    public Pessoa(String nome, String cpf, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getRg(){
        return this.rg;
    }
}
