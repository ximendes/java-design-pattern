package State;

import strategyImposto.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado não pode ser aprovado");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está em estado de reprovação");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = StatusOrcamento.FINALIZADO;

	}

}
