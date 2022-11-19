package estruturais.composite;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class Application {
	private static final Logger logger = Logger.getLogger(Application.class.getName());

	public static void main(String[] args) {
		List<Produto> produtos = new LinkedList<>();
		produtos.add(new Arroz());
		produtos.add(new Farinha());

		Caixa caixa = new Caixa(produtos);
		logger.info(() -> caixa.preco().toString());
	}
}
