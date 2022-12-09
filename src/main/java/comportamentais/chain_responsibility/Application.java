package comportamentais.chain_responsibility;

import java.math.BigDecimal;

public class Application {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(BigDecimal.valueOf(1023.5D), 980184582L);

		Validador validador = new ValidadorAgenteCobrador();

		validador.proximo(new ValidadorValores())
				.proximo(new ValidadorNota());

		validador.validar(pedido);
	}
}
