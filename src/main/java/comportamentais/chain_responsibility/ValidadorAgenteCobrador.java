package comportamentais.chain_responsibility;

import static java.util.Objects.nonNull;

public class ValidadorAgenteCobrador extends Validador {
	@Override
	public void validar(Pedido pedido) {
		System.out.println("VALIDANDO AGENTE COBRADOR");
		if (nonNull(proximo)) {
			proximo.validar(pedido);
		}
	}
}
