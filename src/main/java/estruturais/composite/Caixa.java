package estruturais.composite;

import java.math.BigDecimal;
import java.util.List;

public class Caixa implements Produto {
	private final List<Produto> produtos;
	
	public Caixa(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public BigDecimal preco() {
		return produtos.stream().map(Produto::preco)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
}
