package org.estudo.poo.model;

public class Desenvolvedor extends Funcionario {
    //atributos
    private String linguagem;
    private String framework;

    public Desenvolvedor() {
        super();
        linguagem = "";
        framework = "";
    }

    public Desenvolvedor(String nome, float salario, String cpf, String linguagem, String framework) {
        super(nome, salario, cpf); // classe genérica - classe pai, classe funcionário
        this.linguagem = linguagem;
        this.framework = framework;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    // polimorfismo - sobreescrita
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Framework: " + framework);
    }

    @Override
    public void falar() {
        System.out.println("Estou falando! Sou um funcionário");
    }

    // polimorfismo - sobrecarga (overload)
    public void programar() {
        System.out.print("Estou programando");
    }

    public void programar(String opcao) {
        System.out.print("Estou programando mais rápido");
    }

    public void programar(int opcao) {
        System.out.print("Estou programando em " + opcao + "x");
    }
}
