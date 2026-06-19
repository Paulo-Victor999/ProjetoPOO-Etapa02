public abstract class Pagamentos {
    private int indiceConsulta;
    private double valorFinal;
    private String tipoPagamento;
    private int parcelas;

    //getters por conta do encapsulamento
    public int getIndiceConsulta(){
        return indiceConsulta;
    }
    public double getValorFinal(){
        return valorFinal;
    }
    public String getTipoPagamento(){
        return tipoPagamento;
    }
    public int getParcelas(){
        return parcelas;
    }

    //Pagamento comum, dinheiro ou pix sem parcela
    public Pagamentos(int indiceConsulta, double valorFinal, String tipoPagamento) {
        this.indiceConsulta = indiceConsulta;
        this.valorFinal = valorFinal;
        this.tipoPagamento = tipoPagamento;
        this.parcelas = 1;
    }
    //possivel parcelar / cartao
    public Pagamentos(int indiceConsulta, double valorFinal, String tipoPagamento, int parcelas) {
        this.indiceConsulta = indiceConsulta;
        this.valorFinal = valorFinal;
        this.tipoPagamento = tipoPagamento;
        this.parcelas = parcelas;
    }

    public abstract double calcularValorFinal();
}

public class PagamentoCartao extends Pagamentos{
    public PagamentoCartao(int indiceConsulta, double valorFinal, String tipoPagamento, int parcelas){
        super(indiceConsulta, valorFinal, tipoPagamento, parcelas);
    }

}

public class PagamentoDinheiro extends Pagamentos{
    public PagamentoDinheiro(int indiceConsulta, double valorFinal, String tipoPagamento){
        super(indiceConsulta, valorFinal, tipoPagamento);
    }

}

public class PagamentoConvenio extends Pagamentos{
    public PagamentoConvenio(int indiceConsulta, double valorFinal, String tipoPagamento){
        super(indiceConsulta, valorFinal, tipoPagamento);
    }

}