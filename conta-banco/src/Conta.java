import java.text.NumberFormat;

/**
 * Representa uma conta bancária.
 *
 * Esta classe armazena informações sobre uma conta bancária, incluindo o número da conta,
 * a agência, o nome do cliente e o saldo. Também fornece métodos para acessar e atualizar
 * essas informações, além de gerar uma representação em string da conta.
 *
 * <p>Os atributos são acessíveis e modificáveis através dos métodos getters e setters.</p>
 *
 * @author Suzan Stockey Pereira
 * @version 20240815
 */

public class Conta {

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    /**
     * Cria uma nova instância de {@code Conta} com valores padrão.
     */
    public Conta() {
    }

    /**
     * Retorna o número da conta.
     *
     * @return o número da conta
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * Define o número da conta.
     *
     * @param numero o novo número da conta
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * Retorna a agência da conta.
     *
     * @return a agência da conta
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define a agência da conta.
     *
     * @param agencia a nova agência da conta
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Retorna o nome do cliente associado à conta.
     *
     * @return o nome do cliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Define o nome do cliente associado à conta.
     *
     * @param nomeCliente o novo nome do cliente
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * Retorna o saldo da conta.
     *
     * @return o saldo da conta
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * Define o saldo da conta.
     *
     * @param saldo o novo saldo da conta
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * Retorna uma representação em string das informações da conta.
     *
     * A representação inclui uma mensagem personalizada para o cliente, mostrando
     * o nome do cliente, a agência, o número da conta e o saldo formatado como moeda.
     *
     * @return uma string contendo as informações da conta formatadas
     */
    public String toString() {
        String saldo = NumberFormat.getCurrencyInstance().format(this.saldo);
        StringBuilder sb = new StringBuilder();
        sb.append("Olá ");
        sb.append(nomeCliente);
        sb.append(", obrigado por criar uma conta em nosso banco, sua agência é ");
        sb.append(agencia);
        sb.append(", conta ");
        sb.append(numero);
        sb.append(" e seu saldo ");
        sb.append(saldo);
        sb.append(" já está disponível para saque");
        return sb.toString();
    }
}
