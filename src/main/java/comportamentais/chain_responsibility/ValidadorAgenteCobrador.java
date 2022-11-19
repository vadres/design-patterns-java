package comportamentais.chain_responsibility;

import java.util.logging.Logger;

import static java.util.Objects.nonNull;

public class ValidadorAgenteCobrador extends Validador {
	private static final Logger logger = Logger.getLogger(ValidadorAgenteCobrador.class.getName());

	@Override
	public void validar(Titulo titulo) {
		logger.info("VALIDANDO AGENTE COBRADOR");
		if (nonNull(proximo)) {
			proximo.validar(titulo);
		}
	}
}
