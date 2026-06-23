public class PagamentoDinheiro extends Pagamento{
    public PagamentoDinheiro(int indiceConsulta, double valorFinal, String tipoPagamento){
        super(indiceConsulta, valorFinal, tipoPagamento);
    }
    @Override
    public double calcularValorFinal(){
        return getValorFinal();
    }

}
