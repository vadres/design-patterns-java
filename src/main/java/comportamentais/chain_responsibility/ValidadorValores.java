package comportamentais.chain_responsibility;

import java.util.logging.Logger;

import static java.util.Objects.nonNull;

public class ValidadorValores extends Validador{
	private static final Logger logger = Logger.getLogger(ValidadorValores.class.getName());
	@Override
	public void validar(Titulo titulo) {
		logger.info("VALIDANDO VALORES");
		if (nonNull(proximo)) {
			proximo.validar(titulo);
		}
	}
}
