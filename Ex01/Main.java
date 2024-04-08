import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora basica");
        System.out.println("Insira o primeiro numero");
        double numeroUm = sc.nextDouble();

        System.out.println("Insira o segundo numero");
        double numeroDois = sc.nextDouble();

        System.out.println("Qual operação que realiazar");

        System.out.println("1 - adição");
        System.out.println("2 - subtração");
        System.out.println("3 - mutiplicação");
        System.out.println("4 - divisão");

        int operacao = sc.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado da adição: " + calculadora.adicionar(numeroUm, numeroDois));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + calculadora.subtrair(numeroUm, numeroDois));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(numeroUm, numeroDois));
                break;
            case 4:
                System.out.println("Resultado da divisão: " + calculadora.dividir(numeroUm, numeroDois));
                break;
            default:
                System.out.println("Operação inválida");

    }
}
}
