package estruturais.composite;

import java.math.BigDecimal;

public class Arroz implements Produto {
	@Override
	public BigDecimal preco() {
		return BigDecimal.valueOf(10.50d);
	}
}
