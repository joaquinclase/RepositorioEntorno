package modelo;
/**
 * clase moto que hereda de vehiculo
 * @author daniel.salas
 *
 */
public class Moto extends Vehiculo{
	private String tipoDeMoto;
	private int numeroDeRuedas;
	/**
	 * constructor por defecto
	 */
	public Moto() {
		this.marca="";
		this.modelo="";
		this.color="";
		this.tipoDeCombustible="";
		this.cilindrada=0;
		this.numeroDePlazas=0;
		this.categoriaAmbiental="";
		this.tipoDeMoto="";
		this.numeroDeRuedas=0;
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
	 * @param tipoDeMoto
	 * @param numeroDeRuedas
	 */
	public Moto(String marca, String modelo, String color, String tipoDeCombustible, Integer cilindrada,
			Integer numeroDePlazas, String categoriaAmbiental,String tipoDeMoto,int numeroDeRuedas) {
		super(marca, modelo, color, tipoDeCombustible, cilindrada, numeroDePlazas, categoriaAmbiental);
		this.tipoDeMoto=tipoDeMoto;
		this.numeroDeRuedas=numeroDeRuedas;
		
	}
	/**
	 * devuelve el tipo de moto
	 * @return tipoDeMoto,que es un string
	 */
	public String getTipoDeMoto() {
		return tipoDeMoto;
	}
	/**
	 * establece el tipo de moto
	 * @param tipoDeMoto
	 */
	public void setTipoDeMoto(String tipoDeMoto) {
		this.tipoDeMoto = tipoDeMoto;
	}
	/**
	 * devuelve el numero de ruedas
	 * @return numeroDeRuedas,que es un entero
	 */
	public Integer getNumeroDeRuedas() {
		return numeroDeRuedas;
	}
	/**
	 * establece el numero de ruedas
	 * @param numeroDeRuedas
	 */
	public void setNumeroDeRuedas(Integer numeroDeRuedas) {
		this.numeroDeRuedas = numeroDeRuedas;
	}
	

}
