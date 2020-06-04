package Atividade_4;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		FuncionarioComissionado pedro = new FuncionarioComissionado("Pedro", "01220020020");
		FuncionarioComissionadoBaseSalario maria = new FuncionarioComissionadoBaseSalario("Maria", "01220030040", 1300.0);
		
		// taxa de comissao setada manualmente de 4%
		pedro.setTaxaComissao(0.4);
		
		// por aqui coloca a venda bruta
		pedro.rendimentos(15000.0);
		
		// imprimi seus rendimentos/salario
		System.out.println(pedro.getRendimentos());
		
		
		// taxa de comissao da maria de 2%
		maria.setTaxaComissao(0.2);

		// aqui pega a venda bruta da maria, adiciona comissao dela junto ao salario
		maria.rendimentos(15000.0);
		
		
		System.out.println(maria.getRendimentos());
	}
}
