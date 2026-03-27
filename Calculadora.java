import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso(ex: 70,5):");
        double peso = scanner.nextDouble();
        System.out.println("Digite a sua altura(ex:1,75):");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é:" + imc);

    }
}