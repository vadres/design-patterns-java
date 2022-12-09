package criacionais.factory_method;

public class CriadorTituloCompras implements CriadorTitulo {
	@Override
	public Titulo criarTitulo() {
		return new TituloCompras();
	}
}
