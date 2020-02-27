package modelo;
/**
 * Clase padre de las que heredan las demas
 * @author daniel.salas
 *
 */
public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected String color;
	protected String tipoDeCombustible;
	protected int cilindrada;
	protected int numeroDePlazas;
	protected String categoriaAmbiental;
	/**
	 * constructor por defecto
	 */
	public Vehiculo() {
		this.marca="";
		this.modelo="";
		this.color="";
		this.tipoDeCombustible="";
		this.cilindrada=0;
		this.numeroDePlazas=0;
		this.categoriaAmbiental="";
	}
	/**
	 * constructor por parametros
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param tipoDeCombustible
	 * @param cilindrada
	 * @param numeroDePlazas
	 * @param categoriaAmbiental
	 */
	public Vehiculo(String marca, String modelo, String color, String tipoDeCombustible, int cilindrada,int numeroDePlazas, String categoriaAmbiental) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipoDeCombustible = tipoDeCombustible;
		this.cilindrada = cilindrada;
		this.numeroDePlazas = numeroDePlazas;
		this.categoriaAmbiental = categoriaAmbiental;
	}
	/**
	 * devuelve la marca
	 * @return marca,que es un string
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * establece la marca
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * devuelve el modelo
	 * @return modelo,que es un string
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * establece el modelo
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * devuelve el color
	 * @return color,que es un string
	 */
	public String getColor() {
		return color;
	}
	/**
	 * establece el color
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * devuelve el tipo de combustible
	 * @return tipoDeCombustible,que es un string
	 */
	public String getTipoDeCombustible() {
		return tipoDeCombustible;
	}
	/**
	 * establece el tipo de combustible
	 * @param tipoDeCombustible
	 */
	public void setTipoDeCombustible(String tipoDeCombustible) {
		this.tipoDeCombustible = tipoDeCombustible;
	}
	/**
	 * devuelve la cilindrada
	 * @return cilindrada,que es un entero
	 */
	public Integer getCilindrada() {
		return cilindrada;
	}
	/**
	 * establece la cilindrada
	 * @param cilindrada
	 */
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}
	/**
	 * devuelve el numero de plazas
	 * @return numeroDePlazas, que es un entero
	 */
	public Integer getNumeroDePlazas() {
		return numeroDePlazas;
	}
	/**
	 * establece el numero de plazas
	 * @param numeroDePlazas
	 */
	public void setNumeroDePlazas(Integer numeroDePlazas) {
		this.numeroDePlazas = numeroDePlazas;
	}
	/**
	 * devuelve la categoria ambiental
	 * @return categoriaAmbiental,que es un string
	 */
	public String getCategoriaAmbiental() {
		return categoriaAmbiental;
	}
	/**
	 * establece la categoria ambiental
	 * @param categoriaAmbiental
	 */
	public void setCategoriaAmbiental(String categoriaAmbiental) {
		this.categoriaAmbiental = categoriaAmbiental;
	}
	
	
	

}
