package modelo;
/**
 * clase autobus que hereda de vehiculo
 * @author daniel.salas
 *
 */
public class Autobus extends Vehiculo {
	private boolean publico;
	private boolean urbano;
	private boolean articulado;
	/**
	 * contructor por defecto
	 */
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
	/**
	 * Constructor por parametros
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param tipoDeCombustible
	 * @param cilindrada
	 * @param numeroDePlazas
	 * @param categoriaAmbiental
	 * @param publico
	 * @param urbano
	 * @param articulado
	 */
	public Autobus(String marca, String modelo, String color, String tipoDeCombustible, Integer cilindrada,
			Integer numeroDePlazas, String categoriaAmbiental,boolean publico,boolean urbano,boolean articulado) {
		super(marca, modelo, color, tipoDeCombustible, cilindrada, numeroDePlazas, categoriaAmbiental);
		this.publico=publico;
		this.urbano=urbano;
		this.articulado=articulado;
		
	}
	/**
	 * Devuelve si es autobus es publico o no
	 * @return publico,que es un booelan
	 */
	public boolean isPublico() {
		return publico;
	}
	/**
	 * Establece si el autobus es publico o no
	 * @param publico
	 */
	public void setPublico(boolean publico) {
		this.publico = publico;
	}
	/**
	 * devuelve si el autobus es urbano o no
	 * @return urbano,que es un boolean
	 */
	public boolean isUrbano() {
		return urbano;
	}
	/**
	 * establece si el autobus es urbano o no
	 * @param urbano
	 */
	public void setUrbano(boolean urbano) {
		this.urbano = urbano;
	}
	/**
	 * devuelve si el autobus es articulado o no
	 * @return articulado,que es un boolean
	 */
	public boolean isArticulado() {
		return articulado;
	}
	/**
	 * Establece si es articulado o no
	 * @param articulado
	 */
	public void setArticulado(boolean articulado) {
		this.articulado = articulado;
	}
	
}
