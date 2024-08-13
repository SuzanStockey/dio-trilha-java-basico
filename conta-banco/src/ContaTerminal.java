import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta();
        System.out.println("Por favor, digite o número da Agência!");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o número da Conta!");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente!");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o Saldo da Conta!");
        conta.setSaldo(scanner.nextDouble());
        scanner.nextLine();

        System.out.println(conta.toString());

    }
}
