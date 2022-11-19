package comportamentais.chain_responsibility;

public abstract class Validador {
	protected Validador proximo;

	abstract void validar(Titulo titulo);

	public Validador proximo(Validador validador) {
		proximo = validador;
		return proximo;
	}
}
