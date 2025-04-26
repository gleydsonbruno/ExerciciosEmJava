import java.util.*;

public class lista_java_condicional {



    public static void main(String[] args) {
        //questaoUm();
        //questaoDois();


    }

    private static void questaoDois() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        float peso = scanner.nextFloat();
        System.out.println("Informe sua altura em metros (ex: 1.75) : ");
        float altura = scanner.nextFloat();

        float imc = getImc(altura, peso);
        verifyImc(imc);


        scanner.close();
    }

    public static float getImc(float altura, float peso) {
        return peso / (altura * altura);
    }

    public static float verifyImc(float value) {
        if (value < 20) {
            System.out.printf("IMC de: %.2f - Abaixo do peso normal", value);
        } else if (value >= 20 && value < 25) {
            System.out.printf("IMC de: %.2f - Peso normal", value);
        } else if (value >= 25 && value < 30) {
            System.out.printf("IMC de: %.2f - Sobrepeso", value);
        } else if (value >= 30 && value < 40) {
            System.out.printf("IMC de: %.2f - Obeso", value);
        } else {
            System.out.printf("IMC de: %.2f - Obeso mórbido", value);
        }

        return value;
    }

    private static void questaoUm() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " é divisível por 2" );
        } else if (number % 5 == 0){
            System.out.println(number + " é divisível por 5" );

        } else if (number % 10 == 0) {
            System.out.println(number + " é divisível por 10" );
        } else {
            System.out.println(number + " não é divisível por 2, 5 ou 10");
        }

        scanner.close();
    }
}
