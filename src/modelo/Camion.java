package modelo;
/**
 * clase camion que hereda de vehiculo
 * @author daniel.salas
 *
 */
public class Camion extends Vehiculo {
	private int taraMaxima;
	private int galibo;
	/**
	 * constructor por parametros
	 */
	public Camion(){
		this.marca="";
		this.modelo="";
		this.color="";
		this.tipoDeCombustible="";
		this.cilindrada=0;
		this.numeroDePlazas=0;
		this.categoriaAmbiental="";
		this.taraMaxima=0;
		this.galibo=0;
		
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
	 * @param taraMaxima
	 * @param galibo
	 */
	public Camion(String marca, String modelo, String color, String tipoDeCombustible, Integer cilindrada,
			Integer numeroDePlazas, String categoriaAmbiental,int taraMaxima,int galibo) {
		super(marca, modelo, color, tipoDeCombustible, cilindrada, numeroDePlazas, categoriaAmbiental);
		this.taraMaxima=taraMaxima;
		this.galibo=galibo;
	}
	/**
	 * devuelve la taramaxima
	 * @return taraMaxima,que es un entero
	 */
	public int getTaraMaxima() {
		return taraMaxima;
	}
	/**
	 * establece la taramaxima
	 * @param taraMaxima
	 */
	public void setTaraMaxima(int taraMaxima) {
		this.taraMaxima = taraMaxima;
	}
	/**
	 * devuelve el galibo
	 * @return galibo,que es un entero
	 */
	public int getGalibo() {
		return galibo;
	}
	/**
	 * establece el galibo
	 * @param galibo
	 */
	public void setGalibo(int galibo) {
		this.galibo = galibo;
	}
	

}
