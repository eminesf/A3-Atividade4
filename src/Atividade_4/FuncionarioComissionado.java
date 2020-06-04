package Atividade_4;

public class FuncionarioComissionado {
	
	private String nome;
	private String cpf;
	private Double taxaComissao;
	private Double vendasBrutas;
	private Double rendimentos = 0.0;

	public FuncionarioComissionado(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// nao criei set de cpf pq nao tem pq mudar de cpf
	public String getCpf() {
		return cpf;
	}

	public Double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(Double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

	public Double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(Double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}
	
	public void rendimentos(Double vendasBrutas) {
		setVendasBrutas(vendasBrutas);
		rendimentos = getTaxaComissao() * getVendasBrutas();
	}
	
	public Double getRendimentos() {
		return rendimentos;
	}
	
	public void setRendimentos(Double rendimentos) {
		this.rendimentos = rendimentos;
	}
	
	
}
