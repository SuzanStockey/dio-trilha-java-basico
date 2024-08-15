import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe que representa o terminal para interação com a conta bancária.
 *
 * Esta classe contém o método {@code main}, que serve como ponto de entrada para a aplicação.
 * Ela permite que o usuário insira informações sobre uma conta bancária, como o número da agência,
 * número da conta, nome do cliente e saldo. Em seguida, exibe essas informações formatadas para o usuário.
 *
 * <p>O programa utiliza o console para obter entradas do usuário e trata erros de entrada para garantir
 * que o usuário insira valores válidos.</p>
 *
 * @author Suzan Stockey Pereira
 * @version 20240815
 */

public class ContaTerminal {

    /**
     * O ponto de entrada da aplicação.
     *
     * Este método é o ponto de entrada principal para a aplicação Java. Ele inicia a execução
     * do programa e solicita ao usuário que insira informações sobre a conta bancária. Após coletar
     * todas as informações, o método exibe uma representação formatada da conta usando o método {@code toString}.
     *
     * @param args um array de {@code String} que contém os argumentos passados na linha de comando
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta();
        System.out.println("Por favor, digite o número da Agência!");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o número da Conta!");
        boolean sucesso;
        do {
            sucesso = true;
            try {
                conta.setNumero(scanner.nextInt());
                scanner.nextLine();

            } catch (InputMismatchException e) {
                scanner.nextLine();
                sucesso = false;
                System.out.println("Valor incorreto para Número da Conta. Por favor, digite novamente.");
            }
        } while (!sucesso);

        System.out.println("Por favor, digite o Nome do Cliente!");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o Saldo da Conta!");
        do {
            sucesso = true;
            try {
                conta.setSaldo(scanner.nextDouble());
                scanner.nextLine();

            } catch (InputMismatchException e) {
                scanner.nextLine();
                sucesso = false;
                System.out.println("Valor incorreto para Saldo da Conta. Por favor, digite novamente.");
            }
        } while (!sucesso);


        System.out.println(conta.toString());

    }
}
