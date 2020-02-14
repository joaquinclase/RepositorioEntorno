package modelo;

public class Autobus extends Vehiculo {
	private boolean publico;
	private boolean urbano;
	private boolean articulado;
	public Autobus() {
		this.marca="";
		this.modelo="";
		this.color="";
		this.tipoDeCombustible="";
		this.cilindrada=0;
		this.numeroDePlazas=0;
		this.categoriaAmbiental="";
		this.publico=true;
		this.urbano=true;
		this.articulado=true;
	}
	public Autobus(String marca, String modelo, String color, String tipoDeCombustible, Integer cilindrada,
			Integer numeroDePlazas, String categoriaAmbiental,boolean publico,boolean urbano,boolean articulado) {
		super(marca, modelo, color, tipoDeCombustible, cilindrada, numeroDePlazas, categoriaAmbiental);
		this.publico=publico;
		this.urbano=urbano;
		this.articulado=articulado;
		
	}
	public boolean isPublico() {
		return publico;
	}
	public void setPublico(boolean publico) {
		this.publico = publico;
	}
	public boolean isUrbano() {
		return urbano;
	}
	public void setUrbano(boolean urbano) {
		this.urbano = urbano;
	}
	public boolean isArticulado() {
		return articulado;
	}
	public void setArticulado(boolean articulado) {
		this.articulado = articulado;
	}
	
}
