import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero3 = scanner.nextDouble();

        double media = (numero1+numero2+numero3) / 3;

        System.out.println("A media dos numeros e: " + media);

        scanner.close();
    }
}
