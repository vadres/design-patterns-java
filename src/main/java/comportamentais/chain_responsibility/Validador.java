package comportamentais.chain_responsibility;

public abstract class Validador {
	protected Validador proximo;

	abstract void validar(Pedido pedido);

	public Validador proximo(Validador validador) {
		proximo = validador;
		return proximo;
	}
}
