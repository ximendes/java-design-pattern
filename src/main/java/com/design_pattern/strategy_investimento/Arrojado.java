package com.design_pattern.strategy_investimento;

import java.util.Random;

public class Arrojado implements Investimento {

	private Random random;

	public Arrojado() {
		this.random = new Random();
	}

	@Override
	public double aplica(Conta conta) {
		int chute = random.nextInt(10);

		if (chute >= 0 && chute <= 1) {
			return retornaLucro(conta.getSaldo() * 0.05);
		} else if (chute >= 2 && chute <= 4) {
			return retornaLucro(conta.getSaldo() * 0.03);
		} else {
			return retornaLucro(conta.getSaldo() * 0.006);
		}
	}
}
