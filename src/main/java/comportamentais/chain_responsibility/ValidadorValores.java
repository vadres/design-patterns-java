package comportamentais.chain_responsibility;

import static java.util.Objects.nonNull;

public class ValidadorValores extends Validador{

	@Override
	public void validar(Pedido pedido) {
		System.out.println("VALIDANDO VALORES");
		if (nonNull(proximo)) {
			proximo.validar(pedido);
		}
	}
}
