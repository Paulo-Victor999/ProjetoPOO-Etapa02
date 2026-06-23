public class PagamentoConvenio extends Pagamento{
    public PagamentoConvenio(int indiceConsulta, double valorFinal, String tipoPagamento){
        super(indiceConsulta, valorFinal, tipoPagamento);
    }
    @Override
    public double calcularValorFinal(){
        return getValorFinal();
    }

}
