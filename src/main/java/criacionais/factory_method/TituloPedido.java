package criacionais.factory_method;

import java.math.BigDecimal;

public class TituloPedido implements Titulo {
	@Override
	public void operacao(BigDecimal valor) {
		System.out.println("Operação Pedido");
	}
}
