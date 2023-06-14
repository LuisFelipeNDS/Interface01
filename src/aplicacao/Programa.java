package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Entidade.Contrato;
import Entidade.Parcela;
import servicos.ContratoServico;
import servicos.PagamentoServico;

public class Programa {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int num = teclado.nextInt();
		System.out.println("Insira a data(dd/mm/yyyy): ");
		LocalDate data = LocalDate.parse(teclado.next(), fmt);
		System.out.println("Valor do contrato: ");
		double valorContrato = teclado.nextDouble();
		
		Contrato contrato = new Contrato(num, data, valorContrato);
		
		System.out.println("Qual o numero de parcelas desejadas para pagar ?");
		int parcelas = teclado.nextInt();
		
		ContratoServico cs = new ContratoServico(new PagamentoServico());
		
		cs.processaContrato(contrato, parcelas);
		
		System.out.println("Parcelas a pagar: ");
		
		for(Parcela c : contrato.getParcela()) {
			
			System.out.println(c.toString());
		}
	}
	
	

}
