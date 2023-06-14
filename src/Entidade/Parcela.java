package Entidade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	
	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate data;
	private Double parcelas;
	
	public Parcela(LocalDate data, Double parcelas) {
		this.data = data;
		this.parcelas = parcelas;
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getParcelas() {
		return parcelas;
	}

	public void setParcelas(Double parcelas) {
		this.parcelas = parcelas;
	}

	@Override
	public String toString() {
		return data.format(fmt) + " - " + parcelas ;
	}
	
	

	

}
