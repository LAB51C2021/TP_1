package Dominio;

public class GeneroMusical implements IGenero {
	
	private TiposGeneros tipo;
    private String descripcion;
    
    
	public GeneroMusical(String descripcion) {
		this.tipo = TiposGeneros.Musical;
		this.descripcion = descripcion;
	}

	@Override
	public String GetGeneroDescripcion() {
		// TODO Auto-generated method stub
		return this.descripcion;
	}

	@Override
	public TiposGeneros GetTipoGenero() {
		// TODO Auto-generated method stub
		return this.tipo;
	}
}
