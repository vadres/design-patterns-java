package estruturais.composite;

import java.math.BigDecimal;

public class Farinha implements Produto {
	@Override
	public BigDecimal preco() {
		return BigDecimal.valueOf(14d);
	}
}
