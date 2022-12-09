package criacionais.factory_method;

import java.math.BigDecimal;

public class TituloCompras implements Titulo {
	@Override
	public void operacao(BigDecimal valor) {
		System.out.println("Operação compras");
	}
}
