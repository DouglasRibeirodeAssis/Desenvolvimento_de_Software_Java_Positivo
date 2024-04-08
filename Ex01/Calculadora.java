public class Calculadora {

    public static double adicionar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

    public static double subtrair(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

    public static double multiplicar(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    public static double dividir(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN;
        }
        return numeroUm / numeroDois;
    }
}

