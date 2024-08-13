public class Conta {

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Boolean saldo;

    public Conta() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Boolean getSaldo() {
        return saldo;
    }

    public void setSaldo(Boolean saldo) {
        this.saldo = saldo;
    }
}
