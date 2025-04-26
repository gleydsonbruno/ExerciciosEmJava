package org.estudo.poo.model;

public abstract class Funcionario {
    // atributos que recebem os parâmetros
    private String nome;
    private float salario;
    private String cpf;


    // construtores
    public Funcionario() {
        // construtor vazio
        nome = "";
        salario = 0;
        cpf = "";
    }

    public Funcionario(String nome, float salario, String cpf) {
        // parâmetros
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    // métodos gets(metodo que tem retorno) e set ()
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // métodos da lógica do negócio

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("CPF: " + cpf);
    }

    public abstract void falar();



}
