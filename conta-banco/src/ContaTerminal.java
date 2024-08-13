import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: IMPORTAR CLASSE SCANNER
        // TODO: EXIBIR AS MENSAGENS PARA O NOSSO USUÁRIO
        // TODO: OBTER PELA SCANNER OS VALORES DIGITADOS NO TERMINAL
        // TODO: EXIBIR A MENSAGEM DE CONTA CRIADA

        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta();
        System.out.println("Por favor, digite o número da Agência!");
        conta.setAgencia(scanner.nextLine());


    }
}
