package estruturais.composite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Produto> listaArroz = new LinkedList<>();
		listaArroz.add(new Arroz());
		listaArroz.add(new Arroz());
		Caixa caixaArroz = new Caixa(listaArroz);

		List<Produto> listaFarinha = new LinkedList<>();
		listaArroz.add(new Farinha());
		listaArroz.add(new Farinha());
		Caixa caixaFarinha = new Caixa(listaFarinha);

		Caixa caixa = new Caixa(Arrays.asList(caixaFarinha, caixaArroz));
		System.out.println(caixa.preco());
	}
}
