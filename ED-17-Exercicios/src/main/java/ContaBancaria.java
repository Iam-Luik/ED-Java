public class ContaBancaria {
    private Integer numero;
    private Double saldo;

    public ContaBancaria(Integer numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public Boolean debitar(Double valor){
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente");
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s\n", "CONTA", "SALDO") + String.format("%010d %015.2f", getNumero(), getSaldo());
    }
}
