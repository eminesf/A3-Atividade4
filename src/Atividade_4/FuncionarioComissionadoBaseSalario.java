package Atividade_4;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado{
	
	private Double salario;

	public FuncionarioComissionadoBaseSalario(String nome, String cpf, Double salario) {
		super(nome, cpf);
		this.salario = salario;
	}
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public void rendimentos(Double vendasBrutas) {
		setVendasBrutas(vendasBrutas);
		setRendimentos(getTaxaComissao() * getVendasBrutas());
		setRendimentos(getRendimentos() + getSalario()); 
	}
	
	
}
