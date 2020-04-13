package br.com.alura.argentum.indicadores;

import br.com.alura.argentum.modelo.SerieTemporal;

public class MediaMovelPonderada implements Indicador {

	@Override
	public double calcula(int posicao, SerieTemporal serie) {
		double soma = 0;
		int peso = 3;

		for (int i = posicao; i > posicao - 3; i--) {
			soma += serie.getCandle(i).getFechamento() * peso;
			peso--;
		}
		return soma / 6;
	}

	@Override
	public String toString() {
		return "MMP - Fechamento";
	}
}
