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

    public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Olá ");
    sb.append(nomeCliente);
    sb.append(", obrigado por criar uma conta em nosso banco, sua agência é ");
    sb.append(agencia);
    sb.append(", conta ");
    sb.append(numero);
    sb.append(" e seu saldo ");
    sb.append(conta.getSaldo());
    sb.append(" já está disponível para saque");
    return sb.toString();
}
