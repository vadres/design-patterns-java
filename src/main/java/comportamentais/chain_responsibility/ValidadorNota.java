package comportamentais.chain_responsibility;

import static java.util.Objects.nonNull;

public class ValidadorNota extends Validador {

	@Override
	public void validar(Pedido pedido) {
		System.out.println("VALIDANDO NOTA");
		if (nonNull(proximo)) {
			proximo.validar(pedido);
		}
	}
}
