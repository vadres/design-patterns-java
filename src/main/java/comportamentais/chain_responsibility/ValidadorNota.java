package comportamentais.chain_responsibility;

import java.util.logging.Logger;

import static java.util.Objects.nonNull;

public class ValidadorNota extends Validador {
	private static final Logger logger = Logger.getLogger(ValidadorNota.class.getName());

	@Override
	public void validar(Titulo titulo) {
		logger.info("VALIDANDO NOTA");
		if (nonNull(proximo)) {
			proximo.validar(titulo);
		}
	}
}
