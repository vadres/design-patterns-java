package comportamentais.chain_responsibility;

import java.util.logging.Logger;

import static java.util.Objects.nonNull;

public class ValidadorParcelas extends Validador {
	private static final Logger logger = Logger.getLogger(ValidadorParcelas.class.getName());

	@Override
	public void validar(Titulo titulo) {
		logger.info("VALIDANDO PARCELAS");
		if (nonNull(proximo)) {
			proximo.validar(titulo);
		}
	}
}
