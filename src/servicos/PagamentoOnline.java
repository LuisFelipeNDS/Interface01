package servicos;

public interface PagamentoOnline {

	double taxaPagamento(double quantia);
	double pagamento(double quantia, int meses);
}
