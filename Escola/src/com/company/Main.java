package com.company;

import java.math.BigDecimal;
import java.rmi.UnexpectedException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome, cargo, cpf, rg, disciplina;
        char letraDaTurma;
        int idade;
        Turma turma;
        BigDecimal salario;
        Aluno aluno;
        Funcionario funcionario;
        Professor professor;
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Comece dando um nome a sua Escola: ");
        Escola escola = new Escola(scanner.nextLine());
        System.out.println("--BEM VINDO AO SISTEMA DA ESCOLA " + escola.getNome().toUpperCase() + "---");

        while(opcao != -1){
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("Digite a letra da Turma:");
                    letraDaTurma = scanner.next().charAt(0);
                    escola.adicionarTurma(new Turma(letraDaTurma));
                    break;
                case 2:
                    System.out.println("Nome: ");
                    nome = scanner.nextLine();
                    System.out.println("CPF: ");
                    cpf = scanner.nextLine();
                    System.out.println("RG: ");
                    rg = scanner.nextLine();
                    cargo = "Professor";
                    System.out.println("Salario");
                    salario = scanner.nextBigDecimal();
                    scanner.nextLine();
                    System.out.println("Disciplina: ");
                    disciplina = scanner.nextLine();

                    escola.adicionarProfessor(new Professor(nome, cpf, rg, cargo, salario, disciplina));
                    break;
                case 3:
                    System.out.println("Nome: ");
                    nome = scanner.nextLine();
                    System.out.println("CPF: ");
                    cpf = scanner.nextLine();
                    System.out.println("RG: ");
                    rg = scanner.nextLine();
                    System.out.println("Cargo: ");
                    cargo = scanner.nextLine();
                    System.out.println("Salario");
                    salario = scanner.nextBigDecimal();

                    escola.adicionarFuncionario(new Funcionario(nome, cpf, rg, cargo, salario));
                    break;
                case 4:
                    System.out.println("Nome: ");
                    nome = scanner.nextLine();
                    System.out.println("CPF: ");
                    cpf = scanner.nextLine();
                    System.out.println("RG: ");
                    rg = scanner.nextLine();
                    System.out.println("Turma(VAMOS LISTAR AS TURMAS, ESCOLHA UMA DAS LETRAS): ");
                    do {
                        escola.listarTurmas();
                        letraDaTurma = scanner.next().charAt(0);
                        turma = escola.escolherTurma(letraDaTurma);
                        if(turma == null){
                            System.out.println("Turma não cadastrada escolha outra!");
                        }
                    }while(turma !=null);
                    System.out.println("Idade: ");
                    idade = scanner.nextInt();

                    escola.matricularAluno(new Aluno(nome, cpf, rg, turma, idade));
                    break;
                case 5:
                    System.out.println("Veja a lista: ");
                    escola.listarProfessores();
                    System.out.println("Digite o cpf do Professor a ser removido:");
                    escola.removerProfessor(escola.acharProfessor(scanner.nextLine()));
                    break;
                case 6:
                    System.out.println("Veja a lista: ");
                    escola.listarFuncionarios();
                    System.out.println("Digite o cpf do Funcionario que vai ser removido");
                    escola.removerFuncionario(escola.acharFuncionario(scanner.nextLine()));
                    break;
                case 7:
                    System.out.println("Veja a lista: ");
                    escola.listarAlunos();
                    System.out.println("Digite o cpf do Aluno que vai ser removido");
                    escola.removerAluno(escola.acharAluno(scanner.nextLine()));
                    break;
                case 8:
                    System.out.println("Atualizar cadastro de: \n[1]Professor?\n[2]Funcionario\n[3]Aluno");
                    opcao = scanner.nextInt();
                    switch(opcao){
                        case 1:
                            System.out.println("Escolha um professor pelo CPF: ");
                            escola.listarProfessores();
                            cpf = scanner.nextLine();
                            professor = escola.acharProfessor(cpf);
                            System.out.println("O que voce quer mudar?");
                            System.out.println("[1]Nome\n[2]CPF\n[3]RG\n[4]Salario\n[5]Disciplina");
                            opcao = scanner.nextInt();
                            switch (opcao){
                                case 1:
                                    System.out.println("Nome: " + professor.getNome());
                                    System.out.println("Novo nome: ");
                                    professor.setNome(scanner.nextLine());
                                    break;
                                case 2:
                                    System.out.println("CPF: " + professor.getCpf());
                                    System.out.println("Novo CPF: ");
                                    professor.setCpf(scanner.nextLine());
                                    break;
                                case 3:
                                    System.out.println("RG: " + professor.getRg());
                                    System.out.println("Novo RG: ");
                                    professor.setRg(scanner.nextLine());
                                    break;
                                case 4:
                                    System.out.println("Salario: " + professor.getSalario());
                                    System.out.println("Novo Salario: ");
                                    professor.setSalario(scanner.nextBigDecimal());
                                    break;
                                case 5:
                                    System.out.println("Disciplina: " + professor.getDisciplina());
                                    System.out.println("Nova disciplina: ");
                                    professor.setDisciplina(scanner.nextLine());
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                                    continue;
                            }
                            escola.atualizarProfessor(cpf, professor);
                            break;
                        case 2:
                            System.out.println("Escolha um funcionario pelo CPF: ");
                            escola.listarFuncionarios();
                            cpf = scanner.nextLine();
                            funcionario = escola.acharFuncionario(cpf);
                            System.out.println("O que voce quer mudar?");
                            System.out.println("[1]Nome\n[2]CPF\n[3]RG\n[4]Salario\n[5]Cargo");
                            switch (opcao){
                                case 1:
                                    System.out.println("Nome: " + funcionario.getNome());
                                    System.out.println("Novo nome: ");
                                    funcionario.setNome(scanner.nextLine());
                                    break;
                                case 2:
                                    System.out.println("CPF: " + funcionario.getCpf());
                                    System.out.println("Novo CPF: ");
                                    funcionario.setCpf(scanner.nextLine());
                                    break;
                                case 3:
                                    System.out.println("RG: " + funcionario.getRg());
                                    System.out.println("Novo RG: ");
                                    funcionario.setRg(scanner.nextLine());
                                    break;
                                case 4:
                                    System.out.println("Salario: " + funcionario.getSalario());
                                    System.out.println("Novo Salario: ");
                                    funcionario.setSalario(scanner.nextBigDecimal());
                                    break;
                                case 5:
                                    System.out.println("Disciplina: " + funcionario.getCargo());
                                    System.out.println("Nova disciplina: ");
                                    funcionario.setCargo(scanner.nextLine());
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                                    continue;
                            }
                            escola.atualizarFuncionario(cpf, funcionario);
                            break;
                        case 3:
                            System.out.println("Escolha um Aluno pelo CPF: ");
                            escola.listarAlunos();
                            cpf = scanner.nextLine();
                            aluno = escola.acharAluno(cpf);
                            System.out.println("O que voce quer mudar?");
                            System.out.println("[1]Nome\n[2]CPF\n[3]RG\n[4]Turma\n[5]Idade");
                            opcao = scanner.nextInt();
                            switch (opcao){
                                case 1:
                                    System.out.println("Nome: " + aluno.getNome());
                                    System.out.println("Novo nome: ");
                                    aluno.setNome(scanner.nextLine());
                                    break;
                                case 2:
                                    System.out.println("CPF: " + aluno.getCpf());
                                    System.out.println("Novo CPF: ");
                                    aluno.setCpf(scanner.nextLine());
                                    break;
                                case 3:
                                    System.out.println("RG: " + aluno.getRg());
                                    System.out.println("Novo RG: ");
                                    aluno.setRg(scanner.nextLine());
                                    break;
                                case 4:
                                    System.out.println("Salario: " + aluno.getTurma().getLetraDaTurma());
                                    System.out.println("Novo Salario: ");
                                    aluno.setTurma(escola.escolherTurma(scanner.nextLine().charAt(0)));
                                    break;
                                case 5:
                                    System.out.println("Idade: " + aluno.getIdade());
                                    System.out.println("Nova Idade: ");
                                    aluno.setIdade(scanner.nextInt());
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                                    continue;
                            }
                            escola.atualizarAluno(cpf, aluno);
                            break;
                        default:
                            System.out.println("Opcao invalida");
                            break;
                    }
                default:
                    System.out.println("Opcao invalida, tente novamente.");
                    break;
                    }
            }


    }
}
