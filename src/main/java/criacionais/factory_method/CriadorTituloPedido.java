package criacionais.factory_method;

public class CriadorTituloPedido implements CriadorTitulo {
	@Override
	public Titulo criarTitulo() {
		return new TituloPedido();
	}
}
