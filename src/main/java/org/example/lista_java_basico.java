package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class lista_java_basico {

    public static void main(String[] args) {
        //questaoUm();
        //questaoDois();
        //questaoTres();
        //questaoQuatro();
        //questaoCinco();
        //questaoSeis();

    }

    private static void questaoSeis() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int integer = scanner.nextInt();

        System.out.println("O antecessor de " + integer + " é " + (integer - 1));
        System.out.println("E o sucessor de " + integer + " é " + (integer + 1));

        scanner.close();
    }

    private static void questaoCinco() {
        double salario_minimo = 1518.00;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quanto você ganha: ");
        double salario_usuario = scanner.nextDouble();

        double qtd_salarios = salario_usuario / salario_minimo;
        System.out.printf("O usuário ganha: %.2f\n salário(s) mínimo(s)", qtd_salarios);

        scanner.close();
    }

    private static void questaoQuatro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a porcentagem do IPI a ser acrescido no valor");
        double porcentagem_ipi = scanner.nextInt();
        double porcentagem_ipi_convertida = porcentagem_ipi / 100;

        int cod1 = 1;
        int cod2 = 2;

        System.out.println("Digite o valor unitário da peça 1");
        double peca_1 = scanner.nextDouble();
        System.out.println("Quantidade de peças 1");
        int quantidade_pecas_1 = scanner.nextInt();

        System.out.println("Digite o valor unitário da peça 2");
        double peca_2 = scanner.nextDouble();
        System.out.println("Quantidade de peças 2");
        int quantidade_pecas_2 = scanner.nextInt();

        double valor_total = (peca_1 * quantidade_pecas_1) + (peca_2 * quantidade_pecas_2) ;
        double valor_total_acrescentado = valor_total + (valor_total * porcentagem_ipi_convertida);
        System.out.println(valor_total_acrescentado);

        scanner.close();
    }

    private static void questaoTres() {
        double saldo = 1518.00;
        double saldo_reajustado = saldo + (saldo * 0.01);
        System.out.println("Seu saldo atual: ");
        System.out.println("R$ " + saldo);
        System.out.println("Seu saldo após o reajuste: ");
        System.out.println("R$ " + saldo_reajustado);
        System.out.println("Aumento de: R$ " + saldo*0.01);
    }

    private static void questaoDois() {

        double a, b, c, z, x, y, media, media2, media_media, soma;
        a = 8;
        b = 9;
        c = 7;
        x = 4;
        y = 5;
        z = 6;
        media = (a + b + c) / 3;
        media2 = (z + x + y)/ 3;
        soma = media + media2;
        media_media = (media + media2) / 2;

        System.out.println("Média 1: ");
        System.out.println(media);

        System.out.println("Média 2: ");
        System.out.println(media2);

        System.out.println("Soma das médias: ");
        System.out.println(soma);

        System.out.println("Média da média: ");
        System.out.println(media_media);

    }


    private static void questaoUm() {
        Scanner scanner = new Scanner(System.in);

        int dias_ano = 365;
        int dias_mes = 30;

        System.out.println("Digite quantos anos você tem de vida: ");
        int anos = scanner.nextInt();

        System.out.println("Digite quantos meses você tem de vida: ");
        int meses = scanner.nextInt();

        System.out.println("Digite quantos dias você tem de vida: ");
        int dias = scanner.nextInt();

        int anos_em_dias = anos * dias_ano;
        int meses_em_dias = meses * dias_mes;
        int total_dias = anos_em_dias + meses_em_dias + dias;

        System.out.println("Você tem: " + total_dias + " dias de vida.");

        scanner.close();
    }
}