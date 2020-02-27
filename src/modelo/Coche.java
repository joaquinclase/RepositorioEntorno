package modelo;
/**
 * Clase coche que hereda de vehiculo
 * @author daniel.salas
 *
 */
public class Coche extends Vehiculo {
	private int numeroDePuertas;
	private boolean descapotable;
	/**
	 * Constructor por defecto
	 */
	public Coche() {
		this.marca="";
		this.modelo="";
		this.color="";
		this.tipoDeCombustible="";
		this.cilindrada=0;
		this.numeroDePlazas=0;
		this.categoriaAmbiental="";
		this.numeroDePuertas=0;
		this.descapotable=false;
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
	 * @param numeroDePuertas
	 * @param descapotable
	 */
	public Coche(String marca, String modelo, String color, String tipoDeCombustible, Integer cilindrada,
			Integer numeroDePlazas,String categoriaAmbiental,int numeroDePuertas,boolean descapotable){
		super(marca, modelo, color, tipoDeCombustible, cilindrada, numeroDePlazas, categoriaAmbiental);
		this.numeroDePuertas=numeroDePuertas;
		this.descapotable=descapotable;
	}
	/**
	 * Devuelve el numero de puertas
	 * @return numeroDePuertas,que es un entero
	 */
	public Integer getNumeroDePuertas() {
		return numeroDePuertas;
	}
	/**
	 * Establece el numero de puertas
	 * @param numeroDePuertas
	 */
	public void setNumeroDePuertas(Integer numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}
	/**
	 * Devuelve si es verdad que es descapotable o no
	 * @return descapotable,que es un boolean
	 */
	public boolean isDescapotable() {
		return descapotable;
	}
	/**
	 * Establece si es descapotable o no
	 * @param descapotable
	 */
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	
	

}
