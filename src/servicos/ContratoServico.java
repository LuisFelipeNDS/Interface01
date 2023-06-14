package servicos;

import java.time.LocalDate;

import Entidade.Contrato;
import Entidade.Parcela;

public class ContratoServico {
	
	private PagamentoOnline pagamentoOline;

	public ContratoServico(PagamentoOnline pagamentoOline) {
		this.pagamentoOline = pagamentoOline;
	}
	
	public void processaContrato(Contrato contrato, int meses) {
		
		double parcela = contrato.getValorTotal() / meses;
		
		for(int i= 1; i <= meses; i++) {
			
			LocalDate vencimento = contrato.getData().plusMonths(i);
			double juros = pagamentoOline.pagamento(parcela, i);
			double taxa = pagamentoOline.taxaPagamento(parcela + juros);
			double parcelaMes = parcela + juros + taxa;
			
			contrato.getParcela().add(new Parcela(vencimento, parcelaMes));
		}
		
	}

}
