package servicos;

public class PagamentoServico implements PagamentoOnline{

	@Override
	public double taxaPagamento(double quantia) {
		return quantia * 0.02;
	}

	@Override
	public double pagamento(double quantia, int meses) {
		return quantia * 0.01 * meses;
	}

}
